package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4, ed5;
    AppCompatButton b1, b2;

    String getName, getMob, getEmail, getPass, getCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1 = (EditText) findViewById(R.id.nam);
        ed2 = (EditText) findViewById(R.id.mob);
        ed3 = (EditText) findViewById(R.id.email);
        ed4 = (EditText) findViewById(R.id.pass);
        ed5 = (EditText) findViewById(R.id.con);
        b1 = (AppCompatButton) findViewById(R.id.reg);
        b2 = (AppCompatButton) findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = ed1.getText().toString();
                getMob = ed2.getText().toString();
                getEmail = ed3.getText().toString();
                getPass = ed4.getText().toString();
                getCon = ed5.getText().toString();

                if (getPass.equals(getCon)) {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getMob, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getEmail, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getPass, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getCon, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "password and conform password doesn't match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}