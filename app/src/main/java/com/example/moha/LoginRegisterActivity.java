package com.example.moha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginRegisterActivity extends AppCompatActivity {

    TextView txtTop, txtBelowTop, txtBelow, txtRegisterTutor;
    Button btnLogin, btnRegister;

    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        getSupportActionBar().hide();
        Typeface typeface = ResourcesCompat.getFont(this, R.font.sansation);

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.akaya);


        txtTop = (TextView) findViewById(R.id.txtTop);
        txtTop.setTypeface(typeface1);
        txtBelowTop = (TextView) findViewById(R.id.txtBelowTop);
        txtBelowTop.setTypeface(typeface);
        txtBelow = (TextView) findViewById(R.id.txtBelow);
        txtBelow.setTypeface(typeface);
        txtRegisterTutor = (TextView) findViewById(R.id.txtRegisterTutor);
        txtRegisterTutor.setTypeface(typeface);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setTypeface(typeface);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setTypeface(typeface);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginRegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginRegisterActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
        txtRegisterTutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginRegisterActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

    }
}