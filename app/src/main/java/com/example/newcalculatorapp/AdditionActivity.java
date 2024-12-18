package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdditionActivity extends AppCompatActivity {

    Button bt5, bt6;
    EditText et3, et4;
    Integer num1, num2, sum;
    String getNum1, getNum2, Result;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        bt5 = (Button) findViewById(R.id.plus);
        bt6 = (Button) findViewById(R.id.back);
        et3 = (EditText) findViewById(R.id.one);
        et4 = (EditText) findViewById(R.id.two);
        tv =(TextView) findViewById(R.id.resdis);

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);

            }
        });


        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1 = et3.getText().toString();
                getNum2 = et4.getText().toString();
                num1 = Integer.parseInt(getNum1);
                num2 = Integer.parseInt(getNum2);
                sum = num1 + num2;
                Result = String.valueOf(sum);
                tv.setText(Result);

                Toast.makeText(getApplicationContext(), Result, Toast.LENGTH_LONG).show();
            }
        });

    }
}
