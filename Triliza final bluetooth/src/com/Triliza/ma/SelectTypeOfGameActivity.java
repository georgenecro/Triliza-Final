package com.Triliza.ma;

import java.util.UUID;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import net.pt.Protocol;

import com.Triliza.Controller;
import com.Triliza.GameType;
import com.Triliza.bt.BluetoothGameActivity;
import com.Triliza.gbg.GameFieldActivity;
import com.Triliza.online.OnlineRoomsActivity;
import com.Triliza.pp.XOAlertDialog;
import com.Triliza1.R;
import com.config.BundleKeys;
import com.entity.Player;
import com.net.online.WorkerOnlineConnection;
import com.net.online.buf.ProtoType;
import com.utils.Loger;
import com.utils.MemoTextWatcher;

public class SelectTypeOfGameActivity extends FragmentActivity implements OnClickListener {

    private static final String LOG_TAG = SelectTypeOfGameActivity.class.getName();
    private static final String KEY_FOR_SHARED_PREFERENCES = SelectTypeOfGameActivity.class.getCanonicalName();
    private static final String FIRST_PLAYER_NAME = "first_player_name";
    private static final String SECOND_PLAYER_NAME = "second_player_name";
    private static final String PLAYER_NAME_FOR_LOGIN_TO_ONLINE_GAME = "player_name_for_login_to_online_game";
    private static final String PLAYER_NAME_FOR_BLUETOOTH_GAME = "player_name_for_bluetooth_game";
    private static final String PLAYER_UUID_FOR_ONLINE_GAME = "player_uuid_for_online_game";

    private SharedPreferences sharedPreferences;
    private String player1NameFromSharedPrefences;
    private String player2NameFromSharedPrefences;
    private String playerNameFromSharedPrefencesForLoginToGame;
    private String playerNameFromSharedPrefencesForBluetoohToGame;
    private String playerUUID;
    private String mUrlForUpdate;

    private Handler handler;
    private ProgressDialog pd;
    private Player player;

