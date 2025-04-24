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

public class newMemesSeventhStepActivity extends AppCompatActivity {

    Button play_btn, back_btn;

    ImageView image_bom_bom, image_denchick, image_max_pried, image_ded;

    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_seventh_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.denchickk );

        play_btn = findViewById(R.id.play_btn);
        image_ded = findViewById(R.id.image_ded);
        image_denchick = findViewById(R.id.image_denchick);
        image_bom_bom = findViewById(R.id.image_bom_bom);
        image_max_pried = findViewById(R.id.image_max_pried);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesSeventhStepActivity.this, newMemesSixthStepActivity.class);
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

        image_ded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_max_pried.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });

        image_denchick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScoreManager.increaseScore(15);
                Intent intent = new Intent(newMemesSeventhStepActivity.this, newMemesEghthStepActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });

        image_bom_bom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
                ScoreManager.minusScore(5);
            }
        });




    }

    public void imageFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
    }
}