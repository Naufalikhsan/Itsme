package com.naufalikhsan.itsme;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView tv;
    Typeface tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textview1);
        tf = Typeface.createFromAsset(getAssets(), "fonts/ADAM.CG PRO.otf");

        tv.setTypeface(tf);
    }
}
