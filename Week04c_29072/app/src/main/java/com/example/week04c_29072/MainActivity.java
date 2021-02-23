package com.example.week04c_29072;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnHal1, btnHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHal1 = findViewById(R.id.main_button_change_1);
        btnHal2 = findViewById(R.id.main_button_change_2);

        btnHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(pindah);
                finish();
            }
        });

        btnHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(pindah);
                finish();
            }
        });
    }
}