package com.example.fastbum.tracepathminiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.List;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final List<String> path = getIntent().getStringArrayListExtra("mypath");
        TextView tv = (TextView) findViewById(R.id.txt_v1);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setTextSize(25);
        for(int i=0; i<path.size(); i++)
            tv.append(path.get(i) + "\n");

    }
}
