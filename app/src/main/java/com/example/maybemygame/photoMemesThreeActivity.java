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

public class photoMemesThreeActivity extends AppCompatActivity {

    Button bom_btn, namano_btn, ded_btn, uspeh_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_photo_memes_three);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bom_btn = findViewById(R.id.bom_btn);
        namano_btn = findViewById(R.id.namano_btn);
        ded_btn = findViewById(R.id.ded_btn);
        uspeh_btn = findViewById(R.id.uspeh_btn);


        bom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(photoMemesThreeActivity.this, photoMemesFourActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(15);
            }
        });

        namano_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        ded_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        uspeh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });
    }

    public void Failed (){
        Toast.makeText(this, "Неверно! Попробуйте еще раз ", Toast.LENGTH_SHORT).show();
    }
}