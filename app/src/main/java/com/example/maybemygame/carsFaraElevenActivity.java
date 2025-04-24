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

public class carsFaraElevenActivity extends AppCompatActivity {

    Button i8_btn, c63_btn, bmw_btn, e63_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_fara_eleven);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        i8_btn = findViewById(R.id.i8_btn);
        c63_btn = findViewById(R.id.c63_btn);
        bmw_btn = findViewById(R.id.bmw_btn);
        e63_btn = findViewById(R.id.e63_btn);
        back_btn = findViewById(R.id.back_btn);


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraElevenActivity.this, carsFaraTenActivity.class);
                startActivity(intent);
            }
        });

        c63_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraElevenActivity.this, CarsFaraTwelveActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });

        i8_btn.setOnClickListener(new View.OnClickListener() {
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

        e63_btn.setOnClickListener(new View.OnClickListener() {
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