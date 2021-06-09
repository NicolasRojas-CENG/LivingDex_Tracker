package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MissingHoenn extends AppCompatActivity {
    private Switch treeckoSwitch;
    private Switch grovyleSwitch;
    private Switch sceptileSwitch;
    private Switch torchicSwitch;
    private Switch combuskenSwitch;
    private Switch blazikenSwitch;
    private Switch mudkipSwitch;
    private Switch marshtompSwitch;
    private Switch swampertSwitch;
    private Switch nuzleafSwitch;
    private Switch shiftrySwitch;
    private Switch solrockSwitch;
    private Switch crawduntSwitch;
    private Switch miloticSwitch;
    private Switch huntailSwitch;
    private Switch gorebyssSwitch;
    private Switch luvdiscSwitch;
    private Switch beldumSwitch;
    private Switch metangSwitch;
    private Switch latiosSwitch;
    private Switch groundonSwitch;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TREECKOSWITCH = "treeckoswitch";
    public static final String GROVYLESWITCH = "grovyleswitch";
    public static final String SCEPTILESWITCH = "sceptileswitch;";
    public static final String TORCHICSWITCH = "torchicswitch";
    public static final String COMBUSKENSWITCH = "combuskenswitch";
    public static final String BLAZIKENSWITCH = "blazikenswitch;";
    public static final String MUDKIPSWITCH = "mudkipswitch";
    public static final String MARSHTOMPSWITCH = "marshtompswitch";
    public static final String SWAMPERTSWITCH = "swampertswitch;";
    public static final String NUZLEAFSWITCH = "nuzleafswitch";
    public static final String SHIFTRYSWITCH = "shiftryswitch";
    public static final String SOLROCKSWITCH = "solrockswitch;";
    public static final String CRAWDUNTSWITCH = "crawduntswitch";
    public static final String MILOTICSWITCH = "miloticswitch";
    public static final String HUNTAILSWITCH = "huntailswitch";
    public static final String GOREBYSSSWITCH = "gorebyssswitch";
    public static final String LUVDISCSWITCH = "luvdiscswitch";
    public static final String BELDUMSWITCH = "beldumswitch;";
    public static final String METANGSWITCH = "metangswitch";
    public static final String LATIOSSWITCH = "latiosswitch";
    public static final String GROUDONSWITCH = "groudonswitch;";

    private boolean treeckoSwitchONOFF;
    private boolean grovyleSwitchONOFF;
    private boolean sceptileSwitchONOFF;
    private boolean torchicSwitchONOFF;
    private boolean combuskenSwitchONOFF;
    private boolean blazikenSwitchONOFF;
    private boolean mudkipSwitchONOFF;
    private boolean marshtompSwitchONOFF;
    private boolean swampertSwitchONOFF;
    private boolean nuzleafSwitchONOFF;
    private boolean shiftrySwitchONOFF;
    private boolean solrockSwitchONOFF;
    private boolean crawduntSwitchONOFF;
    private boolean miloticSwitchONOFF;
    private boolean huntailSwitchONOFF;
    private boolean gorebyssSwitchONOFF;
    private boolean luvdiscSwitchONOFF;
    private boolean beldumSwitchONOFF;
    private boolean metangSwitchONOFF;
    private boolean latiosSwitchONOFF;
    private boolean groundonSwitchONOFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_hoenn);

        treeckoSwitch = findViewById(R.id.treeckoToggle);
        grovyleSwitch = findViewById(R.id.grovyleToggle);
        sceptileSwitch = findViewById(R.id.sceptileToggle);
        torchicSwitch = findViewById(R.id.torchicToggle);
        combuskenSwitch = findViewById(R.id.combuskenToggle);
        blazikenSwitch = findViewById(R.id.blazikenToggle);
        mudkipSwitch = findViewById(R.id.mudkipToggle);
        marshtompSwitch = findViewById(R.id.marshtompToggle);
        swampertSwitch = findViewById(R.id.swampertToggle);
        nuzleafSwitch = findViewById(R.id.nuzleafToggle);
        shiftrySwitch = findViewById(R.id.shiftryToggle);
        solrockSwitch = findViewById(R.id.solrockToggle);
        crawduntSwitch = findViewById(R.id.crawduntToggle);
        miloticSwitch = findViewById(R.id.miloticToggle);
        huntailSwitch = findViewById(R.id.huntailToggle);
        gorebyssSwitch = findViewById(R.id.gorebyssToggle);
        luvdiscSwitch = findViewById(R.id.luvdiscToggle);
        beldumSwitch = findViewById(R.id.beldumToggle);
        metangSwitch = findViewById(R.id.metangToggle);
        latiosSwitch = findViewById(R.id.latiosToggle);
        groundonSwitch = findViewById(R.id.groudonToggle);
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

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(TREECKOSWITCH, treeckoSwitch.isChecked());
        editor.putBoolean(GROVYLESWITCH, grovyleSwitch.isChecked());
        editor.putBoolean(SCEPTILESWITCH, sceptileSwitch.isChecked());
        editor.putBoolean(TORCHICSWITCH, torchicSwitch.isChecked());
        editor.putBoolean(COMBUSKENSWITCH, combuskenSwitch.isChecked());
        editor.putBoolean(BLAZIKENSWITCH, blazikenSwitch.isChecked());
        editor.putBoolean(MUDKIPSWITCH, mudkipSwitch.isChecked());
        editor.putBoolean(MARSHTOMPSWITCH, marshtompSwitch.isChecked());
        editor.putBoolean(SWAMPERTSWITCH, swampertSwitch.isChecked());
        editor.putBoolean(NUZLEAFSWITCH, nuzleafSwitch.isChecked());
        editor.putBoolean(SHIFTRYSWITCH, shiftrySwitch.isChecked());
        editor.putBoolean(SOLROCKSWITCH, solrockSwitch.isChecked());
        editor.putBoolean(CRAWDUNTSWITCH, crawduntSwitch.isChecked());
        editor.putBoolean(MILOTICSWITCH, miloticSwitch.isChecked());
        editor.putBoolean(HUNTAILSWITCH, huntailSwitch.isChecked());
        editor.putBoolean(GOREBYSSSWITCH, gorebyssSwitch.isChecked());
        editor.putBoolean(LUVDISCSWITCH, luvdiscSwitch.isChecked());
        editor.putBoolean(BELDUMSWITCH, beldumSwitch.isChecked());
        editor.putBoolean(METANGSWITCH, metangSwitch.isChecked());
        editor.putBoolean(LATIOSSWITCH, latiosSwitch.isChecked());
        editor.putBoolean(GROUDONSWITCH, groundonSwitch.isChecked());

        editor.apply();

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        treeckoSwitchONOFF = sharedPreferences.getBoolean(TREECKOSWITCH, false);
        grovyleSwitchONOFF = sharedPreferences.getBoolean(GROVYLESWITCH, false);
        sceptileSwitchONOFF = sharedPreferences.getBoolean(SCEPTILESWITCH, false);
        torchicSwitchONOFF = sharedPreferences.getBoolean(TORCHICSWITCH, false);
        combuskenSwitchONOFF = sharedPreferences.getBoolean(COMBUSKENSWITCH, false);
        blazikenSwitchONOFF = sharedPreferences.getBoolean(BLAZIKENSWITCH, false);
        mudkipSwitchONOFF = sharedPreferences.getBoolean(MUDKIPSWITCH, false);
        marshtompSwitchONOFF = sharedPreferences.getBoolean(MARSHTOMPSWITCH, false);
        swampertSwitchONOFF = sharedPreferences.getBoolean(SWAMPERTSWITCH, false);
        nuzleafSwitchONOFF = sharedPreferences.getBoolean(NUZLEAFSWITCH, false);
        shiftrySwitchONOFF = sharedPreferences.getBoolean(SHIFTRYSWITCH, false);
        solrockSwitchONOFF = sharedPreferences.getBoolean(SOLROCKSWITCH, false);
        crawduntSwitchONOFF = sharedPreferences.getBoolean(CRAWDUNTSWITCH, false);
        miloticSwitchONOFF = sharedPreferences.getBoolean(MILOTICSWITCH, false);
        huntailSwitchONOFF = sharedPreferences.getBoolean(HUNTAILSWITCH, false);
        gorebyssSwitchONOFF = sharedPreferences.getBoolean(GOREBYSSSWITCH, false);
        luvdiscSwitchONOFF = sharedPreferences.getBoolean(LUVDISCSWITCH, false);
        beldumSwitchONOFF = sharedPreferences.getBoolean(BELDUMSWITCH, false);
        metangSwitchONOFF = sharedPreferences.getBoolean(METANGSWITCH, false);
        latiosSwitchONOFF = sharedPreferences.getBoolean(LATIOSSWITCH, false);
        groundonSwitchONOFF = sharedPreferences.getBoolean(GROUDONSWITCH, false);
    }

    public void updateViews(){
        treeckoSwitch.setChecked(treeckoSwitchONOFF);
        grovyleSwitch.setChecked(grovyleSwitchONOFF);
        sceptileSwitch.setChecked(sceptileSwitchONOFF);
        torchicSwitch.setChecked(torchicSwitchONOFF);
        combuskenSwitch.setChecked(combuskenSwitchONOFF);
        blazikenSwitch.setChecked(blazikenSwitchONOFF);
        mudkipSwitch.setChecked(mudkipSwitchONOFF);
        marshtompSwitch.setChecked(marshtompSwitchONOFF);
        swampertSwitch.setChecked(swampertSwitchONOFF);
        nuzleafSwitch.setChecked(nuzleafSwitchONOFF);
        shiftrySwitch.setChecked(shiftrySwitchONOFF);
        solrockSwitch.setChecked(solrockSwitchONOFF);
        crawduntSwitch.setChecked(crawduntSwitchONOFF);
        miloticSwitch.setChecked(miloticSwitchONOFF);
        huntailSwitch.setChecked(huntailSwitchONOFF);
        gorebyssSwitch.setChecked(gorebyssSwitchONOFF);
        luvdiscSwitch.setChecked(luvdiscSwitchONOFF);
        beldumSwitch.setChecked(beldumSwitchONOFF);
        metangSwitch.setChecked(metangSwitchONOFF);
        latiosSwitch.setChecked(latiosSwitchONOFF);
        groundonSwitch.setChecked(groundonSwitchONOFF);

    }
}
