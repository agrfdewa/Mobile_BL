package com.example.week02_29072;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inAngka1,inAngka2;
    TextView hasil;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inAngka1 = (EditText) this.findViewById(R.id.angka1);
        inAngka2 = (EditText) this.findViewById(R.id.angka2);
        hasil = (TextView) this.findViewById(R.id.hasil);
        btnTambah = (Button) this.findViewById(R.id.btnTambah);
        btnKurang = (Button) this.findViewById(R.id.btnKurang);
        btnKali = (Button) this.findViewById(R.id.btnKali);
        btnBagi = (Button) this.findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('+');
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('-');
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('*');
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('/');
            }
        });
    }

    protected void hitung(char operator){
        double angka1 = Double.parseDouble(inAngka1.getText().toString());
        double angka2 = Double.parseDouble(inAngka2.getText().toString());
        double result = 0.0;
        switch (operator){
            case ('+'): result = angka1 + angka2; break;
            case ('-'): result = angka1 - angka2; break;
            case ('*'): result = angka1 * angka2; break;
            case ('/'): result = angka1 / angka2; break;
        }
        hasil.setText(String.valueOf(result));
    }
}