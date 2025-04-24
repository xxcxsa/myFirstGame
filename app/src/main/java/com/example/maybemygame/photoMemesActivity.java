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

public class photoMemesActivity extends AppCompatActivity {

    Button dobryak_btn, sova_btn, banana_btn, kapusta_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_photo_memes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dobryak_btn = findViewById(R.id.dobryak_btn);
        sova_btn = findViewById(R.id.sova_btn);
        banana_btn = findViewById(R.id.banana_btn);
        kapusta_btn = findViewById(R.id.kapusta_btn);


        dobryak_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        sova_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        kapusta_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        banana_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.increaseScore(15);
                Intent intent = new Intent(photoMemesActivity.this, photoMemesTwoActivity.class);
                startActivity(intent);
            }
        });





    }

    public void Failed (){
        Toast.makeText(this, "Неверно! Попробуйте еще раз ", Toast.LENGTH_SHORT).show();
    }
}