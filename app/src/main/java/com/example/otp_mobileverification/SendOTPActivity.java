package com.example.otp_mobileverification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendOTPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_otp);


        final EditText inputMobile = findViewById(R.id.inputMobileNumber);
        Button buttonGetOTP = findViewById(R.id.buttonGetOTP);

        buttonGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputMobile.getText().toString().trim().isEmpty()){
                    Toast.makeText(SendOTPActivity.this, "Enter Mobile Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), VerifyOTPActivity.class);
                intent.putExtra("mobile", inputMobile.getText().toString());
                startActivity(intent);
            }
        });
    }
}
