package com.wave.demo;

import android.app.Activity;
import android.os.Bundle;

import com.wave.ActivityAnimationTool;
import com.wave.R;


public class NextActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAnimationTool.prepareAnimation(this);
        setContentView(R.layout.activity_next);
        ActivityAnimationTool.animate(this, 1000);
    }

    @Override
    protected void onStop() {
        ActivityAnimationTool.cancel(this);
        super.onStop();
    }
}
