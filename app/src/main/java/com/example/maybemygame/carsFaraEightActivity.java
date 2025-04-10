package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class carsFaraEightActivity extends AppCompatActivity {

    Button charger_btn, bmw_btn, c43_btn, audi_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_fara_eight);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        charger_btn = findViewById(R.id.charger_btn);
        bmw_btn = findViewById(R.id.bmw_btn);
        c43_btn = findViewById(R.id.c43_btn);
        audi_btn = findViewById(R.id.audi_btn);

        charger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraEightActivity.this, carsFaraNineActivity.class);
                startActivity(intent);
            }
        });

        bmw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faraFalse();
            }
        });

        c43_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faraFalse();
            }
        });

        audi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faraFalse();
            }
        });
    }

    public void faraFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }
}