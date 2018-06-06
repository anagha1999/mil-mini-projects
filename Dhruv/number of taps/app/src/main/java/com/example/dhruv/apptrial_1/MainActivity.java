package com.example.dhruv.apptrial_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Tap , Display;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tap = (TextView) findViewById(R.id.TAP_AREA);
        Display = (TextView) findViewById(R.id.Display);
    }

    public void OnClick(View tap) {
        count++;
            Display.setText("No. of TAPS: "+count);

    }

}
