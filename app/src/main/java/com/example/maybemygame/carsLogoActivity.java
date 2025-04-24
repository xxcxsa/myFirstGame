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

public class carsLogoActivity extends AppCompatActivity {


    Button acura_btn, lexus_btn, daewoo_btn, toyota_btn, back_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_logo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        acura_btn = findViewById(R.id.acura_btn);
        lexus_btn = findViewById(R.id.lexus_btn);
        daewoo_btn = findViewById(R.id.daewoo_btn);
        toyota_btn = findViewById(R.id.toyota_btn);
        back_btn = findViewById(R.id.back_btn);


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoActivity.this, selectCarsActivity.class);
                startActivity(intent);
            }
        });

        acura_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoActivity.this, carsLogoTwoStepActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });

        lexus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        daewoo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });

        toyota_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });
    }

    public void btnFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }
}