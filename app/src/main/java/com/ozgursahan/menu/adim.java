package com.ozgursahan.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class adim extends AppCompatActivity {

    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView totalText;
    EditText number;
    float toplam;
    String control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adim);

        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        totalText=findViewById(R.id.totalText);

        Intent intent=getIntent();
        control=intent.getStringExtra("userInput");
        number=findViewById(R.id.number);
        toplam=intent.getFloatExtra("toplam",toplam);
        totalText.setText("Toplam: "+toplam+" TL");

        if(control.matches("telefon"))
        {
            textView4.setText("Akıllı Telefon 1= 1500 TL");
            textView5.setText("Akıllı Telefon 2= 2750 TL");
            textView6.setText("Akıllı Telefon 3= 8832 TL");
            textView7.setText("");
        }
        else if(control.matches("saat"))
        {
            textView4.setText("Akıllı Saat 1= 543.99 TL");
            textView5.setText("Akıllı Saat 2= 1324.50 TL");
            textView6.setText("Akıllı Saat 3= 850 TL");
            textView7.setText("");
        }
        else if(control.matches("yazici"))
        {
            textView4.setText("Yazıcı 1= 553.50 TL");
            textView5.setText("Yazıcı 2= 848.20 TL");
            textView6.setText("Yazıcı 3= 1433.33 TL");
            textView7.setText("");
        }
        else if(control.matches("bilgisayar"))
        {
            textView4.setText("Bilgisayar 1= 14600 TL");
            textView5.setText("Bilgisayar 2= 12964 TL");
            textView6.setText("Bilgisayar 3= 22920 TL");
            textView7.setText("Bilgisayar 4= 36123 TL");
        }
    }

    public void ekle (View view) {

        if(control.matches("telefon"))
        {
            if(number.getText().toString().matches("1"))
            {
                toplam+=1500;
            }
            else if(Integer.parseInt(number.getText().toString())==2)
            {
                toplam+=2750;
            }
            else if(Integer.parseInt(number.getText().toString())==3)
            {
                toplam+=8832;
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Geçerli Değil",Toast.LENGTH_LONG).show();
            }
        }

        else if(control.matches("saat"))
        {
            if(Integer.parseInt(number.getText().toString())==1)
            {
                toplam+=543.99;
            }
            else if(Integer.parseInt(number.getText().toString())==2)
            {
                toplam+=1324.50;
            }
            else if(Integer.parseInt(number.getText().toString())==3)
            {
                toplam+=850;
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Geçerli Değil",Toast.LENGTH_LONG).show();
            }
        }

        else if(control.matches("yazici"))
        {
            if(Integer.parseInt(number.getText().toString())==1)
            {
                toplam+=553.50;
            }
            else if(Integer.parseInt(number.getText().toString())==2)
            {
                toplam+=848.20;
            }
            else if(Integer.parseInt(number.getText().toString())==3)
            {
                toplam+=1433.33;
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Geçerli Değil",Toast.LENGTH_LONG).show();
            }
        }

        else if(control.matches("bilgisayar"))
        {
            if(Integer.parseInt(number.getText().toString())==1)
            {
                toplam+=14600;
            }
            else if(Integer.parseInt(number.getText().toString())==2)
            {
                toplam+=12964;
            }
            else if(Integer.parseInt(number.getText().toString())==3)
            {
                toplam+=22920;
            }
            else if(Integer.parseInt(number.getText().toString())==4)
            {
                toplam+=36123;
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Geçerli Değil",Toast.LENGTH_LONG).show();
            }
        }

        totalText.setText("Toplam: "+toplam+" TL");
    }

    public void baskaurun (View view) {
        Intent intent = new Intent(getApplicationContext(),Fiyatlar.class);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }

    public void anamenu (View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }
}