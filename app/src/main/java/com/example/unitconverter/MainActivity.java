package com.example.unitconverter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import androidx.appcompat.app.AppCompatActivity;

import java.io.PrintStream;

public class MainActivity extends AppCompatActivity
{


     ImageButton ImageButton1;
     ImageButton ImageButton2;
     ImageButton ImageButton3;
     Spinner UnitSpinner;
     public static final String EXTRA_DOUBLE = "com.example.unitconverter.example.EXTRA_DOUBLE";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton2= (ImageButton) findViewById(R.id.imageButton2);
        ImageButton3= (ImageButton) findViewById(R.id.imageButton3);
        UnitSpinner = (Spinner) findViewById(R.id.UnitSpinner);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.Unit_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        UnitSpinner.setAdapter(adapter);


        UnitSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                String chose = MainActivity.this.getResources().getStringArray(
                        R.array.Unit_list)[arg2];

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

        ImageButton1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                // 根据选择的手机型号跳转到相应的Activity
                EditText UserInput = (EditText)findViewById(R.id.UserValue);
                Double double1 = Double.parseDouble(UserInput.getText().toString());


                Intent intent = new Intent();
                switch (UnitSpinner.getSelectedItemPosition()) {

                    case 1:
                        intent.setClass(MainActivity.this, Metre.class);
                        intent.putExtra(EXTRA_DOUBLE, double1);
                        startActivity(intent);
                        break;
                    default:

                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon", Toast.LENGTH_SHORT).show();

                }
            }



        });


        ImageButton2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                // 根据选择的手机型号跳转到相应的Activity
                EditText UserInput = (EditText)findViewById(R.id.UserValue);
                Double double1 = Double.parseDouble(UserInput.getText().toString());

                Intent intent = new Intent();
                switch (UnitSpinner.getSelectedItemPosition()) {

                    case 0:
                        intent.setClass(MainActivity.this, Kilograms.class);
                        intent.putExtra(EXTRA_DOUBLE, double1);
                        startActivity(intent);
                        break;
                    default:

                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon", Toast.LENGTH_SHORT).show();

                }
            }



        });


        ImageButton3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                // 根据选择的手机型号跳转到相应的Activity
                EditText UserInput = (EditText)findViewById(R.id.UserValue);
                Double double1 = Double.parseDouble(UserInput.getText().toString());

                Intent intent = new Intent();
                switch (UnitSpinner.getSelectedItemPosition()) {

                    case 2:
                        intent.setClass(MainActivity.this, Celsius.class);
                        intent.putExtra(EXTRA_DOUBLE, double1);
                        startActivity(intent);
                        break;
                    default:

                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon", Toast.LENGTH_SHORT).show();

                }
            }



        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }








    }








