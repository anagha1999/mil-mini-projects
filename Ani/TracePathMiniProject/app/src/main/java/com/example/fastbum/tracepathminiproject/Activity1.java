package com.example.fastbum.tracepathminiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        final List<String> path = getIntent().getStringArrayListExtra("mypath");
        TextView tv = (TextView) findViewById(R.id.txt_v);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setTextSize(25);
        for(int i=0; i<path.size(); i++)
            tv.append(path.get(i) + "\n");

        Button b1 = findViewById(R.id.act_2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //                        Go to activity 1
                Intent in = new Intent(getApplicationContext(), Activity2.class);
                path.add("Activity 2");
                in.putStringArrayListExtra("mypath", (ArrayList<String>)path);
                startActivity(in);
            }
        });

        Button b2 = findViewById(R.id.act_3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //                        Go to activity 1
                Intent in = new Intent(getApplicationContext(), Activity3.class);
                path.add("Activity 3");
                in.putStringArrayListExtra("mypath", (ArrayList<String>)path);
                startActivity(in);
            }
        });




    }
}
