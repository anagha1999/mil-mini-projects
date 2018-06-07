package com.example.fastbum.tracepathminiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<String> path = new ArrayList<String>();

        Spinner sp = findViewById(R.id.dropdown);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position!=0)
                    Toast.makeText(MainActivity.this, "Switch to "+parent.getSelectedItem().toString(),  Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "Select an option",  Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
//                        Go to activity 1
                        Intent in = new Intent(getApplicationContext(), Activity1.class);
                        path.add(parent.getSelectedItem().toString());
                        in.putStringArrayListExtra("mypath", (ArrayList<String>)path);
                        startActivity(in);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
