package com.bluetooth;

import com.entity.OneMove;

public interface IBluetoothGameListener {
    public void receivedNewChatMessage(String mesage);

    public void receivedNewOneMove(OneMove oneMove);

    public void startGame(String opponentName);

    public void playerExitFromGame();

    public void continueGame();

    public void connectionFailed();

    public void opponentsTimeFinished();
}
