package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MissingSinho extends AppCompatActivity {
    private Switch cranidosSwitch;
    private Switch stunkySwitch;
    private Switch skuntankSwitch;
    private Switch chatotSwitch;
    private Switch tangrowthSwitch;
    private Switch electivireSwitch;
    private Switch magmortarSwitch;
    private Switch yanmegaSwitch;
    private Switch mamoswineSwitch;
    private Switch froslassSwitch;
    private Switch dialgaSwitch;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String CRANIDOSSWITCH = "cranidosswitch";
    public static final String STNKYSWITCH = "stunkyswitch";
    public static final String SKUNTANKSWITCH = "skuntankswitch;";
    public static final String CHATOTSWITCH = "chatotswitch";
    public static final String TANGROWTHSWITCH = "tangrowthswitch";
    public static final String ELECTIVIRESWITCH = "electivireswitch;";
    public static final String MAGMORTARSWITCH = "magmortarswitch";
    public static final String YANMEGASWITCH = "yanmegaswitch";
    public static final String MAMOSWINESWITCH = "mamoswineswitch;";
    public static final String FROSLASSSWITCH = "froslassswitch";
    public static final String DIALGASWITCH = "dialgaswitch";

    private boolean cranidosSwitchONOFF;
    private boolean stunkySwitchONOFF;
    private boolean skuntankSwitchONOFF;
    private boolean chatotSwitchONOFF;
    private boolean tangrowthSwitchONOFF;
    private boolean electivireSwitchONOFF;
    private boolean magmortarSwitchONOFF;
    private boolean yanmegaSwitchONOFF;
    private boolean mamoswineSwitchONOFF;
    private boolean froslassSwitchONOFF;
    private boolean dialgaSwitchONOFF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_sinho);

        cranidosSwitch = findViewById(R.id.cranidosToggle);
        stunkySwitch = findViewById(R.id.stunkyToggle);
        skuntankSwitch = findViewById(R.id.skuntankToggle);
        chatotSwitch = findViewById(R.id.chatotToggle);
        tangrowthSwitch = findViewById(R.id.tangrowthToggle);
        electivireSwitch = findViewById(R.id.electivireToggle);
        magmortarSwitch = findViewById(R.id.magmortarToggle);
        yanmegaSwitch = findViewById(R.id.yanmegaToggle);
        mamoswineSwitch = findViewById(R.id.mamoswineToggle);
        froslassSwitch = findViewById(R.id.froslassToggle);
        dialgaSwitch = findViewById(R.id.dialgaToggle);
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
        editor.putBoolean(CRANIDOSSWITCH, cranidosSwitch.isChecked());
        editor.putBoolean(STNKYSWITCH, stunkySwitch.isChecked());
        editor.putBoolean(SKUNTANKSWITCH, skuntankSwitch.isChecked());
        editor.putBoolean(CHATOTSWITCH, chatotSwitch.isChecked());
        editor.putBoolean(TANGROWTHSWITCH, tangrowthSwitch.isChecked());
        editor.putBoolean(ELECTIVIRESWITCH, electivireSwitch.isChecked());
        editor.putBoolean(MAGMORTARSWITCH, magmortarSwitch.isChecked());
        editor.putBoolean(YANMEGASWITCH, yanmegaSwitch.isChecked());
        editor.putBoolean(MAMOSWINESWITCH, mamoswineSwitch.isChecked());
        editor.putBoolean(FROSLASSSWITCH, froslassSwitch.isChecked());
        editor.putBoolean(DIALGASWITCH, dialgaSwitch.isChecked());

        editor.apply();

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        cranidosSwitchONOFF = sharedPreferences.getBoolean(CRANIDOSSWITCH, false);
        stunkySwitchONOFF = sharedPreferences.getBoolean(STNKYSWITCH, false);
        skuntankSwitchONOFF = sharedPreferences.getBoolean(SKUNTANKSWITCH, false);
        chatotSwitchONOFF = sharedPreferences.getBoolean(CHATOTSWITCH, false);
        tangrowthSwitchONOFF = sharedPreferences.getBoolean(TANGROWTHSWITCH, false);
        electivireSwitchONOFF = sharedPreferences.getBoolean(ELECTIVIRESWITCH, false);
        magmortarSwitchONOFF = sharedPreferences.getBoolean(MAGMORTARSWITCH, false);
        yanmegaSwitchONOFF = sharedPreferences.getBoolean(YANMEGASWITCH, false);
        mamoswineSwitchONOFF = sharedPreferences.getBoolean(MAMOSWINESWITCH, false);
        froslassSwitchONOFF = sharedPreferences.getBoolean(FROSLASSSWITCH, false);
        dialgaSwitchONOFF = sharedPreferences.getBoolean(DIALGASWITCH, false);

    }

    public void updateViews() {
        cranidosSwitch.setChecked(cranidosSwitchONOFF);
        stunkySwitch.setChecked(stunkySwitchONOFF);
        skuntankSwitch.setChecked(skuntankSwitchONOFF);
        chatotSwitch.setChecked(chatotSwitchONOFF);
        tangrowthSwitch.setChecked(tangrowthSwitchONOFF);
        electivireSwitch.setChecked(electivireSwitchONOFF);
        magmortarSwitch.setChecked(magmortarSwitchONOFF);
        yanmegaSwitch.setChecked(yanmegaSwitchONOFF);
        mamoswineSwitch.setChecked(mamoswineSwitchONOFF);
        froslassSwitch.setChecked(froslassSwitchONOFF);
        dialgaSwitch.setChecked(dialgaSwitchONOFF);

    }
}
