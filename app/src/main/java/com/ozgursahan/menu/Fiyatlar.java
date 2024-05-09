package com.ozgursahan.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fiyatlar extends AppCompatActivity {

    String control;
    float toplam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiyatlar);

        Intent intent=getIntent();
        toplam=intent.getFloatExtra("toplam",0);
    }

    public void telefon (View view) {
        control="telefon";
        Intent intent = new Intent(getApplicationContext(), adim.class);
        intent.putExtra("userInput",control);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }

    public void saat (View view) {
        control="saat";
        Intent intent = new Intent(getApplicationContext(), adim.class);
        intent.putExtra("userInput",control);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }

    public void yazici (View view) {
        control="yazici";
        Intent intent = new Intent(getApplicationContext(), adim.class);
        intent.putExtra("userInput",control);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }

    public void bilgisayar (View view) {
        control="bilgisayar";
        Intent intent = new Intent(getApplicationContext(), adim.class);
        intent.putExtra("userInput",control);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }
}