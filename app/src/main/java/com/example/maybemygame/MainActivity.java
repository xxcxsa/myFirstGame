package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCarsFara = findViewById(R.id.btn_cars_fara);
        btnCarsFara.setOnClickListener(v -> {
            startActivity(new Intent(this, CarsFaraActivity.class));
        });

        Button btnCarsLogo = findViewById(R.id.btn_cars_logo);
        btnCarsLogo.setOnClickListener(v -> {
            startActivity(new Intent(this, CarsLogoActivity.class));
        });

        Button btnMemes = findViewById(R.id.btn_memes);
        btnMemes.setOnClickListener(v -> {
            startActivity(new Intent(this, photoMemesActivity.class));
        });
    }
}
