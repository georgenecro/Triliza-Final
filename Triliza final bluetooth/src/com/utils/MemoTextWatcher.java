package com.utils;

import android.text.Editable;
import android.text.TextWatcher;

public abstract class MemoTextWatcher implements TextWatcher {

    public static final int MAX_CHARACTER_COUNT = 15;
    private int max_character;

    String oldText = "";

    protected MemoTextWatcher() {
        max_character = MAX_CHARACTER_COUNT;
    }

    protected MemoTextWatcher(int maxSize) {
        max_character = maxSize;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (s.length() <= max_character)
            oldText = s.toString();
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (s.length() > max_character) {
            s.replace(0, s.length(), oldText, 0, oldText.length());
            showMaxAlert();
        } else {
            inputtedTextLengthChanged(s.length());
        }
    }

    protected void inputtedTextLengthChanged(int length) {
    }

    protected abstract void showMaxAlert();
}
