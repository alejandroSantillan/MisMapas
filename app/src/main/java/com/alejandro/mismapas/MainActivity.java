package com.alejandro.mismapas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irAMapaLugar1(View view){
        Intent intent =new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra("LATITUD",19.438404728521874);
        intent.putExtra("LONGITUD",-99.22261492756047);
        intent.putExtra("TEXTO",getString(R.string.hipodromo));
        startActivity(intent);
    }

    public void irAMapaLugar2(View view){
        Intent intent =new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra("LATITUD",19.44067098572732);
        intent.putExtra("LONGITUD",-99.2046816780869);
        intent.putExtra("TEXTO",getString(R.string.museo));
        startActivity(intent);
    }

    public void irAMapaLugar3(View view){
        Intent intent =new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra("LATITUD",19.29565801378899);
        intent.putExtra("LONGITUD",-99.2105771735016321312);
        intent.putExtra("TEXTO",getString(R.string.parque));
        startActivity(intent);
    }

    public void irAMapaLugar4(View view){
        Intent intent =new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra("LATITUD",19.432606091722427);
        intent.putExtra("LONGITUD",-99.13320185256572);
        intent.putExtra("TEXTO",getString(R.string.zocalo));
        startActivity(intent);
    }
}
