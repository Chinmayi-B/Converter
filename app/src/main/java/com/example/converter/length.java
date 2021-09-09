package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class length extends AppCompatActivity {

    EditText inputNum;
    Button btn_cm,btn_m,btn_km,btn_inch,btn_foot;
    TextView result;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        inputNum = findViewById(R.id.inputNum);
        btn_cm = findViewById(R.id.btn_cm);
        btn_m = findViewById(R.id.btn_m);
        btn_km = findViewById(R.id.btn_km);
        btn_inch = findViewById(R.id.btn_inch);
        btn_foot = findViewById(R.id.btn_foot);

        result = findViewById(R.id.result);

        formatter = new DecimalFormat("#0.000000");

        btn_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(length.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double number = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = number + " cm =  " + number / 100 + " meter(m)\n\n"
                            + number + " cm =  " + number / 100000 + " kilo-meter(km)\n\n"
                            + number + " cm =  " + formatter.format(number * 0.393700787) + " inch(in)\n\n"
                            + number + " cm =  " + formatter.format(number * 0.032808399) + " foot(ft)\n";
                    result.setText(optext);

                }
            }
        });

        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(length.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double number = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = number + " m =  " + number*100 + " centi-meter(cm)\n\n"
                            + number + " m =  " + number / 1000 + " kilo-meter(km)\n\n"
                            + number + " m =  " + formatter.format(number * 39.3700787) + " inch(in)\n\n"
                            + number + " m =  " + formatter.format(number * 3.2808399) + " foot(ft)\n";
                    result.setText(optext);

                }

            }
        });

        btn_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(length.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double number = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext =
                              number + " km =  " + number*100000 + " centi-meter(cm)\n\n"
                            + number + " km =  " + formatter.format(number * 1000) + " meter(m)\n\n"
                            + number + " km =  " + formatter.format(number * 39370.0787) + " inch(in)\n\n"
                            + number + " km =  " + formatter.format(number * 3280.8399) + " foot(ft)\n";
                    result.setText(optext);

                }

            }
        });

        btn_inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(length.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double number = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = number + " inch =  " + number*2.54 + " centi-meter(cm)\n\n"
                            + number + " inch =  " + formatter.format(number * 0.0254) + " meter(m)\n\n"
                            + number + " inch =  " + formatter.format(number * 2.54e-5) + " kilo-meter(km)\n\n"
                            + number + " inch =  " + formatter.format(number * 0.08333333) + " foot(ft)\n";
                    result.setText(optext);

                }
            }
        });

        btn_foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(length.this,"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double number = Double.parseDouble(inputNum.getText().toString().trim());

                    String optext = number + " ft =  " + number*30.48 + " centi-meter(cm)\n\n"
                            + number + " ft =  " + formatter.format(number * 0.3048) + " meter(m)\n\n"
                            + number + " ft =  " + formatter.format(number * 0.0003048) + " kilo-meter(km)\n\n"
                            + number + " ft =  " + formatter.format(number * 12) + " inch(in)\n";
                    result.setText(optext);

                }

            }
        });
    }
}