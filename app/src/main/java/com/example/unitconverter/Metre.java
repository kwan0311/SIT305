package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Metre extends AppCompatActivity {
    TextView metre1;
    TextView metre2;
    TextView metre3;

    DecimalFormat Format = new DecimalFormat("$###,###.##");

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metre);

        metre1 = findViewById(R.id.Metre1);
        metre2 = findViewById(R.id.Metre2);
        metre3 = findViewById(R.id.Metre3);

        Intent intent = getIntent();
        Double double3;
        double3 = intent.getDoubleExtra(MainActivity.EXTRA_DOUBLE,0);
        EditText editText2 = (EditText) findViewById(R.id.UserValue1);

        editText2.setText(""+ double3);

        double CentiMeter = double3 * 100;
        metre1.setText("" + Format.format(CentiMeter));

        double Foot = double3 * 3.28;
        metre2.setText("" + Format.format(Foot));

        double Inch = double3 * 39.37;
        metre3.setText(""+ Format.format(Inch));


    }
}