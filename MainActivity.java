package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView) findViewById(R.id.Text1);
        TextView t2 = (TextView) findViewById(R.id.Text2);
        EditText e1 = (EditText) findViewById(R.id.Edit1);
        EditText e2 = (EditText) findViewById(R.id.Edit2);
        Button b1 = (Button) findViewById(R.id.B1);
        Button b2 = (Button) findViewById(R.id.B2);
        Button b3 = (Button) findViewById(R.id.B3);
        Button b4 = (Button) findViewById(R.id.B4);
        TextView t3 = (TextView) findViewById(R.id.Text3);
        TextView t4 = (TextView) findViewById(R.id.Text4);
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
               double c = a+b;
               t3.setText(Double.toString(c));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
                double c = a-b;
                t3.setText(Double.toString(c));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
                double c = a*b;
                t3.setText(Double.toString(c));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
                double c = a/b;
                t3.setText(Double.toString(c));
            }
        });
    }
}