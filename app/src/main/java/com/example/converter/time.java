package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class time extends AppCompatActivity {

    EditText inputNum;
    Button btnSecond,btnMinute,btnHour,btnDay,btnWeek,btnYear;
    TextView result;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        inputNum = findViewById(R.id.inputNum);
        btnSecond = findViewById(R.id.btnSecond);
        btnMinute = findViewById(R.id.btnMinute);
        btnHour = findViewById(R.id.btnHour);
        btnDay = findViewById(R.id.btnDay);
        btnWeek = findViewById(R.id.btnWeek);
        btnYear = findViewById(R.id.btnYear);

        result = findViewById(R.id.result);

        formatter = new DecimalFormat("#0.000000");

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(time.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double time = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = time + " s =  " + time * 1000 + " milliseconds\n\n"+
                            time + " s =  " + formatter.format(time /60)  + " minutes\n\n"
                            + time + " s =  " + formatter.format(time / 3600) + " hour\n";
                    result.setText(optext);

                }
            }
        });

        btnMinute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(time.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double time = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = time + " Minute =  " + time * 3600 + " milli-seconds\n\n"
                            + time + " Minute =  " + time * 60 + " seconds\n\n"
                            + time + " Minute =  " + formatter.format(time / 60) + " hour\n\n";
                    result.setText(optext);

                }
            }
        });

        btnHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(time.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double time = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = time + " hour =  " + time * 3600 + " seconds\n\n"
                            + time + " hour =  " + time * 60 + " minute\n\n"
                            + time + " hour =  " + formatter.format(time * 0.00595238095) + " week\n\n";
                    result.setText(optext);

                }
            }
        });

        btnDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(time.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double time = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = time + " day =  " + time * 86400 + " seconds\n\n"
                            + time + " day =  " + time * 1440 + " minute\n\n"
                            + time + " day =  " + time * 24 + " hour\n\n"
                            +time + " day =  " + formatter.format(time / 7 ) + " week\n\n"
                            + time + " day =  " + formatter.format(time / 365 ) + " year\n";
                    result.setText(optext);

                }
            }
        });

        btnWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(time.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double time = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = time + " week =  " + time * 604800 + " seconds\n\n"
                            + time + " week =  " + time * 10080 + " minute\n\n"
                            + time + " week =  " + time * 168 + " hour\n\n"
                            + time + " week =  " + time * 7 + " days\n\n"
                            + time + " week =  " + formatter.format(time *0.0191780822) + " year\n";

                    result.setText(optext);

                }
            }
        });

        btnYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(time.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double time = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = time + " year =  " +formatter.format(time * 52.1428571)  + " weeks\n\n"
                            + time + " year =  " + time * 365 + " days\n\n"
                            + time + " year =  " + time * 8760 + " hour\n\n"
                            + time + " year =  " + formatter.format(time*52.1428571) + " week\n";
                    result.setText(optext);

                }
            }
        });

    }
}