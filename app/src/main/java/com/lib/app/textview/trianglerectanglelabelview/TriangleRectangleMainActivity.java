package com.lib.app.textview.trianglerectanglelabelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.lib.app.R;
import com.lib.widget.textview.trianglerectanglelabelview.TriangleRectangleLabelView;

public class TriangleRectangleMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview_triangle_main);

        ((TriangleRectangleLabelView)findViewById(R.id.trlv1)).setLineMode(TriangleRectangleLabelView.LINE_MODE.START);
        ((TriangleRectangleLabelView)findViewById(R.id.trlv2)).setLineMode(TriangleRectangleLabelView.LINE_MODE.MIDDLE);
        ((TriangleRectangleLabelView)findViewById(R.id.trlv3)).setLineMode(TriangleRectangleLabelView.LINE_MODE.MIDDLE);
        ((TriangleRectangleLabelView)findViewById(R.id.trlv4)).setLineMode(TriangleRectangleLabelView.LINE_MODE.END);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
