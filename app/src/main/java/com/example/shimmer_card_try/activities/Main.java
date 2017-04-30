package com.example.shimmer_card_try.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.shimmer_card_try.R;
import com.facebook.shimmer.ShimmerFrameLayout;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer_frame);
        shimmerFrameLayout.useDefaults();
        shimmerFrameLayout.startShimmerAnimation();
    }
}
