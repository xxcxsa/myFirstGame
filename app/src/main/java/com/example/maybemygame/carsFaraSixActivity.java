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

public class carsFaraSixActivity extends AppCompatActivity {

    Button g63_btn, bmw_btn, gls_btn, audi_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_fara_six);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        g63_btn = findViewById(R.id.g63_btn);
        bmw_btn = findViewById(R.id.bmw_btn);
        gls_btn = findViewById(R.id.gls_btn);
        audi_btn = findViewById(R.id.audi_btn);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraSixActivity.this, carsFaraFiveActivity.class);
                startActivity(intent);
            }
        });

        gls_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraSixActivity.this, carsFaraSevenActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });

        g63_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faraFalse();
                ScoreManager.minusScore(3);
            }
        });

        bmw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faraFalse();
                ScoreManager.minusScore(3);
            }
        });

        audi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faraFalse();
                ScoreManager.minusScore(3);
            }
        });

    }

    public void faraFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }
}