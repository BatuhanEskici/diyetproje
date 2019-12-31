package com.example.diyetproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class diyetsayfa extends AppCompatActivity {
private String gunler[] = {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
    public String[] deneme = {"                                       \n\nSabah Kahvaltı;\n•1 dilim kepek ekmeği\n•1 dilim beyaz peynir\n•Bol domates\n•Salatalık\n\nAra Öğün;\n•1 adet meyve\n\nÖğle Yemeği;\n•100gr. yağsız etli salata\n•1 kase light yoğurt\n•1 kase çorba\n\nAra Öğün;\n•1 adet meyve\n•2ceviz, 6 fındık veya badem\n\nAkşam Yemeği;\n•7 yemek kaşığı etsiz sebze yemeği\n•1 ince dilim kepek ekmeği "
            ,"                                      \n\nSabah Kahvaltı;\n•1 kepekli ekmeğe tost\n•Bol domates\n•Salatalık\n•Biber\n•Zeytin\n\nAra Öğün;\n•1 adet meyve\n•1 kase light yoğurt\n\nÖğlen Yemeği;\n•6 yemek kaşığı etli türlü\n•1 ince dilim kepek ekmeği\n•Bol yağsız salata\n\nAra Öğün;\n•1 adet meyve\n•1 kase yoğurt\n\nAkşam Yemeği\n•1 dilim kepek ekmeği\n•7 yemek kaşığı etsiz taze fasulye\n•1 kase light yoğurt\n•Bol yağsız salata "
            ,"                                      \n\nSabah Kahvaltı\n•2 ince dilim kepek ekmeği\n•1 dilim beyaz peynir\n•Bol domates\n•Salatalık\n•Biber\n•5 adet Zeytin\n\nÖğlen Yemeği;\n•1 dilim kepek ekmeği\n•6 yemek kaşığı sebze yemeği\n\nAra Öğün;\n•1 adet meyve\n•Yarım paket diyet bisküvi\n•2 yemek kaşığı yoğurt\n\nAkşam Yemeği;\n•1 ince dilim kepek ekmeği\n•7 yemek kaşığı etsiz kabak yemeği\n•Yağsız Bol Salata\n•Yarım kase light yoğurt"
            ,"                                      \n\nSabah Kahvaltı;\n•1 ince dilim kepek ekmeği\n•1 haşlanmış yumurta\n•Bol domates\n•Salatalık\n•Biber\n\nÖğlen Yemeği;\n•1 adet sandviç(tavuklu,ton balıklı,peynirli)içerisinde domates, biber ve marul olsun\n•1 bardak ayran\n\nAkşam Yemeği;\n•1 ince dilim kepek ekmeği\n•7 yemek kaşığı etsiz türlü\n•1 kase light yoğurt\n•Bol yağsız salata"
            ,"                                      \n\nSabah Kahvaltı;\n•1 yumurtalı omlet\n•1 dilim kepek ekmeği\n•Domates,salatalık,biber\n•5 adet zeytin\n\nÖğle Yemeği;\n•4 adet ızgara köfte\n•Bol yağsız salata\n\nAra Öğün\n•1 adet meyve\n•1 kase light yoğurt\n\nAkşam Yemeği\n•1 dilim ince kepek ekmeği\n•7 yemek kaşığı sebze yemeği\n•Bol yağsız salata"
            ,"                                      \n\nSabah Kahvaltı;\n•2-3 yemek kaşığı müsli\n•1 bardak ayran\n\nAra Öğün;\n•1 adet meyve\n•4-5 adet badem\n\nÖğlen Yemeği;\n•7 yemek kaşığı sebze yemeği\n•Bir kase light yoğurt\n\nAkşam yemeği;\n•Izgara tavuk\n•Yarım porsiyon bulgur pilavı"
            ,"                                      \n\nSabah Kahvaltı;\n•1 adet melemen\n•1 dilim kepek ekmeği\n\nAra Öğün;\n•1 kase yoğurt\n•1 adet muz\n\nÖğlen Yemeği;\n•Izgara balık\n•Bol yağsız salata\n\nAkşam yemeği;\n•1 dilim kepek ekmeği\n•7 yemek kaşığı zeytinyağlı sebze yemeği\n•1 kase light yoğurt"};
private Spinner spinnerMenu;
private ArrayAdapter<String> dataAdepterForMenu;
TextView txtteam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyetsayfa);

        spinnerMenu = (Spinner) findViewById(R.id.spinner);
        dataAdepterForMenu = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,gunler);
        dataAdepterForMenu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMenu.setAdapter(dataAdepterForMenu);
        txtteam = (TextView) findViewById(R.id.textView2);
        spinnerMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int secim = parent.getSelectedItemPosition();
                switch (secim) {
                    case 0 :
                        txtteam.setText(deneme[0]);
                        break;
                    case 1 :
                        txtteam.setText(deneme[1]);
                        break;
                    case 2:
                        txtteam.setText(deneme[2]);
                        break;
                    case 3:
                        txtteam.setText(deneme[3]);
                        break;
                    case 4:
                        txtteam.setText(deneme[4]);
                        break;
                    case 5:
                        txtteam.setText(deneme[5]);
                        break;
                    case 6:
                        txtteam.setText(deneme[6]);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
