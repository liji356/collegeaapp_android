package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddstudentActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;

    String getName,getRoll,getAdmin,getCollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addstudent);

        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.roll);
        ed3=(EditText) findViewById(R.id.admin);
        ed4=(EditText) findViewById(R.id.college);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.backdash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = ed1.getText().toString();
                getRoll = ed2.getText().toString();
                getAdmin = ed3.getText().toString();
                getCollege = ed4.getText().toString();

                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getRoll, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getAdmin, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getCollege, Toast.LENGTH_SHORT).show();
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