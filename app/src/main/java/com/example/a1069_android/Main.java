package com.example.a1069_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    double total;
    TextView totalTextView= (TextView) findViewById(R.id.Total);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView totalTextView= (TextView) findViewById(R.id.Total);



    }
    public void onButtonClick (View v) {
        switch (v.getId())   {

            case R.id.SM:
                System.out.println("Selected Nespresso");
                total= total+3.75;
                totalTextView.setText("Total is $"+total);

            case R.id.Sa:
                System.out.println(" Seleced Turkish coffee");
                total= total+3.50;
                totalTextView.setText("Total is $"+total);

            case R.id.SIA:
                System.out.println("Selected Chocolate Frappe");
                total= total+4.00;
                totalTextView.setText("Total is $"+total);
        }
    }
}
