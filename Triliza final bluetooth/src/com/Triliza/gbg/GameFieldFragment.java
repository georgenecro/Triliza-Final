package com.Triliza.gbg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.Triliza.Controller;
import com.Triliza.GameType;
import com.Triliza.gbg.hdl.IGameHandler;
import com.Triliza1.R;

public class GameFieldFragment extends Fragment implements IGameFieldFragmentAction {

    public static final String FIRST_PLAYER_NAME = "first_player_name";
    public static final String SECOND_PLAYER_NAME = "second_player_name";
    private IGameHandler gameHandler;


    @SuppressWarnings("ConstantConditions")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.game_field_fragment_layout, null);
        Intent intent = getActivity().getIntent();
        String firstPlayerName = intent.getStringExtra(FIRST_PLAYER_NAME);
        String secondPlayerName = intent.getStringExtra(SECOND_PLAYER_NAME);
        GridView gridView = (GridView) view.findViewById(R.id.grid_view_game_field);
        TextView textViewPlayer1 = ((TextView) view.findViewById(R.id.tv_field_item));
        textViewPlayer1.setText(firstPlayerName);
        TextView textViewSecond = ((TextView) view.findViewById(R.id.tv_second_player_name));
        textViewSecond.setText(secondPlayerName);
        final LinearLayout containerGameFiled = (LinearLayout) view.findViewById(R.id.game_field_container);
        final FrameLayout frame = (FrameLayout) view.findViewById(R.id.horizontal_scroll_game_field);

        textViewSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        gameHandler = Controller.getInstance().getGameHandler();

        GameFieldAdapter gameFieldAdapter = new GameFieldAdapter(getActivity(), gameHandler, (HorizontalScrollView) view
                .findViewById(R.id.horizontal_scroll_game_field),
                (ScrollView) view.findViewById(R.id.vertical_scroll_game_field));
        gameHandler
                .setPlayer1TextView((TextView) view.findViewById(R.id.tv_field_item));
        gameHandler
                .setPlayer2TextView((TextView) view.findViewById(R.id.tv_second_player_name));
        gameHandler
                .setPlayer1ScoreTextView((TextView) view.findViewById(R.id.tv_score_player_1));
        gameHandler
                .setPlayer2ScoreTextView((TextView) view.findViewById(R.id.tv_score_player_2));
        gameHandler.setTimerTextView((TextView) view.findViewById(R.id.tv_timer));

        if (gameHandler.getGameType() == GameType.FRIEND) {
            view.findViewById(R.id.tv_timer).setVisibility(View.GONE);
            view.findViewById(R.id.tv_sec).setVisibility(View.GONE);
        }
        gameHandler.setAdapter(gameFieldAdapter);
        gridView.setAdapter(gameFieldAdapter);

        gridView.post(new Runnable() {
            @Override
            public void run() {
                gameHandler.initIndicator();
            }
        });
        return view;

    }

    @Override
    public void beginNewGame() {
        gameHandler.startNewGame();
    }

    @Override
    public void onDestroy() {
        gameHandler.unregisterHandler();
        super.onDestroy();
    }
}