    private WorkerOnlineConnection onlineGameWorker;
    private XOAlertDialog anonymousLoginPopup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type_of_game_activity_layout);
        sharedPreferences = getSharedPreferences(KEY_FOR_SHARED_PREFERENCES, MODE_PRIVATE);
        View friend = findViewById(R.id.btn_two_players);
        View settings = findViewById(R.id.btn_quit);
        settings.setOnClickListener(this);
        friend.setOnClickListener(this);
        View bluetooth = findViewById(R.id.btn_bluetooth);
        bluetooth.setOnClickListener(this);
        player = new Player();
        createHandler();
    }


    private void createHandler() {
        handler = new Handler() {
            @SuppressWarnings("ConstantConditions")
            @Override
            public void handleMessage(Message msg) {
                ProtoType protoType = ProtoType.fromInt(msg.what);
                if (msg.what == 100) {
                    pd.cancel();
                    showToastWithText(getString(R.string.server_not_available));
                    return;
                }
                Log.d(LOG_TAG, "handler received message" + protoType);
                switch (protoType) {
                    case CLOGINTOGAME:
                        Protocol.CLoginToGame cLoginToGame = (Protocol.CLoginToGame) msg.obj;
                        int id = cLoginToGame.getId();
                        player.setId(id);
                        Controller.getInstance().setPlayer(player);
                        Loger.printLog("Conected to server with id " + id);
                        pd.cancel();
                        if (anonymousLoginPopup != null) {
                            anonymousLoginPopup.dismiss();
                        }
                        loginToGame();
                        break;
                    case APP_NEED_UPDATE_TO_LAST_VERSION:
                        Protocol.AppNeedUpdateToLastVersion appNeedUpdate = (Protocol.AppNeedUpdateToLastVersion) msg.obj;
                        mUrlForUpdate = appNeedUpdate.getUrlForUpdate();
                        pd.cancel();
                        showNeedAppUpdatePopup();
                        break;

                }
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        player1NameFromSharedPrefences = sharedPreferences.getString(FIRST_PLAYER_NAME, null);
        player2NameFromSharedPrefences = sharedPreferences.getString(SECOND_PLAYER_NAME, null);
        playerNameFromSharedPrefencesForLoginToGame = sharedPreferences.getString(PLAYER_NAME_FOR_LOGIN_TO_ONLINE_GAME, null);
        playerNameFromSharedPrefencesForBluetoohToGame = sharedPreferences.getString(PLAYER_NAME_FOR_BLUETOOTH_GAME, null);
        playerUUID = sharedPreferences.getString(PLAYER_UUID_FOR_ONLINE_GAME, null);
        if (playerUUID != null) player.setUuid(playerUUID);
    }

    private void loginToGame() {
        Intent intent = new Intent(this, OnlineRoomsActivity.class);
        startActivity(intent);
    }

    private void showNeedAppUpdatePopup() {
        final XOAlertDialog xoAlertDialog = new XOAlertDialog();
        anonymousLoginPopup = xoAlertDialog;
        xoAlertDialog.setContent(R.layout.app_need_update_popup_layout);
        xoAlertDialog.setContentInitialization(new XOAlertDialog.IContentInitialization() {
            @Override
            public void onContentItialization(View view) {
                Button updateButton = (Button) view.findViewById(R.id.btn_update_game);
                updateButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mUrlForUpdate));
                        startActivity(browserIntent);
                    }
                });
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    private void showToastWithText(String s) {
        Toast toast = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    private String getAppVersion() {
        PackageInfo pInfo = null;
        try {

            pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return pInfo.versionName;
    }


    public void showTypeOfLoginToGamePopup() {
        final XOAlertDialog xoAlertDialog = new XOAlertDialog();
        xoAlertDialog.setContent(R.layout.login_to_game_popup);
        xoAlertDialog.setContentInitialization(new XOAlertDialog.IContentInitialization() {
            @Override
            public void onContentItialization(View view) {
                view.findViewById(R.id.tv_anonymous).setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showAnonymousPopup();
                        xoAlertDialog.dismiss();
                    }
                });
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    public void showPopupForInputNameOfPlayers() {
        final XOAlertDialog xoAlertDialog = new XOAlertDialog();
        xoAlertDialog.setContent(R.layout.popup_offline_players_name);
        xoAlertDialog.setContentInitialization(new XOAlertDialog.IContentInitialization() {
            @Override
            public void onContentItialization(final View view) {
                EditText playerName1;
                EditText playerName2;
                playerName1 = ((EditText) view.findViewById(R.id.edt_first_player_name));
                playerName2 = ((EditText) view.findViewById(R.id.edt_second_player_name));
                playerName1.addTextChangedListener(new MemoTextWatcher() {
                    @Override
                    protected void showMaxAlert() {
                        String text = getString(R.string.maximum_chars_in_nick_is) + MemoTextWatcher.MAX_CHARACTER_COUNT;
                        Toast.makeText(SelectTypeOfGameActivity.this, text, Toast.LENGTH_SHORT).show();
                    }
                });
                playerName2.addTextChangedListener(new MemoTextWatcher() {
                    @Override
                    protected void showMaxAlert() {
                        String text = getString(R.string.maximum_chars_in_nick_is) + " " + MemoTextWatcher.MAX_CHARACTER_COUNT;
                        Toast.makeText(SelectTypeOfGameActivity.this, text, Toast.LENGTH_SHORT).show();
                    }
                });
                if (player1NameFromSharedPrefences != null) {
                    playerName1.setText(player1NameFromSharedPrefences);
                    playerName2.setText(player2NameFromSharedPrefences);
                }
                view.findViewById(R.id.btn_start_offline_game).setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    	v.setBackgroundColor(Color.parseColor("#0084b0"));
                        Intent intent = new Intent(SelectTypeOfGameActivity.this, GameFieldActivity.class);
                        String name1 = ((EditText) view.findViewById(R.id.edt_first_player_name)).getText().toString();
                        String name2 = ((EditText) view.findViewById(R.id.edt_second_player_name)).getText().toString();
                        intent.putExtra(GameFieldActivity.FIRST_PLAYER_NAME, name1);
                        intent.putExtra(GameFieldActivity.SECOND_PLAYER_NAME, name2);
                        intent.putExtra(BundleKeys.TYPE_OF_GAME, GameType.FRIEND);
                        sharedPreferences.edit().putString(FIRST_PLAYER_NAME, name1).commit();
                        sharedPreferences.edit().putString(SECOND_PLAYER_NAME, name2).commit();
                        startActivity(intent);
                        xoAlertDialog.dismiss();
                    }
                });
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    private void showAnonymousPopup() {
        final XOAlertDialog xoAlertDialog = new XOAlertDialog();
        anonymousLoginPopup = xoAlertDialog;
        xoAlertDialog.setContent(R.layout.input_player_name_popup_layout);
        xoAlertDialog.setContentInitialization(new XOAlertDialog.IContentInitialization() {
            @Override
            public void onContentItialization(View view) {
                final EditText playerNameEditText = (EditText) view.findViewById(R.id.edt_player_name);
                playerNameEditText.addTextChangedListener(new MemoTextWatcher() {
                    @Override
                    protected void showMaxAlert() {
                        String text = getString(R.string.maximum_chars_in_nick_is) + MemoTextWatcher.MAX_CHARACTER_COUNT;
                        Toast.makeText(SelectTypeOfGameActivity.this, text, Toast.LENGTH_SHORT).show();
                    }
                });
                if (playerUUID == null) {
                    playerUUID = generateUUID();
                    sharedPreferences.edit().putString(PLAYER_UUID_FOR_ONLINE_GAME, playerUUID).commit();
                    player.setUuid(playerUUID);
                }
                if (playerNameFromSharedPrefencesForLoginToGame != null)
                    playerNameEditText.setText(playerNameFromSharedPrefencesForLoginToGame);
                else playerNameEditText.setText(getString(R.string.anonym_player));
                view.findViewById(R.id.btn_anonymous_login).setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String playerName = playerNameEditText.getText().toString();
                        if (playerName.length() == 0) {
                            showToastWithText(getString(R.string.please_enter_your_nick_name));
                            return;
                        }
                        sharedPreferences.edit().putString(PLAYER_NAME_FOR_LOGIN_TO_ONLINE_GAME, playerNameFromSharedPrefencesForLoginToGame = playerName).commit();
                        pd = new ProgressDialog(SelectTypeOfGameActivity.this);
                        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
                        if (activeNetwork != null && activeNetwork.isConnected()) {
                            player.setName(playerName);
                            player.setRegistrationType(Protocol.RegistrationType.xo);
                            onlineGameWorker = new WorkerOnlineConnection(handler,
                                    player, pd);
                            Controller.getInstance().setOnlineWorker(onlineGameWorker);
                            onlineGameWorker.start();
                            pd.setTitle(getString(R.string.connection));
                            pd.setMessage(getString(R.string.connecting_server));
                            pd.show();
                        } else
                            showToastWithText(getString(R.string.no_internet_connection));
                    }
                });
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }


    private void showPopupForBluetoothGame() {
        final XOAlertDialog xoAlertDialog = new XOAlertDialog();
        anonymousLoginPopup = xoAlertDialog;
        xoAlertDialog.setContent(R.layout.input_player_name_popup_layout);
        xoAlertDialog.setContentInitialization(new XOAlertDialog.IContentInitialization() {
            @Override
            public void onContentItialization(View view) {
                final EditText playerNameEditText = (EditText) view.findViewById(R.id.edt_player_name);
                playerNameEditText.addTextChangedListener(new MemoTextWatcher() {
                    @Override
                    protected void showMaxAlert() {
                        String text = getString(R.string.maximum_chars_in_nick_is) + " " + MemoTextWatcher.MAX_CHARACTER_COUNT;
                        Toast.makeText(SelectTypeOfGameActivity.this, text, Toast.LENGTH_SHORT).show();
                    }
                });
                if (playerNameFromSharedPrefencesForBluetoohToGame != null) {
                    playerNameEditText.setText(playerNameFromSharedPrefencesForBluetoohToGame);
                } else {
                    if (BluetoothAdapter.getDefaultAdapter().getName() == null) {
                        playerNameEditText.setText(R.string.player);
                    } else {
                        playerNameEditText.setText(BluetoothAdapter.getDefaultAdapter().getName());

                    }
                }
                Button startBTGame = (Button) view.findViewById(R.id.btn_anonymous_login);
                startBTGame.findViewById(R.id.btn_anonymous_login).setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    	view.setBackgroundColor(Color.parseColor("#0084b0"));
                        String playerName = playerNameEditText.getText().toString();
                        if (playerName.length() == 0) {
                            showToastWithText(getString(R.string.please_enter_your_nick_name));
                            return;
                        }
                        sharedPreferences.edit().putString(PLAYER_NAME_FOR_BLUETOOTH_GAME, playerNameFromSharedPrefencesForBluetoohToGame = playerName).commit();
                        Intent intent = new Intent(SelectTypeOfGameActivity.this, BluetoothGameActivity.class);
                        intent.putExtra(BundleKeys.PLAYER_NAME, playerName);
                        startActivity(intent);
                        xoAlertDialog.dismiss();
                    }
                });
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    private void showPopupSelectBotLevel() {
        final XOAlertDialog xoAlertDialog = new XOAlertDialog();
        anonymousLoginPopup = xoAlertDialog;
        xoAlertDialog.setContent(R.layout.select_bot_level_popup_layout);
        xoAlertDialog.setContentInitialization(new XOAlertDialog.IContentInitialization() {
            @Override
            public void onContentItialization(View view) {
                TextView textViewEasyLevel = (TextView) view.findViewById(R.id.tv_easy_level);
                textViewEasyLevel.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startGameWithBot();
                        xoAlertDialog.dismiss();
                    }
                });
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }

    private void startGameWithBot() {
        Intent intent = new Intent(SelectTypeOfGameActivity.this, GameFieldActivity.class);
        intent.putExtra(BundleKeys.TYPE_OF_GAME, GameType.ANDROID);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {

            case R.id.btn_two_players:
                showPopupForInputNameOfPlayers();
                break;
            case R.id.btn_bluetooth:
                if (BluetoothAdapter.getDefaultAdapter() == null) {
                    Toast.makeText(SelectTypeOfGameActivity.this,
                            R.string.your_device_doesnt_support_bluetooth, Toast.LENGTH_SHORT).show();
                } else {
                    showPopupForBluetoothGame();
                }
                break;
            case R.id.btn_quit:
                finish();
                break;
        }
        if (intent != null) startActivity(intent);
    }


    private String generateUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid + System.currentTimeMillis();
    }
    
    @Override
    public void onBackPressed() {
        XOAlertDialog xoAlertDialog = new XOAlertDialog();
        xoAlertDialog.setTile(getResources().getString(R.string.exit_from_game));
        xoAlertDialog.setMainText(getResources().getString(R.string.exit_from_game_question));
        xoAlertDialog.setPositiveButtonText(getResources().getString(R.string.yes));
        xoAlertDialog.setNegativeButtonText(getResources().getString(R.string.no));
        xoAlertDialog.setPositiveListener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        xoAlertDialog.show(getSupportFragmentManager(), "");
    }
    
}
