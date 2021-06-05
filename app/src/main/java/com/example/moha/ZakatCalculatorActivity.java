package com.example.moha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ZakatCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_calculator);
        getSupportActionBar().hide();
    }
}