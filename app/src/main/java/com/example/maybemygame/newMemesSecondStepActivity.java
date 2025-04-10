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

public class newMemesSecondStepActivity extends AppCompatActivity {

    Button play_btn;

    ImageView image_povar, image_namano, image_bom_bom, image_denchick;
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_second_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.povarr);

        play_btn = findViewById(R.id.play_btn);
        image_denchick = findViewById(R.id.image_denchick);
        image_namano = findViewById(R.id.image_namano);
        image_povar = findViewById(R.id.image_povar);
        image_bom_bom = findViewById(R.id.image_bom_bom);

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

        image_denchick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_False();
            }
        });

        image_namano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_False();
            }
        });

        image_bom_bom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_False();
            }
        });

        image_povar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesSecondStepActivity.this, newMemesThirdStepActivity.class);
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