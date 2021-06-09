package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MissingUnova extends AppCompatActivity {

    private Switch tornadusNSwitch;
    private Switch thundurusNSwitch;
    private Switch thundurusTSwitch;
    private Switch landorusNSwitch;
    private Switch landorusTSwitch;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TORNADUSNSWITCH = "tornadusnswitch";
    public static final String THUNDURUSNWITCH = "thundurusnswitch";
    public static final String THUNDURUSTSWITCH = "thundurustswitch;";
    public static final String LANDORUSNSWITCH = "landorusnswitch";
    public static final String LANDORUSTSWITCH = "landorustswitch";

    private boolean tornadusNSwitchONOFF;
    private boolean thundurusNSwitchONOFF;
    private boolean thusndurusTSwitchONOFF;
    private boolean landorusNSwitchONOFF;
    private boolean landorusTSwitchONOFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_unova);

        tornadusNSwitch = findViewById(R.id.tornadusNToggle);
        thundurusNSwitch = findViewById(R.id.thundurusNToggle);
        thundurusTSwitch = findViewById(R.id.thundurusTToggle);
        landorusNSwitch = findViewById(R.id.landorusNToggle);
        landorusTSwitch = findViewById(R.id.landorusTToggle);
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
        editor.putBoolean(TORNADUSNSWITCH, tornadusNSwitch.isChecked());
        editor.putBoolean(THUNDURUSNWITCH, thundurusNSwitch.isChecked());
        editor.putBoolean(THUNDURUSTSWITCH, thundurusTSwitch.isChecked());
        editor.putBoolean(LANDORUSNSWITCH, landorusNSwitch.isChecked());
        editor.putBoolean(LANDORUSTSWITCH, landorusTSwitch.isChecked());

        editor.apply();

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        tornadusNSwitchONOFF = sharedPreferences.getBoolean(TORNADUSNSWITCH, false);
        thundurusNSwitchONOFF = sharedPreferences.getBoolean(THUNDURUSNWITCH, false);
        thusndurusTSwitchONOFF = sharedPreferences.getBoolean(THUNDURUSTSWITCH, false);
        landorusNSwitchONOFF = sharedPreferences.getBoolean(LANDORUSNSWITCH, false);
        landorusTSwitchONOFF = sharedPreferences.getBoolean(LANDORUSTSWITCH, false);
    }

    public void updateViews() {
        tornadusNSwitch.setChecked(tornadusNSwitchONOFF);
        thundurusNSwitch.setChecked(thundurusNSwitchONOFF);
        thundurusTSwitch.setChecked(thusndurusTSwitchONOFF);
        landorusNSwitch.setChecked(landorusNSwitchONOFF);
        landorusTSwitch.setChecked(landorusTSwitchONOFF);
    }
}
