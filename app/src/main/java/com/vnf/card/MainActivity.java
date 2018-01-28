package com.vnf.card;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TextView tx = (TextView)findViewById(R.id.textview1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/DancingScript-Regular.ttf");

        //tx.setTypeface(custom_font);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
