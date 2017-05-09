package com.example.shimmer_card_try.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.shimmer_card_try.R;

public class Splash extends AppCompatActivity
{

    private final int SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(Splash.this,Main.class));
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
