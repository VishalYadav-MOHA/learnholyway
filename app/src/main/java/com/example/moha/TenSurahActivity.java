package com.example.moha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TenSurahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_surah);
        getSupportActionBar().hide();
    }
}