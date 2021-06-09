package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MissingHub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_hub);

        Button hoennbutton = findViewById(R.id.Hoenn);
        hoennbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHoenn();
            }
        });

        Button sinhobutton = findViewById(R.id.Sinho);
        sinhobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySinho();
            }
        });

        Button unovabutton = findViewById(R.id.Unova);
        unovabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUnova();
            }
        });

        Button kalosbutton = findViewById(R.id.Kalos);
        kalosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityKalos();
            }
        });

        Button galarbutton = findViewById(R.id.Galar);
        galarbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) { openActivityGalar();}
        });
    }

    private void openActivityHoenn(){
        Intent intent = new Intent(this, MissingHoenn.class);
        startActivity(intent);
    }

    private void openActivitySinho(){
        Intent intent = new Intent(this, MissingSinho.class);
        startActivity(intent);
    }

    private void openActivityUnova(){
        Intent intent = new Intent(this, MissingUnova.class);
        startActivity(intent);
    }

    private void openActivityKalos(){
        Intent intent = new Intent(this, MissingKalos.class);
        startActivity(intent);
    }

    private void openActivityGalar(){
        Intent intent = new Intent(this, MissingGalar.class);
        startActivity(intent);
    }
}
