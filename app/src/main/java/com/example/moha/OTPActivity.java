package com.example.moha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.google.android.material.snackbar.Snackbar;

public class OTPActivity extends AppCompatActivity {

    Button btnLogin;

    TextView txtTerm, txtCondition, txtActionBar;

    RelativeLayout relativeLayout;
    PopupWindow popupWindow;

    AlertDialog.Builder builder;

    CheckBox chkTerm;

    private String mVerificationId;

    //The pinView to input the code
    // private pinView pinViewCode;

    private String verificationId;


    private PinView pinView;
    private CheckBox chkCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);

        getSupportActionBar().hide();
        btnLogin = (Button) findViewById(R.id.btnOtpLogin);
        pinView = (PinView) findViewById(R.id.pin_view);

        chkTerm = (CheckBox) findViewById(R.id.chkTerm);
        txtTerm = (TextView) findViewById(R.id.txtTerm);
        txtCondition = (TextView) findViewById(R.id.txtCondition);

        txtActionBar = (TextView) findViewById(R.id.txtActionBar);
        chkCheckBox = (CheckBox) findViewById(R.id.chkTerm);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String code = pinView.getText().toString().trim();
                if (code.isEmpty() || code.length() < 6) {
                    pinView.setError("Enter valid code");
                    pinView.requestFocus();
                    return;
                } else if (!chkCheckBox.isChecked()) {
                    Toast.makeText(OTPActivity.this, "Accept terms and conditions", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(OTPActivity.this, UserSelectActivity.class);
                    startActivity(intent);
                }
            }
        });


        txtCondition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OTPActivity.this, TermsAcivity.class);
                startActivity(intent);

            }
        });

        txtTerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OTPActivity.this, TermsAcivity.class);
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

/*
    private void verifyCode(String code) {
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, code);
        signInWithCredential(credential);
    }

    private void signInWithCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Intent intent = new Intent(OTPActivity.this, UserSelectActivity.class);
                            startActivity(intent);
                            finish();

                        } else {
                            Toast.makeText(OTPActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    private void sendVerificationCode(String number) {

        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber("+91"+number)       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // Activity (for callback binding)
                        .setCallbacks(mCallBack)          // OnVerificationStateChangedCallbacks
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);

    }


    //the callback to detect the verification status
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks
            mCallBack = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            verificationId = s;
        }

        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            String code = phoneAuthCredential.getSmsCode();
            if (code != null) {
                pinView.setText(code);
                verifyCode(code);
            }
        }

        @Override
        public void onVerificationFailed(FirebaseException e) {
            Toast.makeText(OTPActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    };

*/

}