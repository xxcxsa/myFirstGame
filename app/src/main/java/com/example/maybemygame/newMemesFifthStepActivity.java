package com.example.maybemygame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class newMemesFifthStepActivity extends AppCompatActivity {

    Button play_btn, back_btn;

    ImageView image_vitalya, image_pohlopayou, image_nice_mark, image_african_name;

    MediaPlayer mPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_fifth_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.pohlopayouu);
        play_btn = findViewById(R.id.play_btn);
        image_pohlopayou = findViewById(R.id.image_pohlopayou);
        image_vitalya = findViewById(R.id.image_vitalya);
        image_nice_mark = findViewById(R.id.image_nice_mark);
        image_african_name = findViewById(R.id.image_african_name);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesFifthStepActivity.this, newMemesFourthStepActivity.class);
                startActivity(intent);
            }
        });

        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayer.isPlaying()){
                    mPlayer.stop();
                } else {
                    mPlayer.start();
                }
            }
        });

        image_african_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_nice_mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_vitalya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_pohlopayou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.increaseScore(15);
                Intent intent = new Intent(newMemesFifthStepActivity.this, newMemesSixthStepActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });


    }

    public void imageFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
    }
}