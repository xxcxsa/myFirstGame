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

import com.google.android.material.color.utilities.Score;

public class carsFaraFiveActivity extends AppCompatActivity {

    Button bmw_btn, bmw5_btn, c63_btn, audi_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_fara_five);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back_btn = findViewById(R.id.back_btn);

        bmw5_btn = findViewById(R.id.bmw5_btn);
        bmw_btn = findViewById(R.id.bmw_btn);
        c63_btn = findViewById(R.id.c63_btn);
        audi_btn = findViewById(R.id.audi_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraFiveActivity.this, carsFaraFourActivity.class);
                startActivity(intent);
            }
        });

        bmw5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraFiveActivity.this, carsFaraSixActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });

        bmw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faraFalse();
                ScoreManager.minusScore(3);
            }
        });

        c63_btn.setOnClickListener(new View.OnClickListener() {
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