package com.Triliza.online;

import java.util.ArrayList;
import java.util.List;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import net.pt.Protocol;

import com.Triliza.Controller;
import com.Triliza.pp.XOAlertDialog;
import com.Triliza1.R;
import com.entity.Player;
import com.net.online.WorkerOnlineConnection;
import com.net.online.buf.ProtoType;

public class OnlineRoomsActivity extends FragmentActivity implements IOnlineRoomsAction {
    public static final String NUMBER_OF_GROUP = "NUMBER_OF_GROUP";
    private static final String LOG_TAG = OnlineRoomsActivity.class.getCanonicalName();
    private Handler mHandler;
    private WorkerOnlineConnection mConnectionGameWorker;
    private Fragment mOnlineGroupsFragment, mTop100Fragment;
    private FragmentTransaction mFragmentTransaction;
    private Top100Action mTop100Action;
    private final Player mPlayer = Controller.getInstance().getPlayer();
    private OnlineRoomsFragmentAction mOnlineRoomsFragmentAction;
    private Button mButtonGroups;
    private Button mButtonTop100;


    @Override
    public void getListOfGroup() {
        Protocol.SGetGroupList sGetGroupList = Protocol.SGetGroupList.newBuilder().setId(mPlayer.getId()).build();
        mConnectionGameWorker.sendPacket(sGetGroupList);
        Log.d(LOG_TAG, "sent packet " + sGetGroupList);
    }

    private enum TAB {GROUP_LIST, TOP_100}

    ;
    private TAB mCurrentTab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.online_rooms_activity_layout);
        initViews();
        initHandler();
        mConnectionGameWorker = Controller.getInstance().getOnlineWorker();
    }

    private void initViews() {
        mOnlineGroupsFragment = new OnlineRoomsFragment();
        mTop100Fragment = new Top100Fragment();
        mTop100Action = (Top100Action) mTop100Fragment;
        mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        mFragmentTransaction.add(R.id.center_for_fragment, mOnlineGroupsFragment);
        mFragmentTransaction.add(R.id.center_for_fragment, mTop100Fragment);
        mFragmentTransaction.hide(mTop100Fragment);
        mOnlineRoomsFragmentAction = (OnlineRoomsFragmentAction) mOnlineGroupsFragment;
        mFragmentTransaction.commit();
        mCurrentTab = TAB.GROUP_LIST;
        mButtonTop100 = (Button) findViewById(R.id.btn_top_100);
        mButtonTop100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToTab(TAB.TOP_100);
            }
        });
        mButtonGroups = (Button) findViewById(R.id.btn_online_groups);
        mButtonGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToTab(TAB.GROUP_LIST);
            }
        });
        mButtonGroups.setSelected(true);
    }

    private void initHandler() {
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                ProtoType protoType = ProtoType.fromInt(msg.what);
                switch (protoType) {
                    case CGETGROUPLIST:
                        mOnlineRoomsFragmentAction.gotGroupList(msg.obj);
                        break;
                    case CTOP100:
                        Protocol.CTop100Player cTop100Player = (Protocol.CTop100Player) msg.obj;
                        List<Player> playerList = new ArrayList<Player>();
                        for (Protocol.Player protocolPlayer : cTop100Player.getPlayerList()) {
                            playerList.add(new Player(protocolPlayer.getId(), protocolPlayer.getName(), protocolPlayer.getRating()));
                        }
                        mTop100Action.receivedListTop100(playerList);
                        break;
                    case CONNECTION_TO_SERVER_LOST:
                        connectionToServerLost();
                        break;
                    default:
                        break;
                }
                super.handleMessage(msg);
            }
        };
    }


    private void switchToTab(TAB tab) {
        mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        mCurrentTab = tab;
        switch (tab) {
            case GROUP_LIST:
                mButtonGroups.setSelected(true);
                mButtonTop100.setSelected(false);
                mFragmentTransaction.hide(mTop100Fragment);
                mFragmentTransaction.show(mOnlineGroupsFragment);
                break;
            case TOP_100:
                mButtonGroups.setSelected(false);
                mButtonTop100.setSelected(true);
                mFragmentTransaction.hide(mOnlineGroupsFragment);
                mFragmentTransaction.show(mTop100Fragment);
                sendPacketGetTop100List();
                break;
        }
        mFragmentTransaction.commit();
    }

    private void sendPacketGetTop100List() {
        mConnectionGameWorker
                .sendPacket(Protocol
                        .STop100Player
                        .newBuilder()
                        .setPlayerId(mPlayer.getId())
                        .build());
    }

    @Override
    public void onBackPressed() {
        if (mCurrentTab == TAB.TOP_100) {
            switchToTab(TAB.GROUP_LIST);
        } else {
            XOAlertDialog xoAlertDialog = new XOAlertDialog();
            xoAlertDialog.setTile(getResources().getString(R.string.exit_from_online_game));
            xoAlertDialog.setMainText(getResources().getString(R.string.exit_from_game_online_question));
            xoAlertDialog.setPositiveButtonText(getResources().getString(R.string.yes));
            xoAlertDialog.setNegativeButtonText(getResources().getString(R.string.no));
            xoAlertDialog.setPositiveListener(new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            xoAlertDialog.show(getSupportFragmentManager(), "");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!mConnectionGameWorker.isSockedInLive()) {
            finish();
        }
        mConnectionGameWorker.registerHandler(mHandler);
        if (mConnectionGameWorker != null) {
            getListOfGroup();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mConnectionGameWorker != null) {
            mConnectionGameWorker.unRegisterHandler(mHandler);
        }
    }

    public void connectionToServerLost() {
        XOAlertDialog xoAlertDialog = new XOAlertDialog();
        xoAlertDialog.setAlert_type(XOAlertDialog.ALERT_TYPE.ONE_BUTTON);
        xoAlertDialog.setTile(getResources().getString(R.string.connection_to_server_lost));
        String mainText = getString(R.string.please_try_to_connect_once_more);
        xoAlertDialog.setMainText(mainText);
        xoAlertDialog.setPositiveButtonText(getResources().getString(R.string.ok));
        xoAlertDialog.setPositiveListener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    @Override
    protected void onDestroy() {
        if (mConnectionGameWorker == null) return;
        mConnectionGameWorker.sendPacket(Protocol.SExitFromGlobalGame.newBuilder().setPlayerId(mPlayer.getId()).build());
        mConnectionGameWorker.unRegisterHandler(mHandler);
        mConnectionGameWorker.disconnect();
        super.onDestroy();
    }
}
