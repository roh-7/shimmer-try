package com.example.shimmer_card_try.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.example.shimmer_card_try.R;
import com.facebook.shimmer.ShimmerFrameLayout;

public class Main extends AppCompatActivity
{

    private String TAG = ".activities.Main";

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

        findViews();

        top_shimmerFrameLayout.setDuration(1500);
        top_shimmerFrameLayout.setTilt(180);
        top_shimmerFrameLayout.startShimmerAnimation();

        bottom_shimmerFrameLayout.setDuration(1500);
        bottom_shimmerFrameLayout.setTilt(180);
        bottom_shimmerFrameLayout.startShimmerAnimation();

        Handler loader = new Handler();
        loader.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "Finished loading.");
                stopShimmer();
            }
        }, 5000);   //arbitrary delay to pretend to be loading

    }

    private void findViews() {
        top_shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer1);
        bottom_shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer2);

        //top card
        top_image = (ImageView) findViewById(R.id.card_img1);
        top_title = (ImageView) findViewById(R.id.card_title1);

        top_subtitle1 = (ImageView) findViewById(R.id.card_subtitle1);
        top_subtitle2 = (ImageView) findViewById(R.id.card_subtitle2);
        top_subtitle3 = (ImageView) findViewById(R.id.card_subtitle3);

        //bottom card
        bottom_image = (ImageView) findViewById(R.id.card_img2);
        bottom_title = (ImageView) findViewById(R.id.card_title2);

        bottom_subtitle1 = (ImageView) findViewById(R.id.card_subtitle4);
        bottom_subtitle2 = (ImageView) findViewById(R.id.card_subtitle5);
        bottom_subtitle3 = (ImageView) findViewById(R.id.card_subtitle6);
    }

    private void stopShimmer() {
        top_shimmerFrameLayout.stopShimmerAnimation();
        bottom_shimmerFrameLayout.stopShimmerAnimation();
    }
}
