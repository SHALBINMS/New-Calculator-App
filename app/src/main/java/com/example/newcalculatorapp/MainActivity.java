package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button bt1, bt2, bt3, bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.addbtn);
        bt2 = (Button) findViewById(R.id.subbtn);
        bt3 = (Button) findViewById(R.id.multbtn);
        bt4 = (Button) findViewById(R.id.divbtn);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1 = new Intent(getApplicationContext(), AdditionActivity.class);
                startActivity(ob1);
            }

        });

               bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ob2 = new Intent(getApplicationContext(), SubstractionActivity.class);
                    startActivity(ob2);
                }

        });

    }
}


