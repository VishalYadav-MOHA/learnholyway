package com.example.moha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    TextView txtTop, txtBelow, txtBelowImg, txtActionBar;
    EditText edtPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        Typeface typeface = ResourcesCompat.getFont(this, R.font.sansation);

        Typeface typeface1 = ResourcesCompat.getFont(this, R.font.akaya);


        edtPhone = (EditText) findViewById(R.id.edtLogin);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtTop = (TextView) findViewById(R.id.txtTop);
        txtActionBar = (TextView) findViewById(R.id.txtActionBar);
        txtBelow = (TextView) findViewById(R.id.txtBelowTop);
        txtBelowImg = (TextView) findViewById(R.id.txtBelowImg);
        txtTop.setTypeface(typeface1);
        txtBelow.setTypeface(typeface);
        btnLogin.setTypeface(typeface);
        txtBelowImg.setTypeface(typeface);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String mobile = edtPhone.getText().toString().trim();

                if (mobile.isEmpty() || mobile.length() < 10) {
                    edtPhone.setError("Enter a valid mobile");
                    edtPhone.requestFocus();
                    return;
                }

                Intent intent = new Intent(LoginActivity.this, OTPActivity.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);

            }
        });


        txtActionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}