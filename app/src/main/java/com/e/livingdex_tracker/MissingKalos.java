package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MissingKalos extends AppCompatActivity {
    private Switch yveltalSwitch;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String YVELTALSWITCH = "yveltalswitch";

    private boolean yveltalSwitchONOFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_kalos);

        yveltalSwitch = findViewById(R.id.yveltalToggle);
        Button save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });

        loadData();
        updateViews();
    }

    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(YVELTALSWITCH, yveltalSwitch.isChecked());

        editor.apply();

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        yveltalSwitchONOFF = sharedPreferences.getBoolean(YVELTALSWITCH, false);

    }

    public void updateViews() {
        yveltalSwitch.setChecked(yveltalSwitchONOFF);

    }
}
