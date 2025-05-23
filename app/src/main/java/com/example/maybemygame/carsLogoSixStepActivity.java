package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.BackEventCompat;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.color.utilities.Score;

public class carsLogoSixStepActivity extends AppCompatActivity {

    Button mercedes_btn, seat_btn, ford_btn, ram_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_logo_six_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mercedes_btn = findViewById(R.id.mercedes_btn);
        seat_btn = findViewById(R.id.seat_btn);
        ford_btn = findViewById(R.id.ford_btn);
        ram_btn = findViewById(R.id.ram_btn);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoSixStepActivity.this, carsLogoFiveStepActivity.class);
                startActivity(intent);
            }
        });

        mercedes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        ford_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        ram_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        seat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoSixStepActivity.this, carsLogoSevenStepActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });
    }
    public void btnFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }

}