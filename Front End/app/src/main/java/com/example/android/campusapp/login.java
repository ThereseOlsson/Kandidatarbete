package com.example.android.campusapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class login extends AppCompatActivity {

    public void buttonOnClick(View v){

       Button loginButton = (Button) v;
        if( v instanceof Button) {
            System.out.println("Hej");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
