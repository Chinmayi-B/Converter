package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class temperature extends AppCompatActivity {

    EditText inputNum;
    Button btnCelicus,btnFahrenheit,btnKelvin;
    TextView result;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        inputNum = findViewById(R.id.inputNum);
        btnCelicus = findViewById(R.id.btnCelicus);
        btnFahrenheit = findViewById(R.id.btnFahrenheit);
        btnKelvin = findViewById(R.id.btnKelvin);
        result = findViewById(R.id.result);

        formatter = new DecimalFormat("0.000");

        btnCelicus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(temperature.this,"Please enter the value!!",Toast.LENGTH_LONG).show();
                }
                else {
                    double temp= Double.parseDouble(inputNum.getText().toString().trim());

                    String optext =  temp+ "Celicus = " + formatter.format(temp*9/5+32) + " Fahrenheit\n\n"
                            + temp+ " Celicus =  " + formatter.format(temp+ 273.15) + " Kelvin\n";
                    result.setText(optext);

                }
            }
        });

        btnKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(temperature.this,"Please enter the value!!",Toast.LENGTH_LONG).show();
                }
                else {
                    double temp= Double.parseDouble(inputNum.getText().toString().trim());

                    String optext =  temp+ " Kelvin = " + formatter.format(temp-273.15) + " Celicus\n\n"
                            + temp+ " Kelvin =  " + formatter.format(((temp-273.15)*9/5)+32) + " Fahrenheit\n";
                    result.setText(optext);

                }
            }
        });

        btnFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNum.getText().toString().isEmpty()){
                    Toast.makeText(temperature.this,"Please enter the value!!",Toast.LENGTH_LONG).show();
                }
                else {
                    double temp= Double.parseDouble(inputNum.getText().toString().trim());

                    String optext =  temp+ " Fahrenheit = " + formatter.format((temp-32)*5/9) + " Celicus\n\n"
                            + temp+ " Fahrenheit =  " + formatter.format(((temp-32)*5/9)+273.15) + " Kelvin\n";
                    result.setText(optext);

                }
            }
        });
    }
}