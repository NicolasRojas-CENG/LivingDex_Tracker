package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestTeamUnova extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_team_unova);

        Button sebutton = findViewById(R.id.SEButton);
        sebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivitySE();
            }
        });

        Button embutton = findViewById(R.id.EMButton);
        embutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityBL();
            }
        });

        Button sabutton = findViewById(R.id.SAButton);
        sabutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivitySW();
            }
        });

    }

    public void openActivitySE(){
        Intent intent = new Intent(this, BestTeamUnova.class);
        startActivity(intent);

    }

    public void openActivityBL(){
        Intent intent = new Intent(this, Emboar.class);
        startActivity(intent);

    }

    public void openActivitySW(){
        Intent intent = new Intent(this, BestTeamUnova.class);
        startActivity(intent);

    }
}
