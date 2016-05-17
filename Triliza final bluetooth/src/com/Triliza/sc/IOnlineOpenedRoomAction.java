package com.Triliza.sc;

import java.util.List;

import android.os.Message;

import com.entity.Player;

public interface IOnlineOpenedRoomAction {

    public void updateAboutActivityPlayer(Message msg);

    public void wantToPlay(Message msg);

    public void startGame(Message msg);

    public void cancelPlayDesire(Message msg);

    public List<Player> getListActivePlayer();

}