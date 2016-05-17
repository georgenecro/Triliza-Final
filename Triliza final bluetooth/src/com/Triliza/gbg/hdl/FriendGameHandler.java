package com.Triliza.gbg.hdl;

import java.util.List;
import android.widget.TextView;

import com.Triliza.GameType;
import com.Triliza.gbg.GameFieldActivityAction;
import com.Triliza.gbg.GameFieldAdapter;
import com.Triliza.gbg.GameFieldItem;
import com.Triliza1.R;
import com.entity.OneMove;
import com.entity.Player;
import com.entity.TypeOfMove;

public class FriendGameHandler extends GlobalHandler implements IGameHandler {


    public FriendGameHandler(Player player, Player opponent, GameFieldActivityAction activityAction) {
        super(player, opponent, activityAction);
    }

    @Override
    public void sendMessage(String message) {
    }

    @Override
    public GameType getGameType() {
        return GameType.FRIEND;
    }



    @Override
    public List<OneMove> performedOneMove(OneMove oneMove) {
        List<OneMove> list = gameFieldWinLineHandler.oneMove(oneMove);
        if (list != null) {
            wonGame(list);
        }
        return list;
    }

    @Override
    public GameFieldItem.FieldType occurredMove(int i, int j) {
        GameFieldItem.FieldType type = null;
        OneMove oneMove = null;
        if (indicator == FIRST_PLAYER) {
            type = (player.getMoveType() == TypeOfMove.X) ? GameFieldItem.FieldType.X : GameFieldItem.FieldType.O;
            oneMove = new OneMove(i, j, player.getMoveType());
        } else if (indicator == SECOND_PLAYER) {
            type = (opponent.getMoveType() == TypeOfMove.X) ? GameFieldItem.FieldType.X : GameFieldItem.FieldType.O;
            oneMove = new OneMove(i, j, opponent.getMoveType());
        }
        gameFieldAdapter.showOneMove(oneMove);
        performedOneMove(oneMove);
        changeIndicator();
        return type;
    }

    @Override
    public void setAdapter(GameFieldAdapter adapter) {
        this.gameFieldAdapter = adapter;

    }

    public void setPlayer1TextView(TextView player1TexView) {
        this.tvPlayer1Name = player1TexView;
        this.tvPlayer1Name.setText(player.getName());

    }

    @Override
    public void setPlayer2TextView(TextView player2TexView) {
        this.tvPlayer2Name = player2TexView;
        this.tvPlayer2Name.setText(opponent.getName());
    }

    @Override
    public void setPlayer1ScoreTextView(TextView score1TexView) {
        tvPlayer1Score = score1TexView;
    }

    @Override
    public void setPlayer2ScoreTextView(TextView score2TexView) {
        tvPlayer2Score = score2TexView;
    }

    @Override
    public void setTimerTextView(TextView timerTexView) {
        tvTimeInsicator = timerTexView;

    }


    @Override
    public void initIndicator() {
        indicator = FIRST_PLAYER;
        tvPlayer1Name.setBackgroundResource(SELECT_PLAYER_BACKGROUND);
        tvPlayer2Name.setBackgroundResource(R.drawable.button_white);
        player.setMoveType(TypeOfMove.X);
        opponent.setMoveType(TypeOfMove.O);
    }

    @Override
    public void startNewGame() {
        gameFieldWinLineHandler.newGame();
        gameFieldAdapter.startNewGame();
        if (player.getMoveType() == TypeOfMove.X) {
            indicator = SECOND_PLAYER;
            tvPlayer2Name.setBackgroundResource(SELECT_PLAYER_BACKGROUND);
            tvPlayer1Name.setBackgroundResource(R.drawable.button_white);
            player.setMoveType(TypeOfMove.O);
            opponent.setMoveType(TypeOfMove.X);
        } else {
            indicator = FIRST_PLAYER;
            player.setMoveType(TypeOfMove.X);
            opponent.setMoveType(TypeOfMove.O);
            tvPlayer1Name.setBackgroundResource(SELECT_PLAYER_BACKGROUND);
            tvPlayer2Name.setBackgroundResource(R.drawable.button_white);
        }
    }

    @Override
    public void exitFromGame() {
    }

    @Override
    public void setActivityAction(GameFieldActivityAction activityAction) {

    }

    @Override
    public void unregisterHandler() {

    }



}
