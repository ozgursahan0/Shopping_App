package com.ozgursahan.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Siparis extends AppCompatActivity {

    TextView result;
    float toplam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siparis);

        Intent intent=getIntent();
        toplam=intent.getFloatExtra("toplam",0);
        result=findViewById(R.id.result);

        result.setText("Sipariş Toplamı: "+toplam+" TL");
    }

    public void anamenu (View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }

    public void ode (View view) {

        if(toplam!=0)
        {
            Toast.makeText(getApplicationContext(),"Ödeme Başarılı",Toast.LENGTH_LONG).show();
            toplam=0;
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Sipariş Bulunamadı",Toast.LENGTH_LONG).show();
        }

    }
}