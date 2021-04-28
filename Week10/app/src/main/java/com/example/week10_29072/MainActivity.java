package com.example.week10_29072;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.week10_29072.Tutorial3.Tutorial3;
import com.example.week10_29072.Tutorial4.Tutorial4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Tutorial1= findViewById(R.id.Tutorial_1);
        Button btn_Tutorial2= findViewById(R.id.Tutorial_2);
        Button btn_Tutorial3= findViewById(R.id.Tutorial_3);
        Button btn_Tutorial4= findViewById(R.id.Tutorial_4);

        btn_Tutorial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, Tutorial1.class);
                startActivity(btn);
            }
        });

        btn_Tutorial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, Tutorial2.class);
                startActivity(btn);
            }
        });

        btn_Tutorial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, Tutorial3.class);
                startActivity(btn);
            }
        });

        btn_Tutorial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, Tutorial4.class);
                startActivity(btn);
            }
        });
    }
}