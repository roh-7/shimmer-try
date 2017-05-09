package com.example.shimmer_card_try.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.example.shimmer_card_try.R;
import com.facebook.shimmer.ShimmerFrameLayout;

public class Main extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Shimmer");
        final ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer1);
        shimmerFrameLayout.setDuration(1500);
        shimmerFrameLayout.setTilt(180);
        shimmerFrameLayout.startShimmerAnimation();

        final ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) findViewById(R.id.shimmer2);
        shimmerFrameLayout2.setDuration(1500);
        shimmerFrameLayout2.setTilt(180);
        shimmerFrameLayout2.startShimmerAnimation();

    }
}
