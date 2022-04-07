package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Celsius extends AppCompatActivity {
    TextView celsius1;
    TextView celsius2;

    DecimalFormat Format = new DecimalFormat("$###,###.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius);
        celsius1 = findViewById(R.id.Celsius1);
        celsius2 = findViewById(R.id.Celsius2);


        Intent intent = getIntent();
        Double double2 = intent.getDoubleExtra(MainActivity.EXTRA_DOUBLE,0);
        EditText editText2 = (EditText) findViewById(R.id.UserValue1);

        editText2.setText(""+ double2);

        double Fahrenheit = double2 * 1.8 + 32;
        celsius1.setText("" + Format.format(Fahrenheit));

        double Kelvin = double2 + 273.15;
        celsius2.setText("" + Format.format(Kelvin));
    }
}