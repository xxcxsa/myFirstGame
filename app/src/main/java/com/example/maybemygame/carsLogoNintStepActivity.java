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

public class carsLogoNintStepActivity extends AppCompatActivity {

    Button reno_btn, ferarri_btn, byd_btn, lexus_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_logo_nint_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        reno_btn = findViewById(R.id.reno_btn);
        ferarri_btn = findViewById(R.id.ferarri_btn);
        byd_btn = findViewById(R.id.byd_btn);
        lexus_btn = findViewById(R.id.lexus_btn);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoNintStepActivity.this, carsLogoEightStepActivity.class);
                startActivity(intent);
            }
        });

        reno_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoNintStepActivity.this, carsLogoTenStepActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(10);
            }
        });
        ferarri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });
        byd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
                ScoreManager.minusScore(3);
            }
        });
        lexus_btn.setOnClickListener(new View.OnClickListener() {
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