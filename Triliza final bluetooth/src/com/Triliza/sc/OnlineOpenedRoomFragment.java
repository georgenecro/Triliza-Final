package com.Triliza.sc;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import net.pt.Protocol;

import com.Triliza.Controller;
import com.Triliza.GameType;
import com.Triliza.gbg.GameFieldActivity;
import com.Triliza.online.OnlineRoomsActivity;
import com.Triliza1.R;
import com.config.BundleKeys;
import com.entity.Player;
import com.entity.TypeOfMove;
import com.net.online.WorkerOnlineConnection;
import com.utils.Loger;

public class OnlineOpenedRoomFragment extends Fragment implements IOnlineOpenedRoomAction {
    private List<Player> mListActivityPlayer = new ArrayList<Player>();
    private List<Player> mListWantToPlayPlayer = new ArrayList<Player>();
    private OnlinePlayersAdapter mAdapterForActivityList;
    private ArrayAdapter mAdapterForWantPlayList;
    private WorkerOnlineConnection mWorkerOnlineConnection;
    private Player mMyPlayer;
    private int mMyGroupId;


    @SuppressWarnings("ConstantConditions")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.online_opened_room_fragment, null);
        initAdapters(view);
        Intent intent = getActivity().getIntent();
        mMyGroupId = intent.getIntExtra(OnlineRoomsActivity.NUMBER_OF_GROUP, -10);
        mMyPlayer = Controller.getInstance().getPlayer();
        mWorkerOnlineConnection = Controller.getInstance().getOnlineWorker();
        if (mWorkerOnlineConnection != null) {
            mWorkerOnlineConnection.sendPacket(Protocol.SEnterToGroup.newBuilder()
                    .setGroupId(mMyGroupId).build());

        }
        return view;
    }

    private void initAdapters(View view) {
        mAdapterForActivityList = new OnlinePlayersAdapter(getActivity(), mListActivityPlayer);
        mAdapterForWantPlayList = new WantedToPlayAdapter(getActivity(), R.layout.wanted_buttle_list_item,
                mListWantToPlayPlayer);
        ListView lvActivityPlayer = (ListView) view.findViewById(R.id.list_activity_players);
        lvActivityPlayer.setAdapter(mAdapterForActivityList);
        ListView lvWantPlayPlayer = (ListView) view.findViewById(R.id.list_player_witch_want_to_play);
        lvWantPlayPlayer.setAdapter(mAdapterForWantPlayList);
        lvWantPlayPlayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Player p = mListWantToPlayPlayer.get(i);
                if (p != null)
                    mWorkerOnlineConnection.sendPacket(Protocol.SWantToPlay.newBuilder()
                            .setOpponentId(p.getId()).setPlayerId(mMyPlayer.getId())
                            .build());
            }
        });
    }

    private void generateTestData() {
        for (int i = 1; i <= 50; i++) {
            Player player = new Player();
            player.setName("player " + i);
            mListWantToPlayPlayer.add(player);
        }
    }

    private void startOnlineGame(Protocol.CStartGame cStartGame) {
        Player opponent = null;
        for (Player player : mListWantToPlayPlayer) {
            if (player.getId() == cStartGame.getOpponentId()) {
                opponent = player;
                opponent.setNumOfAllWonGame(cStartGame.getNumberOfLostGame());
                break;
            }
        }
        Intent intent = new Intent(getActivity(), GameFieldActivity.class);
        intent.putExtra(BundleKeys.TYPE_OF_GAME, GameType.ONLINE);
        intent.putExtra(BundleKeys.OPPONENT, opponent);
        intent.putExtra(BundleKeys.TYPE_OF_MOVE, (cStartGame.getTypeMove() == Protocol.TypeMove.X)
                ? TypeOfMove.X : TypeOfMove.O);
        startActivity(intent);
        getActivity().finish();
    }

    private void clearAllListView() {
        mListActivityPlayer.clear();
        mListWantToPlayPlayer.clear();
        mAdapterForActivityList.notifyDataSetChanged();
        mAdapterForWantPlayList.notifyDataSetChanged();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mWorkerOnlineConnection != null) {
            mWorkerOnlineConnection.sendPacket(Protocol.SGetUpdate.newBuilder()
                    .setId(Controller.getInstance().getPlayer().getId()).setGroupId(mMyGroupId).build());
        }
    }

    @Override
    public void onDestroy() {
        clearAllListView();
        super.onDestroy();
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void updateAboutActivityPlayer(Message msg) {
        getView().findViewById(R.id.ll_updating_group).setVisibility(View.GONE);
        Protocol.CUpdateAboutActivityPlayer cActivityPlayer =
                (Protocol.CUpdateAboutActivityPlayer) msg.obj;
        for (Protocol.Player player : cActivityPlayer
                .getNewPlayerList()) {
            Loger.printLog("updateAboutActivityPlayer NewPlayerList()+ " + player.getName());
            if (player.getId() != -1)
                mListActivityPlayer.add(new Player(player.getId(),
                        player.getName(), player.getRating()));
        }
        for (Protocol.CExitFromGroup exitFromGroup : cActivityPlayer
                .getExitPlayerList()) {
            Loger.printLog("updateAboutActivityPlayer exitFromGroup  " + exitFromGroup.getPlayerId());
            int id = exitFromGroup.getPlayerId();
            for (Player player : mListActivityPlayer)
                if (player.getId() == id) {
                    mAdapterForActivityList.removePlayer(player);
                    break;
                }
            for (Player player : mListWantToPlayPlayer)
                if (player.getId() == id) {
                    mListWantToPlayPlayer.remove(player);
                    break;
                }
        }
        mAdapterForActivityList.notifyDataSetChanged();
        mAdapterForWantPlayList.notifyDataSetChanged();
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void wantToPlay(Message msg) {
        Protocol.CWantToPlay wantToPlay = (Protocol.CWantToPlay) msg.obj;
        int opponentId = wantToPlay.getOpponentId();
        Player opponent = null;
        for (Player player : mListActivityPlayer)
            if (player.getId() == opponentId) {
                mListWantToPlayPlayer.add(player);
                opponent = player;
            }
        mAdapterForWantPlayList.notifyDataSetChanged();
        Toast.makeText(getActivity(), getResources().getString(R.string.player)
                + " " + opponent.getName() + " " +
                getResources().getString(R.string.want_to_battle_with_you), Toast.LENGTH_SHORT).show();

    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void startGame(Message msg) {
        Protocol.CStartGame startGamePacket = (Protocol.CStartGame) msg.obj;
        mMyPlayer.setNumOfAllWonGame(startGamePacket.getNumberOfWonGame());
        startOnlineGame(startGamePacket);
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void cancelPlayDesire(Message msg) {
        Protocol.CCancelDesirePlay cCancelDesirePlay = (Protocol.CCancelDesirePlay) msg.obj;
        int id = cCancelDesirePlay.getOpponentId();
        Player canceledPlayer = null;
        for (Player player : mListWantToPlayPlayer) {
            if (player.getId() == id) {
                canceledPlayer = player;
                mListWantToPlayPlayer.remove(player);
                mAdapterForWantPlayList.notifyDataSetChanged();
            }
        }
        Toast.makeText(getActivity(), getString(R.string.player) + " "
                + canceledPlayer.getName() + " "
                + getResources().getString(R.string.canceled_inviting), Toast.LENGTH_SHORT).show();

    }

    @Override
    public List<Player> getListActivePlayer() {
        return mListActivityPlayer;
    }

    private static class WantedToPlayAdapter extends ArrayAdapter<Player> {
        private LayoutInflater layoutInflater;
        private int resourcesForInflate;
        private List<Player> players;

        private WantedToPlayAdapter(Context context, int textViewResourceId, List<Player> listPlayers) {
            super(context, textViewResourceId, listPlayers);
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.players = listPlayers;
            this.resourcesForInflate = textViewResourceId;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = layoutInflater.inflate(resourcesForInflate, parent, false);
            }
            TextView textView = (TextView) convertView;
            if (textView != null) {
                textView.setText(players.get(position).getName() + " " + players.get(position).getRating());
            }
            return convertView;
        }
    }
}
