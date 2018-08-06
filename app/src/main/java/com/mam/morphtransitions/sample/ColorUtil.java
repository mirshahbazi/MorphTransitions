package com.mam.morphtransitions.sample;

import android.content.Context;
import android.util.TypedValue;
/**
 * *
 * *          ____  ____ _____ ___   ____
 * *         | \ \ / / |/ _  || \ \ / / |
 * *         | |\ V /| | (_| || |\ V /| |
 * *         |_| \_/ |_|\__,_||_| \_/ |_|
 * *
 * Created by Mohammad Ali Mirshahbazi
 *
 *
 *
 * Simple util to retrieve attribute colors
 */
public class ColorUtil {

    private static TypedValue sTypedValue = new TypedValue();

    public static int getThemeAttrColor(Context context, int attributeColor) {
        context.getTheme().resolveAttribute(attributeColor, sTypedValue, true);
        return sTypedValue.data;
    }
}
