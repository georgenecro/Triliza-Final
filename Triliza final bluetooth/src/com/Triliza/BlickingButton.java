package com.Triliza;

import com.font.ButtonWithComicsFont;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

public class BlickingButton extends ButtonWithComicsFont {
    private boolean isNeedBlick;
    private BlickingTimer blickingTimer;
    private boolean indicator = true;

    public BlickingButton(Context context) {
        super(context);
        startBlickingTimer();
    }

    public BlickingButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        startBlickingTimer();
    }

    public BlickingButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        startBlickingTimer();
    }

    private void startBlickingTimer() {
        blickingTimer = new BlickingTimer(bleakCallback);
        blickingTimer.start();

    }

    private BlickingTimer.BleakCallback bleakCallback = new BlickingTimer.BleakCallback() {
        @Override
        public void bleak() {
            post(new Runnable() {
                @Override
                public void run() {
                    if (isNeedBlick) {
                        if (indicator) {
                            setBackgroundColor(Color.parseColor("#0099cc"));
                            indicator = false;
                        } else {
                            indicator = true;
                        }

                    }
                }
            });
        }
    };


    public void setNeedingToBlick(boolean isNeed) {
        isNeedBlick = isNeed;

    }


    private static class BlickingTimer extends Thread {
        private static final int TIME = 1000;
        public volatile boolean isLeave = true;
        private BleakCallback bleakCallback;

        public void setBleakCallback(BleakCallback bleakCallback) {
            this.bleakCallback = bleakCallback;
        }

        private BlickingTimer(BleakCallback bleakCallback) {
            this.bleakCallback = bleakCallback;
        }

        @Override
        public void run() {

            while (isLeave) {
                try {
                    Thread.sleep(TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (bleakCallback != null) {
                    bleakCallback.bleak();
                }

            }
        }

        public static interface BleakCallback {
            public void bleak();
        }
    }

    public void stopTaskForBleak() {
        blickingTimer.isLeave = false;
        blickingTimer.interrupt();
        blickingTimer.setBleakCallback(null);
        blickingTimer = null;

    }
}
