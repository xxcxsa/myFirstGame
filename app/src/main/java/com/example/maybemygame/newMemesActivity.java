package com.example.maybemygame;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class newMemesActivity extends AppCompatActivity {

    Button play_btn, back_btn;
    ImageView image_allakh, image_sova, image_kapusta, image_shkola;

    MediaPlayer mPlayer;

    TextView text_myGame;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.kapusta);

        play_btn = findViewById(R.id.play_btn);
        image_allakh = findViewById(R.id.image_allakh);
        image_kapusta = findViewById(R.id.image_kapusta);
        image_sova = findViewById(R.id.image_sova);
        image_shkola = findViewById(R.id.image_shkola);
        text_myGame = findViewById(R.id.text_myGame);
        back_btn = findViewById(R.id.back_btn);


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesActivity.this, selectMemesActivity.class);
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

        image_shkola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_False();
            }
        });

        image_sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_False();
            }
        });

        image_allakh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_False();
            }
        });

        image_kapusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesActivity.this, newMemesSecondStepActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });



    }
    public void image_False(){
        Toast toast = Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG);
        toast.show();

    }



}