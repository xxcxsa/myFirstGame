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

public class carsFaraTwoStepActivity extends AppCompatActivity {

    Button rolls_btn, mercedes_btn, chrysler_btn, jeep_btn, back_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_fara_two_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rolls_btn = findViewById(R.id.rolls_btn);
        mercedes_btn = findViewById(R.id.mercedes_btn);
        chrysler_btn = findViewById(R.id.chrysler_btn);
        jeep_btn = findViewById(R.id.jeep_btn);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraTwoStepActivity.this, carsFaraActivity.class);
                startActivity(intent);
            }
        });

        jeep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ScoreManager.increaseScore(10);

                Intent intent = new Intent(carsFaraTwoStepActivity.this, carsFaraThreeActivity.class);
                startActivity(intent);
            }
        });

        rolls_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.minusScore(3);
                faraFalse();
            }
        });

        mercedes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.minusScore(3);
                faraFalse();
            }
        });

        chrysler_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.minusScore(3);
                faraFalse();
            }
        });
    }


    public void faraFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }

}