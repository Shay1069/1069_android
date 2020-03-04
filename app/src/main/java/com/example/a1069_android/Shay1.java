package com.example.a1069_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Shay1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shay1);
    }
    public void onButtonClick(View v){
        Intent myIntent= new Intent(getBaseContext(),Main.class);
        startActivity(myIntent);

    }

}

