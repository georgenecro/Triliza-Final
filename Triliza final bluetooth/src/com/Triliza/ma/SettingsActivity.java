package com.Triliza.ma;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.Triliza.chat.ChatMessage;
import com.Triliza.gbg.GameFieldActivityAction;
import com.Triliza.gbg.GameFieldAdapter;
import com.Triliza.gbg.hdl.FriendGameHandler;
import com.Triliza1.R;
import com.entity.Player;


public class SettingsActivity extends Activity implements GameFieldActivityAction {
    private GridView gridView;
    int scale;
    private GameFieldAdapter gameFieldAdapter;

    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.settings_activity_layout);
        super.onCreate(savedInstanceState);
        com.entity.Player player = new Player();
        player.setName("");
        com.entity.Player opponent1 = new Player();
        opponent1.setName("");
        FriendGameHandler friendGameHandler = new FriendGameHandler(player, opponent1, this);

        gridView = (GridView) findViewById(R.id.grid_view_game_field_2);
        gridView.setAdapter(gameFieldAdapter);

        findViewById(R.id.zoom_plus).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        findViewById(R.id.zoom_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }


    @Override
    public void showWonPopup(String wonPlayerName) {

    }

    @Override
    public void opponentExitFromGame() {

    }

    @Override
    public void connectionToServerLost() {

    }

    @Override
    public void receivedChatMessage(ChatMessage chatMessage) {

    }
}