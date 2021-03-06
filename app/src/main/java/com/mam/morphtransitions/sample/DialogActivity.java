package com.mam.morphtransitions.sample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mam.morphtransitions.FabTransform;
import com.mam.morphtransitions.MorphTransform;

/**
 * *
 * *          ____  ____ _____ ___   ____
 * *         | \ \ / / |/ _  || \ \ / / |
 * *         | |\ V /| | (_| || |\ V /| |
 * *         |_| \_/ |_|\__,_||_| \_/ |_|
 * *
 * Created by Mohammad Ali Mirshahbazi
 */
public class DialogActivity extends AppCompatActivity {

    private static final String EXTRA_TYPE = "type";

    public static final int TYPE_FAB = 1;
    public static final int TYPE_BUTTON = 2;

    public static Intent newIntent(Context context, int type) {
        Intent intent = new Intent(context, DialogActivity.class);
        intent.putExtra(EXTRA_TYPE, type);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        findViewById(R.id.root).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.finishAfterTransition(DialogActivity.this);
            }
        });

        View container = findViewById(R.id.container);

        //This could probably be better. Basically checks to see if it is a FabTransform. If not,
        //tries out being a MorphTransform
        switch (getIntent().getIntExtra(EXTRA_TYPE, -1)) {
            case TYPE_FAB:
                FabTransform.setup(this, container);
                break;
            case TYPE_BUTTON:
                MorphTransform.setup(this, container, Color.WHITE,
                        getResources().getDimensionPixelSize(R.dimen.dialog_corners));
                break;
        }
    }
}
