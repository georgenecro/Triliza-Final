package com.Triliza.gbg;

import com.Triliza.chat.ChatMessage;
public interface GameFieldActivityAction {

    public void showWonPopup(String wonPlayerName);
    public void opponentExitFromGame();
    public void connectionToServerLost();
    public void receivedChatMessage(ChatMessage chatMessage);


}
