package com.Triliza.online;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import net.pt.Protocol;

import com.Triliza1.R;
import com.entity.Group;

public class OnlineRoomsFragment extends Fragment implements OnlineRoomsFragmentAction {
    public static final String LOG_TAG = OnlineRoomsFragment.class.getCanonicalName();
    public static final String NUMBER_OF_GROUP = "NUMBER_OF_GROUP";
    private List<Group> mGroups;
    private OnlineRoomsAdapter mAdapter;
    private TextView mTextViewAllPlayers;

    @SuppressWarnings("ConstantConditions")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.online_rooms_fragment_layout, null);
        ListView listViewOnlineGroup = (ListView) view.findViewById(R.id.list_online_group);
        mGroups = new ArrayList<Group>();
        mTextViewAllPlayers = (TextView) view.findViewById(R.id.tv_all_online_players);
        mAdapter = new OnlineRoomsAdapter(getActivity(), mGroups);
        listViewOnlineGroup.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void gotGroupList(Object o) {
        getView().findViewById(R.id.ll_updating_rooms_list).setVisibility(View.GONE);
        int numberOfAllPlayers = 0;
        mGroups.clear();
        Protocol.CGetGroupList getGroupList = (Protocol.CGetGroupList) o;
        for (Protocol.Group group : getGroupList.getGroupList()) {
            numberOfAllPlayers += group.getNumOnlinePlayers();
            mGroups.add(new Group(group.getGroupId(), group.getNumOnlinePlayers(), 50));
        }
        Log.d(LOG_TAG, "get  " + mGroups.size() + "  mGroups");
        numberOfAllPlayers += 1;
        mTextViewAllPlayers.setText(getResources().getString(R.string.all_online_players) + " " + numberOfAllPlayers);
        mAdapter.notifyDataSetChanged();
    }
}
