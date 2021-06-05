package com.example.moha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuranSelectPlanActivity extends AppCompatActivity {

    TextView txtactionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_select_plan);
        getSupportActionBar().hide();

        txtactionBar = (TextView) findViewById(R.id.txtActionBar);


        txtactionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}