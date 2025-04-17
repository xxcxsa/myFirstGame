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

public class newMemesTwelveStepActivity extends AppCompatActivity {

    Button play_btn, back_btn;

    ImageView image_bili_jean, image_shkola, image_african_name, image_max_pried;

    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_twelve_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.african_name );

        play_btn = findViewById(R.id.play_btn);

        image_african_name = findViewById(R.id.image_african_name);
        image_bili_jean = findViewById(R.id.image_bili_jean);
        image_shkola = findViewById(R.id.image_shkola);
        image_max_pried = findViewById(R.id.image_max_pried);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesTwelveStepActivity.this, newMemesEleventhStepActivity.class);
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
                Intent intent = new Intent(newMemesTwelveStepActivity.this, newMemesLastWindowActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });
        image_max_pried.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });
        image_shkola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });

        image_bili_jean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });



    }

    public void imageFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
    }
}