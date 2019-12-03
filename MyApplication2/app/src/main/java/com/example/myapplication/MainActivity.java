package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void savedata(View view) {

        EditText name= (EditText) findViewById(R.id.txt1);
        EditText email= (EditText) findViewById(R.id.txt2);
        EditText number= (EditText) findViewById(R.id.txt3);
        EditText pass= (EditText) findViewById(R.id.txt4);

        Intent myintent=new Intent(this,Activity2.class);
    Bundle b=new Bundle();
    b.putString("name",name.getText().toString());
    b.putString("email",email.getText().toString());
    b.putString("number",number.getText().toString());
    b.putString("pass",pass.getText().toString());
    myintent.putExtras(b);
        startActivity(myintent);
    }



    public void delet(View view) {

        EditText name= (EditText) findViewById(R.id.txt1);
        EditText email= (EditText) findViewById(R.id.txt2);
        EditText number= (EditText) findViewById(R.id.txt3);
        EditText pass= (EditText) findViewById(R.id.txt4);
        name.setText("");
        email.setText("");
        number.setText("");
        pass.setText("");

    }
}
