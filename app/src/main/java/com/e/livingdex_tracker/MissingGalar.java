package com.e.livingdex_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MissingGalar extends AppCompatActivity {
    private Switch appletunSwitch;
    private Switch cursolaSwitch;
    private Switch alcremieVanillaSwitch;
    private Switch alcremieRubySwitch;
    private Switch alcremieMatchaSwitch;
    private Switch alcremieMintSwitch;
    private Switch alcremieLemonSwitch;
    private Switch alcremieSaltedSwitch;
    private Switch alcremieRubySwirlSwitch;
    private Switch alcremieCaramelSwirlSwitch;
    private Switch alcremieRainbowSwirlSwitch;
    private Switch eiscueSwitch;
    private Switch indeedeeFSwitch;
    private Switch zamazentaSwitch;
    private Switch kubfuSwitch;
    private Switch urshifuDSwitch;
    private Switch urshifuWSwitch;
    private Switch regielekiSwitch;
    private Switch regidragoSwitch;
    private Switch glastrierSwitch;
    private Switch spectrierSwitch;
    private Switch calyrexSwitch;
    private Switch gbutterfreeSwitch;
    private Switch gmelmetalSwitch;
    private Switch gcorviknightSwitch;
    private Switch gdrednawSwitch;
    private Switch gcoalossalSwitch;
    private Switch gflappleSwitch;
    private Switch gtoxtricitySwitch;
    private Switch gcentiskorchSwitch;
    private Switch galcremieSwitch;
    private Switch gcopperajahSwitch;
    private Switch gvenusaurSwitch;
    private Switch gblastoiseSwitch;
    private Switch grillaboomSwitch;
    private Switch gcinderaceSwitch;
    private Switch ginteleonSwitch;
    private Switch gurshifuSwitch;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String APPLETUNSWITCH = "appletunSwitch";
    public static final String CURSOLASWITCH = "cursolaSwitch";
    public static final String ALCREMIEVANILLASWITCH = "alcremieVanillaSwitch";
    public static final String ALCREMIERUBYSWITCH = "alcremieRubySwitch";
    public static final String ALCREMIEMATCHASWITCH = "alcremieMatchaSwitch";
    public static final String ALCREMIEMINTSWITCH = "alcremieMintSwitch";
    public static final String ALCEMIELEMONSWITCH = "alcremieLemonSwitch";
    public static final String ALCREMIESALTEDSWITCH = "alcremieSaltedSwitch";
    public static final String ALCREMIERUBYSWIRLSWITCH = "alcremieRubySwirlSwitch;";
    public static final String ALCREMIECARAMELSWIRLSWITCH = "alcremieCaramelSwirlSwitch";
    public static final String ALCREMIERAINBOWSWIRLSWITCH = "alcremieRainbowSwirlSwitch";
    public static final String EISCUESWITCH = "eiscueSwitch;";
    public static final String INDEEDEEFSWITCH = "indeedeeFSwitch";
    public static final String ZAMAZENTASWITCH = "zamazentaSwitch";
    public static final String KUBFUSWITCH = "kubfuSwitch";
    public static final String URSHIFUDSWITCH = "urshifuDSwitch";
    public static final String URSHIFUWSWITCH = "urshifuWSwitch";
    public static final String REGIELEKISWITCH = "regielekiSwitch";
    public static final String REGIDRAGOSWITCH = "regidragoSwitch";
    public static final String GLASTRIERSWITCH = "glastrierSwitch";
    public static final String SPECTRIERSWITCH = "spectrierSwitch";
    public static final String CALYREXSWITCH = "calyrexSwitch";
    public static final String GBUTTERFREESWITCH = "gbutterfreeSwitch";
    public static final String GMELMETALSWITCH = "gmelmetalSwitch";
    public static final String GCORVIKNIGHTSWITCH = "gcorviknightSwitch";
    public static final String GDREDNAWSWITCH = "gdrednawSwitch";
    public static final String GCOALOSSALSWITCH = "gcoalossalSwitch";
    public static final String GFLAPPLESWITCH = "gflappleSwitch";
    public static final String GTOXTRICITYSWITCH = "gtoxtricitySwitch";
    public static final String GCENTISKORCHSWITCH = "gcentiskorchSwitch";
    public static final String GALCREMIESWITCH = "galcremieSwitch";
    public static final String GCOPPERAJAHSWITCH = "gcopperajahSwitch";
    public static final String GVENUSAURSWITCH = "gvenusaurSwitch";
    public static final String GBLASTOISESWITCH = "gblastoiseSwitch";
    public static final String GRILLABOOMSWITCH = "grillaboomSwitch";
    public static final String GCINDERACESWITCH = "gcinderaceSwitch";
    public static final String GINTELEONSWITCH = "ginteleonSwitch";
    public static final String GURSHIFUSWITCH = "gurshifuWSwitch";

    private boolean appletunSwitchONOFF;
    private boolean cursolaSwitchONOFF;
    private boolean alcremieVanillaSwitchONOFF;
    private boolean alcremieRubySwitchONOFF;
    private boolean alcremieMatchaSwitchONOFF;
    private boolean alcremieMintSwitchONOFF;
    private boolean alcremieLemonSwitchONOFF;
    private boolean alcremieSaltedSwitchONOFF;
    private boolean alcremieRubySwirlSwitchONOFF;
    private boolean alcremieCaramelSwirlSwitchONOFF;
    private boolean alcremieRainbowSwirlSwitchONOFF;
    private boolean eiscueSwitchONOFF;
    private boolean indeedeeFSwitchONOFF;
    private boolean zamazentaSwitchONOFF;
    private boolean kubfuSwitchONOFF;
    private boolean urshifuDSwitchONOFF;
    private boolean urshifuWSwitchONOFF;
    private boolean regielekiSwitchONOFF;
    private boolean regidragoSwitchONOFF;
    private boolean glastrierSwitchONOFF;
    private boolean spectrierSwitchONOFF;
    private boolean calyrexSwitchONOFF;
    private boolean gbutterfreeSwitchONOFF;
    private boolean gmelmetalSwitchONOFF;
    private boolean gcorviknightSwitchONOFF;
    private boolean gdrednawSwitchONOFF;
    private boolean gcoalossalSwitchONOFF;
    private boolean gflappleSwitchONOFF;
    private boolean gtoxtricitySwitchONOFF;
    private boolean gcentiskorchSwitchONOFF;
    private boolean galcremieSwitchONOFF;
    private boolean gcopperajahSwitchONOFF;
    private boolean gvenusaurSwitchONOFF;
    private boolean gblastoiseSwitchONOFF;
    private boolean grillaboomSwitchONOFF;
    private boolean gcinderaceSwitchONOFF;
    private boolean ginteleonSwitchONOFF;
    private boolean gurshifuWSwitchONOFF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_galar);

        appletunSwitch = findViewById(R.id.appletunToggle);
        cursolaSwitch = findViewById(R.id.cursolaToggle);
        alcremieVanillaSwitch = findViewById(R.id.alcremieVanillaToggle);
        alcremieRubySwitch = findViewById(R.id.alcremieRubyToggle);
        alcremieMatchaSwitch = findViewById(R.id.alcremieMatchaToggle);
        alcremieMintSwitch = findViewById(R.id.alcremieMintToggle);
        alcremieLemonSwitch = findViewById(R.id.alcremieLemonToggle);
        alcremieSaltedSwitch = findViewById(R.id.alcremieSaltedToggle);
        alcremieRubySwirlSwitch = findViewById(R.id.alcremieRubySwirlToggle);
        alcremieCaramelSwirlSwitch = findViewById(R.id.alcremieCaramelSwirlToggle);
        alcremieRainbowSwirlSwitch = findViewById(R.id.alcremieRainbowSwirlToggle);
        eiscueSwitch = findViewById(R.id.eiscueToggle);
        indeedeeFSwitch = findViewById(R.id.indeedeeFToggle);
        zamazentaSwitch = findViewById(R.id.zamazentaToggle);
        kubfuSwitch = findViewById(R.id.kubfuToggle);
        urshifuDSwitch = findViewById(R.id.urshifuDToggle);
        urshifuWSwitch = findViewById(R.id.urshifuWToggle);
        regielekiSwitch = findViewById(R.id.regielekiToggle);
        regidragoSwitch = findViewById(R.id.regidragoToggle);
        glastrierSwitch = findViewById(R.id.glastrierToggle);
        spectrierSwitch = findViewById(R.id.spectrierToggle);
        calyrexSwitch = findViewById(R.id.calyrexToggle);
        gbutterfreeSwitch = findViewById(R.id.gbutterfreeToggle);
        gmelmetalSwitch = findViewById(R.id.gmelmetalToggle);
        gcorviknightSwitch = findViewById(R.id.gcorviknightToggle);
        gdrednawSwitch = findViewById(R.id.gdrednawToggle);
        gcoalossalSwitch = findViewById(R.id.gcoalossalToggle);
        gflappleSwitch = findViewById(R.id.gflappleToggle);
        gtoxtricitySwitch = findViewById(R.id.gtoxtricityToggle);
        gcentiskorchSwitch = findViewById(R.id.gcentiskorchToggle);
        galcremieSwitch = findViewById(R.id.galcremieToggle);
        gcopperajahSwitch = findViewById(R.id.gcopperajahToggle);
        gvenusaurSwitch = findViewById(R.id.gvenusaurToggle);
        gblastoiseSwitch = findViewById(R.id.gblastoiseToggle);
        grillaboomSwitch = findViewById(R.id.grillaboomToggle);
        gcinderaceSwitch = findViewById(R.id.gcinderaceToggle);
        ginteleonSwitch = findViewById(R.id.ginteleonToggle);
        gurshifuSwitch = findViewById(R.id.gurshifuToggle);
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
        editor.putBoolean(APPLETUNSWITCH, appletunSwitch.isChecked());
        editor.putBoolean(CURSOLASWITCH, cursolaSwitch.isChecked());
        editor.putBoolean(ALCREMIEVANILLASWITCH, alcremieVanillaSwitch.isChecked());
        editor.putBoolean(ALCREMIERUBYSWITCH, alcremieRubySwitch.isChecked());
        editor.putBoolean(ALCREMIEMATCHASWITCH, alcremieMatchaSwitch.isChecked());
        editor.putBoolean(ALCREMIEMINTSWITCH, alcremieMintSwitch.isChecked());
        editor.putBoolean(ALCEMIELEMONSWITCH, alcremieLemonSwitch.isChecked());
        editor.putBoolean(ALCREMIESALTEDSWITCH, alcremieSaltedSwitch.isChecked());
        editor.putBoolean(ALCREMIERUBYSWIRLSWITCH, alcremieRubySwirlSwitch.isChecked());
        editor.putBoolean(ALCREMIECARAMELSWIRLSWITCH, alcremieCaramelSwirlSwitch.isChecked());
        editor.putBoolean(ALCREMIERAINBOWSWIRLSWITCH, alcremieRainbowSwirlSwitch.isChecked());
        editor.putBoolean(EISCUESWITCH, eiscueSwitch.isChecked());
        editor.putBoolean(INDEEDEEFSWITCH, indeedeeFSwitch.isChecked());
        editor.putBoolean(ZAMAZENTASWITCH, zamazentaSwitch.isChecked());
        editor.putBoolean(KUBFUSWITCH, kubfuSwitch.isChecked());
        editor.putBoolean(URSHIFUDSWITCH, urshifuDSwitch.isChecked());
        editor.putBoolean(URSHIFUWSWITCH, urshifuWSwitch.isChecked());
        editor.putBoolean(REGIELEKISWITCH, regielekiSwitch.isChecked());
        editor.putBoolean(REGIDRAGOSWITCH, regidragoSwitch.isChecked());
        editor.putBoolean(GLASTRIERSWITCH, glastrierSwitch.isChecked());
        editor.putBoolean(SPECTRIERSWITCH, spectrierSwitch.isChecked());
        editor.putBoolean(CALYREXSWITCH, calyrexSwitch.isChecked());
        editor.putBoolean(GBUTTERFREESWITCH, gbutterfreeSwitch.isChecked());
        editor.putBoolean(GMELMETALSWITCH, gmelmetalSwitch.isChecked());
        editor.putBoolean(GCORVIKNIGHTSWITCH, gcorviknightSwitch.isChecked());
        editor.putBoolean(GDREDNAWSWITCH, gdrednawSwitch.isChecked());
        editor.putBoolean(GCOALOSSALSWITCH, gcoalossalSwitch.isChecked());
        editor.putBoolean(GFLAPPLESWITCH, gflappleSwitch.isChecked());
        editor.putBoolean(GTOXTRICITYSWITCH, gtoxtricitySwitch.isChecked());
        editor.putBoolean(GCENTISKORCHSWITCH, gcentiskorchSwitch.isChecked());
        editor.putBoolean(GALCREMIESWITCH, galcremieSwitch.isChecked());
        editor.putBoolean(GCOPPERAJAHSWITCH, gcopperajahSwitch.isChecked());
        editor.putBoolean(GVENUSAURSWITCH, gvenusaurSwitch.isChecked());
        editor.putBoolean(GBLASTOISESWITCH, gblastoiseSwitch.isChecked());
        editor.putBoolean(GRILLABOOMSWITCH, grillaboomSwitch.isChecked());
        editor.putBoolean(GCINDERACESWITCH, gcinderaceSwitch.isChecked());
        editor.putBoolean(GINTELEONSWITCH, ginteleonSwitch.isChecked());
        editor.putBoolean(GURSHIFUSWITCH, gurshifuSwitch.isChecked());

        editor.apply();

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        appletunSwitchONOFF = sharedPreferences.getBoolean(APPLETUNSWITCH, false);
        cursolaSwitchONOFF = sharedPreferences.getBoolean(CURSOLASWITCH, false);
        alcremieVanillaSwitchONOFF = sharedPreferences.getBoolean(ALCREMIEVANILLASWITCH, false);
        alcremieRubySwitchONOFF = sharedPreferences.getBoolean(ALCREMIERUBYSWITCH, false);
        alcremieMatchaSwitchONOFF = sharedPreferences.getBoolean(ALCREMIEMATCHASWITCH, false);
        alcremieMintSwitchONOFF = sharedPreferences.getBoolean(ALCREMIEMINTSWITCH, false);
        alcremieLemonSwitchONOFF = sharedPreferences.getBoolean(ALCEMIELEMONSWITCH, false);
        alcremieSaltedSwitchONOFF = sharedPreferences.getBoolean(ALCREMIESALTEDSWITCH, false);
        alcremieRubySwirlSwitchONOFF = sharedPreferences.getBoolean(ALCREMIERUBYSWIRLSWITCH, false);
        alcremieCaramelSwirlSwitchONOFF = sharedPreferences.getBoolean(ALCREMIECARAMELSWIRLSWITCH, false);
        alcremieRainbowSwirlSwitchONOFF = sharedPreferences.getBoolean(ALCREMIERAINBOWSWIRLSWITCH, false);
        eiscueSwitchONOFF = sharedPreferences.getBoolean(EISCUESWITCH, false);
        indeedeeFSwitchONOFF = sharedPreferences.getBoolean(INDEEDEEFSWITCH, false);
        zamazentaSwitchONOFF = sharedPreferences.getBoolean(ZAMAZENTASWITCH, false);
        kubfuSwitchONOFF = sharedPreferences.getBoolean(KUBFUSWITCH, false);
        urshifuDSwitchONOFF = sharedPreferences.getBoolean(URSHIFUDSWITCH, false);
        urshifuWSwitchONOFF = sharedPreferences.getBoolean(URSHIFUWSWITCH, false);
        regielekiSwitchONOFF = sharedPreferences.getBoolean(REGIELEKISWITCH, false);
        regidragoSwitchONOFF = sharedPreferences.getBoolean(REGIDRAGOSWITCH, false);
        glastrierSwitchONOFF = sharedPreferences.getBoolean(GLASTRIERSWITCH, false);
        spectrierSwitchONOFF = sharedPreferences.getBoolean(SPECTRIERSWITCH, false);
        calyrexSwitchONOFF = sharedPreferences.getBoolean(CALYREXSWITCH, false);
        gbutterfreeSwitchONOFF = sharedPreferences.getBoolean(GBUTTERFREESWITCH, false);
        gmelmetalSwitchONOFF = sharedPreferences.getBoolean(GMELMETALSWITCH, false);
        gcorviknightSwitchONOFF = sharedPreferences.getBoolean(GCORVIKNIGHTSWITCH, false);
        gdrednawSwitchONOFF = sharedPreferences.getBoolean(GDREDNAWSWITCH, false);
        gcoalossalSwitchONOFF = sharedPreferences.getBoolean(GCOALOSSALSWITCH, false);
        gflappleSwitchONOFF = sharedPreferences.getBoolean(GFLAPPLESWITCH, false);
        gtoxtricitySwitchONOFF = sharedPreferences.getBoolean(GTOXTRICITYSWITCH, false);
        galcremieSwitchONOFF = sharedPreferences.getBoolean(GALCREMIESWITCH, false);
        gcopperajahSwitchONOFF = sharedPreferences.getBoolean(GCOPPERAJAHSWITCH, false);
        gvenusaurSwitchONOFF = sharedPreferences.getBoolean(GVENUSAURSWITCH, false);
        gblastoiseSwitchONOFF = sharedPreferences.getBoolean(GBLASTOISESWITCH, false);
        grillaboomSwitchONOFF = sharedPreferences.getBoolean(GRILLABOOMSWITCH, false);
        gcinderaceSwitchONOFF = sharedPreferences.getBoolean(GCINDERACESWITCH, false);
        ginteleonSwitchONOFF = sharedPreferences.getBoolean(GINTELEONSWITCH, false);
        gurshifuWSwitchONOFF = sharedPreferences.getBoolean(GURSHIFUSWITCH, false);
    }

    public void updateViews(){
        appletunSwitch.setChecked(appletunSwitchONOFF);
        cursolaSwitch.setChecked(cursolaSwitchONOFF);
        alcremieVanillaSwitch.setChecked(alcremieVanillaSwitchONOFF);
        alcremieRubySwitch.setChecked(alcremieRubySwitchONOFF);
        alcremieMatchaSwitch.setChecked(alcremieMatchaSwitchONOFF);
        alcremieMintSwitch.setChecked(alcremieMintSwitchONOFF);
        alcremieLemonSwitch.setChecked(alcremieLemonSwitchONOFF);
        alcremieSaltedSwitch.setChecked(alcremieSaltedSwitchONOFF);
        alcremieRubySwirlSwitch.setChecked(alcremieRubySwirlSwitchONOFF);
        alcremieCaramelSwirlSwitch.setChecked(alcremieCaramelSwirlSwitchONOFF);
        alcremieRainbowSwirlSwitch.setChecked(alcremieRainbowSwirlSwitchONOFF);
        eiscueSwitch.setChecked(eiscueSwitchONOFF);
        indeedeeFSwitch.setChecked(indeedeeFSwitchONOFF);
        zamazentaSwitch.setChecked(zamazentaSwitchONOFF);
        kubfuSwitch.setChecked(kubfuSwitchONOFF);
        urshifuDSwitch.setChecked(urshifuDSwitchONOFF);
        urshifuWSwitch.setChecked(urshifuWSwitchONOFF);
        regielekiSwitch.setChecked(regielekiSwitchONOFF);
        regidragoSwitch.setChecked(regidragoSwitchONOFF);
        glastrierSwitch.setChecked(glastrierSwitchONOFF);
        spectrierSwitch.setChecked(spectrierSwitchONOFF);
        calyrexSwitch.setChecked(calyrexSwitchONOFF);
        gbutterfreeSwitch.setChecked(gbutterfreeSwitchONOFF);
        gmelmetalSwitch.setChecked(gmelmetalSwitchONOFF);
        gcorviknightSwitch.setChecked(gcorviknightSwitchONOFF);
        gdrednawSwitch.setChecked(gdrednawSwitchONOFF);
        gcoalossalSwitch.setChecked(gcoalossalSwitchONOFF);
        gflappleSwitch.setChecked(gflappleSwitchONOFF);
        gtoxtricitySwitch.setChecked(gtoxtricitySwitchONOFF);
        galcremieSwitch.setChecked(galcremieSwitchONOFF);
        gcopperajahSwitch.setChecked(gcopperajahSwitchONOFF);
        gvenusaurSwitch.setChecked(gvenusaurSwitchONOFF);
        gblastoiseSwitch.setChecked(gblastoiseSwitchONOFF);
        grillaboomSwitch.setChecked(grillaboomSwitchONOFF);
        gcinderaceSwitch.setChecked(gcinderaceSwitchONOFF);
        ginteleonSwitch.setChecked(ginteleonSwitchONOFF);
        gurshifuSwitch.setChecked(gurshifuWSwitchONOFF);

    }
}
