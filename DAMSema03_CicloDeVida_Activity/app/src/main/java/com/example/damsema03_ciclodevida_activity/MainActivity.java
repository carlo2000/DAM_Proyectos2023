package com.example.damsema03_ciclodevida_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Entramos al método onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Entramos al método onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Entramos al método OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Entramos al método onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Entramos al método onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Entramos al método onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Entramos al método onDestroy()");
    }
}