package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private int numero = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MiModelo modelo = new MiModelo();
        modelo.getApellido()

        Log.e("Manel Error","Mensaje de Error");
        Log.e(TAG, "Otro Mensaje De Error");

        Log.i(TAG,"este mensaje es de informacion: "+numero);

        Log.w(TAG, "esto es un warning");

        Log.d(TAG, "esto es el debug");
    }
}
