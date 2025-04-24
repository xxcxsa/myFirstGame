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

public class carsLogoThreeStepActivity extends AppCompatActivity {

    Button seat_btn, ferarri_btn, citroen_btn, subaru_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_logo_three_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        seat_btn = findViewById(R.id.seat_btn);
        ferarri_btn = findViewById(R.id.ferarri_btn);
        citroen_btn = findViewById(R.id.citroen_btn);
        subaru_btn = findViewById(R.id.subaru_btn);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoThreeStepActivity.this, carsLogoTwoStepActivity.class);
                startActivity(intent);
            }
        });

        seat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        ferarri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        subaru_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        citroen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoThreeStepActivity.this, carsLogoFourStepActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });

    }

    public void btnFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }
}