package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class newMemesLastWindowActivity extends AppCompatActivity {

    Button home_btn, photo_btn;
    TextView text_last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_last_window);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        home_btn = findViewById(R.id.home_btn);
        photo_btn = findViewById(R.id.photo_btn);
        text_last = findViewById(R.id.text_last);

        text_last.setText("Вы прошли квиз игру!\n" + "Ваш счет: " +  ScoreManager.getScore() + " Очков! ");


        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.resetScore();
                Intent intent = new Intent(newMemesLastWindowActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        photo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.resetScore();
                Intent intent = new Intent(newMemesLastWindowActivity.this, photoMemesActivity.class);
                startActivity(intent);
            }
        });


    }
}