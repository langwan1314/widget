package com.lib.app.textview.autofit;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.lib.app.R;


public class AutoFitActivity extends Activity {

    private TextView mOutput, mAutofitOutput;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autofit_main);

        mOutput = (TextView)findViewById(R.id.output);
        mAutofitOutput = (TextView)findViewById(R.id.output_autofit);

        ((EditText)findViewById(R.id.input)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                // do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                mOutput.setText(charSequence);
                mAutofitOutput.setText(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // do nothing
            }
        });
    }
}