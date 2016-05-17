package com.bluetooth;
/**
 * Created by Maksym on 6/20/13.
 */

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.bt.buf.BluetoothProtoFactory;
import com.bt.buf.BluetoothProtoType;
import com.bt.pt.BluetoothProtocol;
import com.entity.OneMove;
import com.entity.TypeOfMove;
import com.google.protobuf.AbstractMessageLite;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BluetoothServiceViaProtobuf implements BluetoothService<AbstractMessageLite> {

    private static final String NAME_SECURE = "BluetoothChatSecure";
    private static final String NAME_INSECURE = "BluetoothChatInsecure";
    public static final int MESSAGE_STATE_CHANGE = 1;
    private static final int MAX_QUANTITY_CONNECT = 3;

    private static final UUID MY_UUID_SECURE =
            UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    private static final UUID MY_UUID_INSECURE =
            UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    private boolean D = true;
    public static final String TAG = BluetoothServiceViaProtobuf.class.getCanonicalName();
    private int mState;
    private final BluetoothAdapter mAdapter;
    private List<Handler> handlerList;


    private AcceptThread mSecureAcceptThread;
    private AcceptThread mInsecureAcceptThread;
    private ConnectThread mConnectThread;
    private TransferThread mTransferThread;

    private Handler handler;
    private IBluetoothGameListener bluetoothGameListener;
    private String playerName;
    private int quantityOfAttemptToConnect = 0;

    public BluetoothServiceViaProtobuf(String playerName) {

        mAdapter = BluetoothAdapter.getDefaultAdapter();
        mState = STATE_NONE;
        handler = new Handler(Looper.getMainLooper());
        handlerList = new ArrayList<Handler>();
        this.playerName = playerName;
    }

    @Override
    public void registerListener(IBluetoothGameListener iServiceListener) {
        bluetoothGameListener = iServiceListener;
    }

    @Override
    public void unRegisterListener() {
        bluetoothGameListener = null;
    }

    private synchronized void setState(int state) {
        if (D) Log.d(TAG, "setState() " + mState + " -> " + state);
        mState = state;
        for (Handler mHandler : handlerList)
            mHandler.obtainMessage(MESSAGE_STATE_CHANGE, state, -1).sendToTarget();
    }

    @Override
    public void start() {
        if (D) Log.d(TAG, "start");
        if (mConnectThread != null) {
            mConnectThread.cancel();
            mConnectThread = null;
        }
        if (mTransferThread != null) {
            mTransferThread.cancel();
            mTransferThread = null;
        }
        setState(STATE_LISTENING);

        if (mInsecureAcceptThread != null) {
            mInsecureAcceptThread.cancel();
            mInsecureAcceptThread = null;
        }
        if (mInsecureAcceptThread == null) {
            mInsecureAcceptThread = new AcceptThread(false);
            mInsecureAcceptThread.start();
        }
    }

    @Override
    public void sentPacket(AbstractMessageLite o) {
        mTransferThread.write(o);
    }

    @Override
    public void registerHandler(Handler handler) {
        handlerList.add(handler);
    }

    @Override
    public boolean unRegisterHandler(Handler handler) {
        return handlerList.remove(handler);
    }

    @Override
    public void stop() {
        if (D) Log.d(TAG, "stop");
        if (mConnectThread != null) {
            mConnectThread.cancel();
            mConnectThread = null;
        }
        if (mTransferThread != null) {
            mTransferThread.cancel();
            mTransferThread = null;
        }
        if (mSecureAcceptThread != null) {
            mSecureAcceptThread.cancel();
            mSecureAcceptThread = null;
        }
        if (mInsecureAcceptThread != null) {
            mInsecureAcceptThread.cancel();
            mInsecureAcceptThread = null;
        }
        setState(STATE_NONE);
    }

    @Override
    public int getState() {
        return mState;  
    }
    @Override
    public synchronized void connect(BluetoothDevice device, boolean secure) {
        if (D) Log.d(TAG, "connect to: " + device);
        if (mState == STATE_CONNECTING) {
            if (mConnectThread != null) {
                mConnectThread.cancel();
                mConnectThread = null;
            }
        }
        if (mTransferThread != null) {
            mTransferThread.cancel();
            mTransferThread = null;
        }
        mConnectThread = new ConnectThread(device, secure);
        mConnectThread.start();
        setState(STATE_CONNECTING);
    }


    public synchronized void startTranferThread(BluetoothSocket socket, BluetoothDevice
            device, final String socketType) {
        if (D) Log.d(TAG, "startTranferThread, Socket FieldType:" + socketType);
        if (mConnectThread != null) {
            mConnectThread.cancel();
            mConnectThread = null;
        }
        if (mTransferThread != null) {
            mTransferThread.cancel();
            mTransferThread = null;
        }

        if (mInsecureAcceptThread != null) {
            mInsecureAcceptThread.cancel();
            mInsecureAcceptThread = null;
        }
        mTransferThread = new TransferThread(socket, socketType);
        mTransferThread.start();

        setState(STATE_CONNECTED);
    }

    private void connectionFailed() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (bluetoothGameListener != null) {
                    bluetoothGameListener.connectionFailed();
                }
            }
        });
    }

    private void connectionLost() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (bluetoothGameListener != null) {
                    bluetoothGameListener.playerExitFromGame();
                }
            }
        });
    }


    public class AcceptThread extends Thread {
        private final BluetoothServerSocket mmServerSocket;
        private String mSocketType;

        public AcceptThread(boolean secure) {
            BluetoothServerSocket tmp = null;
            mSocketType = secure ? "Secure" : "Insecure";
            try {
                tmp = mAdapter.listenUsingRfcommWithServiceRecord(
                        NAME_INSECURE, MY_UUID_INSECURE);
            } catch (IOException e) {
                Log.e(TAG, "Socket FieldType: " + mSocketType + "listen() failed", e);
            }
            mmServerSocket = tmp;
        }

        public void run() {
            if (D) Log.d(TAG, "Socket FieldType: " + mSocketType +
                    "BEGIN mAcceptThread" + this);
            setName("AcceptThread" + mSocketType);
            BluetoothSocket socket = null;
            while (mState != STATE_CONNECTED) {
                try {
                    Log.d(TAG, "Socket " + socket + " | ServerSocket " + mmServerSocket);
                    socket = mmServerSocket.accept();
                    Log.d(TAG, "new accepted Socket with " + socket.getRemoteDevice().getName());
                } catch (final Exception e) {
                    Log.e(TAG, "Socket FieldType: " + mSocketType + "accept() failed", e);

                    return;
                }
                if (socket != null) {
                    synchronized (BluetoothServiceViaProtobuf.this) {
                        switch (mState) {
                            case STATE_LISTENING:
                            case STATE_CONNECTING:
                                startTranferThread(socket, socket.getRemoteDevice(),
                                        mSocketType);
                                mState = STATE_CONNECTED;
                                return;
                            case STATE_NONE:
                            case STATE_CONNECTED:
                                try {
                                    socket.close();
                                } catch (IOException e) {
                                    Log.e(TAG, "Could not close unwanted socket", e);
                                }
                                break;
                        }
                    }
                }
            }
            if (D)
                Log.i(TAG, "END mAcceptThread, socket FieldType: " + mSocketType + "  " + BluetoothServiceViaProtobuf.this.getState());
        }

        public void cancel() {
            if (D) Log.d(TAG, "Socket FieldType" + mSocketType + "stop " + this);
            try {
                mmServerSocket.close();
            } catch (IOException e) {
                Log.e(TAG, "Socket FieldType" + mSocketType + "close() of server failed", e);
            }
        }
    }



    private class ConnectThread extends Thread {
        private final BluetoothSocket mmSocket;
        private final BluetoothDevice mmDevice;
        private String mSocketType;
        private boolean secure;


        public ConnectThread(BluetoothDevice device, boolean secure) {
            mmDevice = device;
            BluetoothSocket bluetoothSocketTmp = null;
            this.secure = secure;
            mSocketType = secure ? "Secure" : "Insecure";
            try {
                if (secure) {
                    bluetoothSocketTmp = device.createRfcommSocketToServiceRecord(
                            MY_UUID_SECURE);
                } else {
                    bluetoothSocketTmp = device.createInsecureRfcommSocketToServiceRecord(
                            MY_UUID_INSECURE);
                }
            } catch (IOException e) {
                Log.e(TAG, "Socket FieldType: " + mSocketType + "create() failed", e);

            }
            mmSocket = bluetoothSocketTmp;
        }

        public void run() {
            Log.i(TAG, "BEGIN mConnectThread SocketType:" + mSocketType);
            setName("ConnectThread" + mSocketType);
            mAdapter.cancelDiscovery();

            try {
                mmSocket.connect();

            } catch (final Exception e) {
                Log.e(TAG, "connection failed : ", e);
                if (quantityOfAttemptToConnect++ < MAX_QUANTITY_CONNECT) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    connect(mmDevice, secure);
                } else {
                    connectionFailed();
                }
                return;
            }
            synchronized (BluetoothServiceViaProtobuf.this) {
                mConnectThread = null;
            }
            startTranferThread(mmSocket, mmDevice, mSocketType);
        }

        public void cancel() {
            try {
                mmSocket.close();
            } catch (IOException e) {
                Log.e(TAG, "close() of connect " + mSocketType + " socket failed", e);
            }
        }
    }

    /**
     * This thread runs during a connection with a remote device.
     * It handles all incoming and outgoing transmissions.
     */
    private class TransferThread extends Thread {
        private final BluetoothSocket mmSocket;

        private final DataOutputStream dataOutputStream;
        private final DataInputStream dataInputStream;
        private final InputStream inputStream;
        private boolean isThreadWorking = true;

        public TransferThread(BluetoothSocket socket, String socketType) {
            Log.d(TAG, "create TransferThread: " + socketType);
            mmSocket = socket;
            DataInputStream tempDI = null;
            DataOutputStream tempDO = null;
            InputStream teStream = null;
            try {
                teStream = socket.getInputStream();
                tempDI = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                tempDO = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                Log.e(TAG, "temp sockets not created", e);
            }
            dataOutputStream = tempDO;
            dataInputStream = tempDI;
            inputStream = teStream;
        }

        public void run() {
            Log.i(TAG, "BEGIN mTransferThread");
            sentPacket(BluetoothProtocol.StartGame.newBuilder().setOponentName(playerName).build());
            while (isThreadWorking) {
                try {
                    byte type = dataInputStream.readByte();
                    int length = dataInputStream.readInt();
                    byte data[] = new byte[length];
                    dataInputStream.read(data);
                    final BluetoothProtoType protoType = BluetoothProtoType.fromByte(type);
                    Log.d(TAG, "received  type " + protoType + " t " + type);

                    switch (protoType) {
                        case DID_MOVE:
                            final BluetoothProtocol.DidMove didMove =
                                    BluetoothProtocol.DidMove.parseFrom(data);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    OneMove oneMove = new OneMove(didMove.getI(), didMove.getJ(),
                                            (didMove.getType() == BluetoothProtocol.TypeMove.X)
                                                    ? TypeOfMove.X
                                                    : TypeOfMove.O);
                                    bluetoothGameListener.receivedNewOneMove(oneMove);
                                }
                            });
                            break;
                        case CHAT_MESSAGE:
                            final BluetoothProtocol.ChatMessage chatMessage =
                                    BluetoothProtocol.ChatMessage.parseFrom(data);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    bluetoothGameListener.receivedNewChatMessage(chatMessage.getMessage());
                                }
                            });
                            break;
                        case EXIT_FROM_GAME:
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    bluetoothGameListener.playerExitFromGame();
                                }
                            });
                            break;
                        case STAR_GAME:
                            final BluetoothProtocol.StartGame startGame =
                                    BluetoothProtocol.StartGame.parseFrom(data);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    bluetoothGameListener.startGame(startGame.getOponentName());
                                }
                            });
                            break;
                        case CONTINUE_GAME:
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    bluetoothGameListener.continueGame();
                                }
                            });
                            break;
                        case TIME_FINISHED:
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    bluetoothGameListener.opponentsTimeFinished();
                                }
                            });
                            break;
                    }

                } catch (IOException e) {
                    Log.e(TAG, "disconnected", e);
                    connectionLost();
                    return;
                }
            }
        }

        /**
         * Write to the startTranferThread OutStream.
         */
        public void write(AbstractMessageLite messageLite) {
            byte type = BluetoothProtoType.fromClass(messageLite.getClass()).getByteValue();
            byte data[] = messageLite.toByteArray();
            int length = data.length;
            Log.d(TAG, "send " + " type " + type);
            try {
                dataOutputStream.writeByte(type);
                dataOutputStream.writeInt(length);
                dataOutputStream.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void cancel() {
            isThreadWorking = false;
            try {
                mmSocket.close();
                dataOutputStream.close();
                dataInputStream.close();
            } catch (IOException e) {
                Log.e(TAG, "close() of connect socket failed", e);
            }
        }
    }
}
