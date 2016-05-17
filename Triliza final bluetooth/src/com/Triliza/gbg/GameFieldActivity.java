package com.Triliza.gbg;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import net.pt.Protocol;

import com.Triliza.Controller;
import com.Triliza.GameType;
import com.Triliza.chat.ChatAction;
import com.Triliza.chat.ChatFragment;
import com.Triliza.chat.ChatMessage;
import com.Triliza.chat.IChatActionNotification;
import com.Triliza.gbg.hdl.AndroidGameHandler;
import com.Triliza.gbg.hdl.BluetoothGameHandler;
import com.Triliza.gbg.hdl.FriendGameHandler;
import com.Triliza.gbg.hdl.IGameHandler;
import com.Triliza.gbg.hdl.OnlineGameHandler;
import com.Triliza.ma.GoogleAnalyticsActivity;
import com.Triliza.pp.XOAlertDialog;
import com.Triliza1.R;
import com.bt.pt.BluetoothProtocol;
import com.config.BundleKeys;
import com.entity.Player;
import com.entity.TypeOfMove;

public class GameFieldActivity extends GoogleAnalyticsActivity implements OnClickListener, GameFieldActivityAction, IChatActionNotification {
    public static final String FIRST_PLAYER_NAME = "first_player_name";
    public static final String SECOND_PLAYER_NAME = "second_player_name";
    private static final String OPPONENT_EXIT_FROM_GAME_POPUP_TAG = "opponent_exit_from_game";
    private FragmentTransaction fragmentTransaction;
    private Fragment gameFieldFragment, chatFragment;
    private ChatAction chatAction;
    private Player opponent;

    private enum TAB {GAME, CHAT}
    private Button mButtonOpenGameField;
    private Button openChatButton;
    private Button mButtonnewGame;
    private TAB cureentTab;
    private GameType gameType;
    private Drawable chatDrawable;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        
        chatDrawable  = this.getResources().getDrawable(R.drawable.rounded_rectangle);

        gameType = (GameType) intent.getSerializableExtra(BundleKeys.TYPE_OF_GAME);
        setContentView(R.layout.game_fileld_activity_layout);
        mButtonnewGame = (Button) findViewById(R.id.btn_game_field_new_game);
        mButtonnewGame.setOnClickListener(this);
        mButtonOpenGameField = (Button) findViewById(R.id.btn_opened_online_group);
        openChatButton = (Button) findViewById(R.id.btn_group_chat);
        openChatButton.setOnClickListener(this);

        mButtonOpenGameField.setOnClickListener(this);
        mButtonOpenGameField.setSelected(true);

