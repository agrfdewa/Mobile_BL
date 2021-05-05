package aloisiusgrfd.umn.ac.id.week12_29072;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_tutorial1, btn_tutorial2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tutorial1 = findViewById(R.id.Tutorial1);
        btn_tutorial2 = findViewById(R.id.Tutorial2);

        btn_tutorial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, Tutorial1.class);
                startActivity(btn);
            }
        });

        btn_tutorial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, Tutorial2.class);
                startActivity(btn);
            }
        });
    }
}