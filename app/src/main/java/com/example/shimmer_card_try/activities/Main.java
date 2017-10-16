package com.example.shimmer_card_try.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.shimmer_card_try.R;
import com.facebook.shimmer.ShimmerFrameLayout;

public class Main extends AppCompatActivity
{

    private ImageView top_image, top_title, top_subtitle1, top_subtitle2, top_subtitle3;
    private ImageView bottom_image, bottom_title, bottom_subtitle1, bottom_subtitle2, bottom_subtitle3;

    private ShimmerFrameLayout top_shimmerFrameLayout, bottom_shimmerFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Shimmer");
        final ShimmerFrameLayout top_shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer1);
        top_shimmerFrameLayout.setDuration(1500);
        top_shimmerFrameLayout.setTilt(180);
        top_shimmerFrameLayout.startShimmerAnimation();

        final ShimmerFrameLayout bottom_shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer2);
        bottom_shimmerFrameLayout.setDuration(1500);
        bottom_shimmerFrameLayout.setTilt(180);
        bottom_shimmerFrameLayout.startShimmerAnimation();

    }
}
