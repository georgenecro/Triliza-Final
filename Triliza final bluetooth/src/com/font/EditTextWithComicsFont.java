package com.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditTextWithComicsFont extends EditText {
    public EditTextWithComicsFont(Context context) {
        super(context);
        initFont(context);
    }

    public EditTextWithComicsFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFont(context);

    }

    public EditTextWithComicsFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initFont(context);
    }

    private void initFont(Context context) {
        Typeface mFont = Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Reg.ttf");
        setTypeface(mFont);
    }
}
