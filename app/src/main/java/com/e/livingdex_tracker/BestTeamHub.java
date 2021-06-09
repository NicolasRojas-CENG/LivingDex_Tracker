package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestTeamHub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_team_hub);

        Button hbutton = findViewById(R.id.HButton);
        hbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityH();
            }
        });

        Button ubutton = findViewById(R.id.UButton);
        ubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityU();
            }
        });
    }

    public void openActivityH(){
        Intent intent = new Intent(this, BestTeamHoenn.class);
        startActivity(intent);
        //finish();
    }

    private void openActivityU(){
        Intent intent = new Intent(this, BestTeamUnova.class);
        startActivity(intent);
        //finish();
    }
}
