package com.example.user.hci;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by User on 03/04/2018.
 */

public class FontManager {
    public static final String FONTAWESOME = "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}
