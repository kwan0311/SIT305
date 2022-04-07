package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Kilograms extends AppCompatActivity {

    TextView kilogram1;
    TextView kilogram2;
    TextView kilogram3;

    DecimalFormat Format = new DecimalFormat("$###,###.##");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilograms);


        kilogram1 = findViewById(R.id.Kilogram1);
        kilogram2 = findViewById(R.id.Kilogram2);
        kilogram3 = findViewById(R.id.Kilogram3);
        Intent intent = getIntent();
        Double double2 = intent.getDoubleExtra(MainActivity.EXTRA_DOUBLE,0);
        EditText editText2 = (EditText) findViewById(R.id.UserValue2);

        editText2.setText(""+ double2);

        //Edittext of the user enter value
        //calculation

        double gram = double2 * 1000;
        kilogram1.setText("" + Format.format(gram));

        double Oz = double2 * 35.27;
        kilogram2.setText("" + Format.format(Oz));

        double Pound = double2 * 2.21;
        kilogram3.setText(""+ Format.format(Pound));

    }
}