package com.example.week06_29072;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.week06_29072.TAnimasiDrawable.TAnimasiDrawable;
import com.example.week06_29072.TAnimasiFisika.TAnimasiFisika;
import com.example.week06_29072.TAnimasiProperti.TAnimasiProperti;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_TAnimasiProperti = (Button) findViewById(R.id.btn_TAnimasiProperti);
        Button btn_TAnimasiDrawable = (Button) findViewById(R.id.btn_TAnimasiDrawable);
        Button btn_TAnimasiFisika = (Button) findViewById(R.id.btn_TAnimasiFisika);

        btn_TAnimasiProperti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, TAnimasiProperti.class);
                startActivity(btn);
            }
        });

        btn_TAnimasiDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, TAnimasiDrawable.class);
                startActivity(btn);
            }
        });

        btn_TAnimasiFisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, TAnimasiFisika.class);
                startActivity(btn);
            }
        });
    }
}