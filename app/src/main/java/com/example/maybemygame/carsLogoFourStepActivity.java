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

public class carsLogoFourStepActivity extends AppCompatActivity {

    Button dodge_btn, seat_btn, mercedes_btn, hundai_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_logo_four_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        dodge_btn = findViewById(R.id.dodge_btn);
        seat_btn = findViewById(R.id.seat_btn);
        mercedes_btn = findViewById(R.id.mercedes_btn);
        hundai_btn = findViewById(R.id.hundai_btn);
        back_btn = findViewById(R.id.back_btn);


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoFourStepActivity.this, carsLogoThreeStepActivity.class);
                startActivity(intent);
            }
        });

        dodge_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });
        seat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        hundai_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        mercedes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoFourStepActivity.this, carsLogoFiveStepActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });
    }

    public void btnFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }
}