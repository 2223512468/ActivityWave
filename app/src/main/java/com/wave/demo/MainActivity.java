package com.wave.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.wave.ActivityAnimationTool;
import com.wave.BlurEffect;
import com.wave.CloseEffect;
import com.wave.FoldingEffect;
import com.wave.R;
import com.wave.SkewEffect;
import com.wave.SplitEffect;
import com.wave.WaterEffect;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityAnimationTool.init(new WaterEffect());
        findViewById(R.id.iv).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityAnimationTool.startActivity(MainActivity.this, new Intent(MainActivity.this, NextActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_blur:
                ActivityAnimationTool.init(new BlurEffect());
                break;
            case R.id.action_close:
                ActivityAnimationTool.init(new CloseEffect());
                break;
            case R.id.action_split:
                ActivityAnimationTool.init(new SplitEffect());
                break;
//            case R.id.action_twister:
//                ActivityAnimationTool.init(new TwisterEffect());
//                break;
            case R.id.action_folding:
                ActivityAnimationTool.init(new FoldingEffect());
                break;
            case R.id.action_skew:
                ActivityAnimationTool.init(new SkewEffect());
                break;
            case R.id.action_water:
                ActivityAnimationTool.init(new WaterEffect());
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
