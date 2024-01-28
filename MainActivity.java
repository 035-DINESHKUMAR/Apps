package com.example.currencyconvertorapp;

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
        TextView t3 = (TextView) findViewById(R.id.Text3);
        TextView t4 = (TextView) findViewById(R.id.Text4);
        EditText e = (EditText) findViewById(R.id.Edit1);
        Button b1 = (Button) findViewById(R.id.B1);
        Button b2 = (Button) findViewById(R.id.B2);
        Button b3 = (Button) findViewById(R.id.B3);
        Button b4 = (Button) findViewById(R.id.B4);
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e.getText().toString());
                double b = a*(1.27);
                t3.setText("Dollar");
                t4.setText(Double.toString(b));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e.getText().toString());
                double b = a*(106.03);
                t3.setText("Rupees");
                t4.setText(Double.toString(b));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e.getText().toString());
                double b = a*(181.60);
                t3.setText("Yen");
                t4.setText(Double.toString(b));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e.getText().toString());
                double b = a*(1.15);
                t3.setText("Euro");
                t4.setText(Double.toString(b));
            }
        });
    }
}