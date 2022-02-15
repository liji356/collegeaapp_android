package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class AddsearchfacultyActivity extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1, b2;

    String getName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addsearchfaculty);
        ed1=(EditText) findViewById(R.id.na);
        b1=(AppCompatButton) findViewById(R.id.se);
        b2= (AppCompatButton) findViewById(R.id.da);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             getName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}