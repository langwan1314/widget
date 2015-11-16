package com.lib.app.textview.titanic;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.lib.app.R;
import com.lib.widget.textview.titanic.Titanic;
import com.lib.widget.textview.titanic.TitanicTextView;


public class TitanicMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titanic_main);

        TitanicTextView tv = (TitanicTextView) findViewById(R.id.my_text_view);

        // set fancy typeface
        tv.setTypeface(Typefaces.get(this, "Satisfy-Regular.ttf"));

        // start animation
        new Titanic().start(tv);
    }

}
