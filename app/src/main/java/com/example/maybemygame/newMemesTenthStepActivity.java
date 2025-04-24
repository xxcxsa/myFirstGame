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

public class newMemesTenthStepActivity extends AppCompatActivity {

    Button play_btn, back_btn;

    ImageView image_gargamel, image_shodka, image_otdai_salo, image_poka;

    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_tenth_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.poka );

        play_btn = findViewById(R.id.play_btn);
        image_gargamel = findViewById(R.id.image_gargamel);
        image_poka = findViewById(R.id.image_poka);
        image_shodka = findViewById(R.id.image_shodka);
        image_otdai_salo = findViewById(R.id.image_otdai_salo);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesTenthStepActivity.this, newMemesNinthStepActivity.class);
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

        image_gargamel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_otdai_salo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_shodka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_poka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.increaseScore(15);
                Intent intent = new Intent(newMemesTenthStepActivity.this, newMemesEleventhStepActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });
    }

    public void imageFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
    }
}