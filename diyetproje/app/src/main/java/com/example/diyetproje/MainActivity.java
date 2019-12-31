package com.example.diyetproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity2(View view) {
        Intent intent = new Intent(this,diyetsayfa.class);
        startActivity(intent);
    }
    public void openActivity3(View view) {
        Intent intent = new Intent(this,oyunsayfa.class);
        startActivity(intent);
    }
    public void openActivity4(View view) {
        Intent intent = new Intent(this,hesaplasayfa.class);
        startActivity(intent);
    }
    public void openActivity5(View view) {
        Intent intent = new Intent(this,egzersizsayfa.class);
        startActivity(intent);
    }
}
