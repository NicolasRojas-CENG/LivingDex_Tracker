package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bthbutton = findViewById(R.id.BTHButton);
        bthbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityBTH();
            }
        });

        Button mhbutton = findViewById(R.id.MPButton);
        mhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMH();
            }
        });

        Button g4sbutton = findViewById(R.id.G4SBuuton);
        g4sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityG4S();
            }
        });
    }

    public void openActivityBTH(){
        Intent intent = new Intent(this, BestTeamHub.class);
        startActivity(intent);
        //finish();
    }

    private void openActivityMH(){
        Intent intent = new Intent(this, MissingHub.class);
        startActivity(intent);
        //finish();
    }

    private void openActivityG4S(){
        Intent intent = new Intent(this, Gen4Shinies.class);
        startActivity(intent);
    }
}
