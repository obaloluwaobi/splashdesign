package com.hubs.splashdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT =6000;
    // to known the duration of the time
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(MainActivity.this,Homepage.class);
                //intent is used to switch fromone activity to another.
                startActivity(intent);
                //to invoke the second activity
                finish();
            }

        },
                SPLASH_SCREEN_TIME_OUT );
    }
}