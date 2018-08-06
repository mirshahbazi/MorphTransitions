package com.mam.morphtransitions.sample;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;


/**
 * *
 * *          ____  ____ _____ ___   ____
 * *         | \ \ / / |/ _  || \ \ / / |
 * *         | |\ V /| | (_| || |\ V /| |
 * *         |_| \_/ |_|\__,_||_| \_/ |_|
 * *
 * Created by Mohammad Ali Mirshahbazi
 */
public class SendMonyDialog {
    public static final int TYPE_BUTTON = 2;
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Activity activity;
    AppCustomDialog dialog;
    Rect rect = new Rect();
    private boolean creditValueValidation = false;
    View view;


    public SendMonyDialog(Activity activity) {
        this.activity = activity;
        this.windowDisplayFrame();

    }

    private void windowDisplayFrame() {
        Activity parent = activity;
        Window window = parent.getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
    }

    public void SharjDialog(String amount) {
        view = activity.getLayoutInflater().inflate(R.layout.activity_dialog_mam, null);


        view.setMinimumWidth((int) (rect.width() * 0.85f));
        if (!activity.isFinishing()) {
            dialog = new AppCustomDialog(view, activity, 0);
            dialog.show();
        }
        //Blur behind Alert Dialog
        //    new BlurAsyncTask().execute();
    }


}


