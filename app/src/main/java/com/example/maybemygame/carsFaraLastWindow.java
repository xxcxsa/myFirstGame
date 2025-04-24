package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class carsFaraLastWindow extends AppCompatActivity {

    Button home_btn, cars_btn;

    TextView text_last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_fara_last_window);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        home_btn = findViewById(R.id.home_btn);
        cars_btn = findViewById(R.id.cars_btn);
        text_last = findViewById(R.id.text_last);

        text_last.setText("Вы прошли квиз игру!\n" + "Ваш счет: " +  ScoreManager.getScore() + " Очков! ");






        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraLastWindow.this, MainActivity.class);
                startActivity(intent);
                ScoreManager.resetScore();
            }
        });

        cars_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsFaraLastWindow.this, carsLogoActivity.class);
                startActivity(intent);
                ScoreManager.resetScore();
            }
        });
    }
}