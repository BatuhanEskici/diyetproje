package com.example.diyetproje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hesaplasayfa extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesaplasayfa);
    }
    TextView sonuctxt,sonuc2txt;
    EditText edt1,edt2;
    public void hesapla(View view) {
        Double boy,kilo,sonuc;
        sonuctxt = (TextView) findViewById(R.id.txt3);
        sonuc2txt = (TextView) findViewById(R.id.txt4);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        kilo = Double.parseDouble(edt1.getText().toString());
        boy = Double.parseDouble(edt2.getText().toString());
        sonuc = kilo/(boy*boy);
        if(sonuc<18.5)
        {
            sonuctxt.setText("Zayıf");
            sonuc2txt.setText(sonuc.toString());

        }
        else if(sonuc<25)
        {
            sonuctxt.setText("İdeal");
            sonuc2txt.setText(sonuc.toString());
        }
        else if(sonuc<30)
        {
            sonuctxt.setText("Fazla Kilolu");
            sonuc2txt.setText(sonuc.toString());
        }
        else if(sonuc<40)
        {
            sonuctxt.setText("Obazite I");
            sonuc2txt.setText(sonuc.toString());
        }
        else
        {
            sonuctxt.setText("Obazite II");
            sonuc2txt.setText(sonuc.toString());
        }
    }
}
