package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestTeamHoenn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_team_hoenn);

        Button scbutton = findViewById(R.id.SCButton);
        scbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivitySC();
            }
        });

        Button blbutton = findViewById(R.id.BLButton);
        blbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityBL();
            }
        });

        Button swbutton = findViewById(R.id.SWButton);
        swbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivitySW();
            }
        });

    }

    public void openActivitySC(){
        Intent intent = new Intent(this, BestTeamHoenn.class);
        startActivity(intent);

    }

    public void openActivityBL(){
        Intent intent = new Intent(this, Blaziken.class);
        startActivity(intent);

    }

    public void openActivitySW(){
        Intent intent = new Intent(this, BestTeamHoenn.class);
        startActivity(intent);

    }

}
