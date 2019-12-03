package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView txt1=(TextView)findViewById(R.id.txt1);
        TextView txt2=(TextView)findViewById(R.id.txt2);
        TextView txt3=(TextView)findViewById(R.id.txt3);
        TextView txt4=(TextView)findViewById(R.id.txt4);

        Bundle b=getIntent().getExtras();
    String name=b.getString("name");
    String email=b.getString("email");
    String number=b.getString("number");
    String pass=b.getString("pass");

        txt1.setText(name);
        txt2.setText(email);
        txt3.setText(number);
        txt4.setText(pass);
    }

    public void back(View view) {
        Intent myintent=new Intent(this,MainActivity.class);
        startActivity(myintent);
    }}


