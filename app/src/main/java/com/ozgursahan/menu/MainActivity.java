package com.ozgursahan.menu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float toplam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        toplam=intent.getFloatExtra("toplam",0);
    }

    public void fiyat (View view) {
        Intent intent = new Intent(getApplicationContext(),Fiyatlar.class);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }

    public void siparis (View view) {
        Intent intent = new Intent(getApplicationContext(),Siparis.class);
        intent.putExtra("toplam",toplam);
        startActivity(intent);
    }

    public void son (View view) {

        AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Exit");
        alert.setMessage("Are you sure?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Exit!",Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //nothing
            }
        });

        alert.show();
    }
}