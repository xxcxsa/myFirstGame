package com.example.maybemygame;

import android.annotation.SuppressLint;
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

public class newMemesSixthStepActivity extends AppCompatActivity {

    Button play_btn, back_btn;

    ImageView image_bananas, image_sova, image_vsego_horoshego, image_zabil;

    MediaPlayer mPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_sixth_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        mPlayer = MediaPlayer.create(this, R.raw.vsego_horoshego);

        play_btn = findViewById(R.id.play_btn);
        image_bananas = findViewById(R.id.image_bananas);
        image_zabil = findViewById(R.id.image_zabil);
        image_sova = findViewById(R.id.image_sova);
        image_vsego_horoshego = findViewById(R.id.image_vsego_horoshego);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesSixthStepActivity.this, newMemesFifthStepActivity.class);
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

        image_sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });

        image_bananas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });

        image_zabil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });

        image_vsego_horoshego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesSixthStepActivity.this, newMemesSeventhStepActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });
    }
    public void imageFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
    }
}