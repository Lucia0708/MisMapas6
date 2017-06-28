package com.example.lucia.mismapas6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView centro;
    private ImageView calvillo;
    private ImageView plaza;
    private ImageView jardin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        centro = (ImageView) findViewById(R.id.ivfoto1);
        centro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("longitud", -102.29812229653163);
                intent.putExtra("latitud", 21.88044143688678);
                intent.putExtra("sitio", "Centro de Aguascalientes");
                startActivity(intent);

            }
        });

        jardin = (ImageView) findViewById(R.id.ivfoto2);
        jardin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("longitud", -102.30321849365993);
                intent.putExtra("latitud", 21.879585221025916);
                intent.putExtra("sitio", "Jardin de San Marcos");
                startActivity(intent);
            }
        });

        plaza = (ImageView) findViewById(R.id.ivfoto3);
        plaza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("longitud",-102.29599798699184);
                intent.putExtra("latitud", 21.880650512073107);
                intent.putExtra("sitio", "Plaza de la Patria");
                startActivity(intent);
            }
        });

        calvillo = (ImageView) findViewById(R.id.ivfoto4);
        calvillo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("longitud", -102.71875167866511);
                intent.putExtra("latitud", 21.84639792146475);
                intent.putExtra("sitio", "Calvillo");
                startActivity(intent);
            }
        });



    }
}