        String playerName = getString(R.string.player);
        String opponentName = "";
        Player player = new Player();
        Player opponent1 = new Player();
        if (gameType != null) {
            switch (gameType) {
                case ONLINE:
                    Player opponent = (Player) intent.getSerializableExtra(BundleKeys.OPPONENT);
                    this.opponent = opponent;
                    TypeOfMove typeOfMove = (TypeOfMove) intent.getSerializableExtra(BundleKeys.TYPE_OF_MOVE);
                    OnlineGameHandler onlineGameHandler = new OnlineGameHandler(
                            Controller.getInstance().getOnlineWorker(),
                            Controller.getInstance().getPlayer(), opponent, this, (typeOfMove == TypeOfMove.X));
                    Controller.getInstance().setGameHandler(onlineGameHandler);
                    onlineGameHandler.setActivityAction(this);
                    mButtonnewGame.setEnabled(false);
                    mButtonnewGame.setText("");
                    break;
                case FRIEND:
                    if (intent.getStringExtra(FIRST_PLAYER_NAME) != null) {
                        playerName = intent.getStringExtra(FIRST_PLAYER_NAME);
                    }
                    if (intent.getStringExtra(SECOND_PLAYER_NAME) != null) {
                        opponentName = intent.getStringExtra(SECOND_PLAYER_NAME);
                    }
                    player.setName(playerName);
                    opponent1.setName(opponentName);
                    FriendGameHandler friendGameHandler = new FriendGameHandler(player, opponent1, this);
                    Controller.getInstance().setGameHandler(friendGameHandler);
                    Controller.getInstance().setPlayer(player);
                    openChatButton.setEnabled(false);
                    mButtonOpenGameField.setEnabled(false);
                    break;
                case ANDROID:
                    if (intent.getStringExtra(FIRST_PLAYER_NAME) != null) {
                        playerName = intent.getStringExtra(FIRST_PLAYER_NAME);
                    }
                    opponentName = getString(R.string.android);
                    if (intent.getStringExtra(FIRST_PLAYER_NAME) != null) {
                        playerName = intent.getStringExtra(FIRST_PLAYER_NAME);
                    }
                    if (intent.getStringExtra(SECOND_PLAYER_NAME) != null) {
                        opponentName = intent.getStringExtra(SECOND_PLAYER_NAME);
                    }
                    player.setName(playerName);
                    opponent1.setName(opponentName);
                    AndroidGameHandler androidGameHandler = new AndroidGameHandler(player, opponent1, this,
                            this);
                    Controller.getInstance().setGameHandler(androidGameHandler);
                    Controller.getInstance().setPlayer(player);
                    openChatButton.setEnabled(false);
                    openChatButton.setVisibility(View.GONE);
                    mButtonOpenGameField.setEnabled(false);
                    mButtonOpenGameField.setVisibility(View.GONE);
                    break;
                case BLUETOOTH:
                    boolean isFirst = getIntent().getBooleanExtra(BundleKeys.IS_PLAYER_MOVE_FIRST, false);
                    BluetoothGameHandler bluetoothGameHandler = new BluetoothGameHandler(player, opponent1,
                            this, Controller.getInstance().getBluetoothService(), isFirst);
                    if (intent.getStringExtra(BundleKeys.PLAYER_NAME) != null) {
                        playerName = intent.getStringExtra(BundleKeys.PLAYER_NAME);
                    }
                    if (intent.getStringExtra(BundleKeys.OPPONENT_NAME) != null) {
                        opponentName = intent.getStringExtra(BundleKeys.OPPONENT_NAME);
                    }
                    player.setName(playerName);
                    opponent1.setName(opponentName);
                    this.opponent = opponent1;
                    Controller.getInstance().setPlayer(player);
                    Controller.getInstance().setGameHandler(bluetoothGameHandler);
                    break;
            }
        }
        cureentTab = TAB.GAME;
        gameFieldFragment = new GameFieldFragment();
        chatFragment = new ChatFragment();
        chatAction = (ChatAction) chatFragment;
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.center_for_fragment, chatFragment);
        fragmentTransaction.add(R.id.center_for_fragment, gameFieldFragment);
        fragmentTransaction.hide(chatFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void showWonPopup(String wonPlayerName) {
        final XOAlertDialog xoAlertDialog = new XOAlertDialog();
        xoAlertDialog.setTile(wonPlayerName + " " + getResources().getString(R.string.won));
        xoAlertDialog.setMainText(getResources().getString(R.string.are_you_want_continue_game));
        xoAlertDialog.setPositiveButtonText(getResources().getString(R.string.yes));
        xoAlertDialog.setNegativeButtonText(getResources().getString(R.string.no));
        xoAlertDialog.setSleepTimeBeforeShowPopup(500);
        xoAlertDialog.setNegativeListener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        xoAlertDialog.setPositiveListener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                newGame();
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    private void newGame() {
        if (gameFieldFragment != null) {
            IGameFieldFragmentAction iGameFieldFragmentAction = (IGameFieldFragmentAction) gameFieldFragment;
            iGameFieldFragmentAction.beginNewGame();
        }
    }

    @Override
    public void opponentExitFromGame() {
        Fragment popup = getSupportFragmentManager().findFragmentByTag(OPPONENT_EXIT_FROM_GAME_POPUP_TAG);
        if (popup == null || !popup.isAdded()) {
            XOAlertDialog xoAlertDialog = new XOAlertDialog();
            xoAlertDialog.setAlert_type(XOAlertDialog.ALERT_TYPE.ONE_BUTTON);
            xoAlertDialog.setTile(getResources().getString(R.string.opponent_exit_from_this_game));
            String mainText = opponent.getName() + " " + getString(R.string.left_the_game);
            xoAlertDialog.setMainText(mainText);
            xoAlertDialog.setPositiveButtonText(getResources().getString(R.string.ok));
            xoAlertDialog.setPositiveListener(new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            xoAlertDialog.setNegativeListener(new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            xoAlertDialog.show(getSupportFragmentManager(), OPPONENT_EXIT_FROM_GAME_POPUP_TAG);
        }
    }

    @Override
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
    public void receivedChatMessage(ChatMessage chatMessage) {
        if (cureentTab == TAB.GAME) {
            openChatButton.setText(R.string.message);
            openChatButton.setTextColor(getResources().getColor(R.color.white));
            chatDrawable.setColorFilter(Color.parseColor("#0099cc"), Mode.MULTIPLY);
        }
        if (chatAction != null) {
            chatAction.receivedMessage(chatMessage);
        }
    }


    private void switchToTab(TAB tab) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        cureentTab = tab;
        switch (tab) {
            case GAME:
                mButtonOpenGameField.setSelected(true);
                openChatButton.setSelected(false);
                fragmentTransaction.show(gameFieldFragment);
                fragmentTransaction.hide(chatFragment);
                break;
            case CHAT:
                mButtonOpenGameField.setSelected(false);
                openChatButton.setSelected(true);
                fragmentTransaction.show(chatFragment);
                fragmentTransaction.hide(gameFieldFragment);
                break;
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_opened_online_group:
                switchToTab(TAB.GAME);
                break;
            case R.id.btn_group_chat:
                openChatButton.setText(R.string.chat);
                openChatButton.setTextColor(getResources().getColor(R.color.black));
                switchToTab(TAB.CHAT);
                break;
            case R.id.btn_game_field_new_game:
                newGame();
                break;
        }
    }

    private void showExitFromThisGamePopup() {
        XOAlertDialog xoAlertDialog = new XOAlertDialog();
        xoAlertDialog.setTile(getResources().getString(R.string.exit_from_this_game));
        xoAlertDialog.setMainText(getResources().getString(R.string.exit_from_this_game_question));
        xoAlertDialog.setPositiveButtonText(getResources().getString(R.string.yes));
        xoAlertDialog.setNegativeButtonText(getResources().getString(R.string.no));
        xoAlertDialog.setPositiveListener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Controller.getInstance().getGameHandler().exitFromGame();
                finish();
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    @Override
    public void actionSendChatMessage(ChatMessage chatMessage) {
        IGameHandler gameHandler = Controller.getInstance().getGameHandler();
        if (gameHandler.getGameType() == GameType.BLUETOOTH) {
            Controller.getInstance().getBluetoothService().sentPacket(BluetoothProtocol.ChatMessage
                    .newBuilder()
                    .setMessage(chatMessage.getMessage())
                    .build());
        } else if (gameHandler.getGameType() == GameType.ONLINE) {
            Controller.getInstance().getOnlineWorker().sendPacket(Protocol.SChatMessage
                    .newBuilder().setMessage(chatMessage.getMessage())
                    .setOpponentId(opponent.getId())
                    .setPlayerId(Controller.getInstance().getPlayer().getId())
                    .build());
        }
    }

    @Override
    public String getPlayerName() {
        return Controller.getInstance().getPlayer().getName();
    }

    @Override
    public void onBackPressed() {
        if (cureentTab == TAB.CHAT) {
            switchToTab(TAB.GAME);
        } else {
            showExitFromThisGamePopup();
        }
    }

    @Override
    protected void onDestroy() {
        GameFieldItem.destroyAllBitmaps();
        Controller.getInstance().setGameHandler(null);
        if (gameType != GameType.ONLINE) {
            Controller.getInstance().setPlayer(null);
        }
        System.gc();
        super.onDestroy();

    }
}
