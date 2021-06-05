package com.example.moha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserSelectActivity extends AppCompatActivity {

    Button btnContinue;
    TextView textActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_select);
        getSupportActionBar().hide();

        Typeface typeface = ResourcesCompat.getFont(this, R.font.sansation);

        btnContinue = (Button) findViewById(R.id.btnContinue);
        textActionBar = (TextView) findViewById(R.id.txtActionBar);
        btnContinue.setTypeface(typeface);
        textActionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserSelectActivity.this, BottomActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}