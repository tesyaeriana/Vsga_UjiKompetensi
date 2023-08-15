package com.example.vsga_ujikompetensi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {
    private EditText username, password;
    private Button btnLogin;

    private String setusername = "Tesya";
    private String setpassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.loginbtn);


       btnLogin.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
                if(username.getText().toString().equalsIgnoreCase(setusername) && password.getText().toString().equalsIgnoreCase(setpassword)){
                    Intent login = new Intent(login.this, LoginSuccess.class);
                    startActivity(login);


                }else{
                    Toast.makeText(login.this, "LOGIN GAGAL", Toast.LENGTH_SHORT).show();
                }
           }
       });

    }
}