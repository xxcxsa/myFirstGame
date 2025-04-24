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

public class newMemesNinthStepActivity extends AppCompatActivity {

    Button play_btn, back_btn;

    ImageView image_mafiozi, image_firamir, image_nice_mark, image_morskaya_pehota;

    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_ninth_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.mafiozi );
        play_btn = findViewById(R.id.play_btn);
        image_mafiozi = findViewById(R.id.image_mafiozi);
        image_nice_mark = findViewById(R.id.image_nice_mark);
        image_firamir = findViewById(R.id.image_firamir);
        image_morskaya_pehota = findViewById(R.id.image_morskaya_pehota);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesNinthStepActivity.this, newMemesEghthStepActivity.class);
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


        image_firamir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_morskaya_pehota.setOnClickListener(new View.OnClickListener() {
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

        image_mafiozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.increaseScore(15);
                Intent intent = new Intent(newMemesNinthStepActivity.this, newMemesTenthStepActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });
    }


    public void imageFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
    }

}