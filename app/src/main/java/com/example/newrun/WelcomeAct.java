package com.example.newrun;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by Administrator on 2017/4/17.
 */

public class WelcomeAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.welcome);

        new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {

                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                return false;
            }
        }).sendEmptyMessageDelayed(0,4000);

    }
}
