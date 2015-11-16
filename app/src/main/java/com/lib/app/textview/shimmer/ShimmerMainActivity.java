package com.lib.app.textview.shimmer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.lib.app.R;
import com.lib.widget.textview.shimmer.Shimmer;
import com.lib.widget.textview.shimmer.ShimmerTextView;


public class ShimmerMainActivity extends Activity {

    ShimmerTextView tv;
    Shimmer shimmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimmer_main);

        tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);
    }

    public void toggleAnimation(View target) {
        if (shimmer != null && shimmer.isAnimating()) {
            shimmer.cancel();
        } else {
            shimmer = new Shimmer();
            shimmer.start(tv);
        }
    }
}
