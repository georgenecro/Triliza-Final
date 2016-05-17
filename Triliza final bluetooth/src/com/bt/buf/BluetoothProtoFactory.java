package com.bt.buf;

import com.bt.pt.BluetoothProtocol;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.utils.Loger;


public class BluetoothProtoFactory {
    public static AbstractMessageLite createProtoObject(byte data[],
                                                        BluetoothProtoType type) throws InvalidProtocolBufferException {
        switch (type) {
            case DID_MOVE:
                BluetoothProtocol.DidMove didMove = BluetoothProtocol.DidMove.parseFrom(data);
                return didMove;
            case CONTINUE_GAME:
                BluetoothProtocol.ContinueGame continueGame = BluetoothProtocol.ContinueGame.parseFrom(data);
                return continueGame;
            case CHAT_MESSAGE:
                BluetoothProtocol.ChatMessage chatMessage = BluetoothProtocol.ChatMessage.parseFrom(data);
                return chatMessage;
            default:
                Loger.printLog(" Wrong packet in bluetooth");
                return null;

        }

    }

}
