package com.example.maybemygame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class newMemesThirdStepActivity extends AppCompatActivity {

    Button play_btn;

    ImageView image_ded, image_african_name, image_bananas, image_dirizhabl;

    MediaPlayer mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_memes_third_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mPlayer = MediaPlayer.create(this, R.raw.dirizhabl);
        play_btn = findViewById(R.id.play_btn);
        image_bananas = findViewById(R.id.image_bananas);
        image_ded = findViewById(R.id.image_ded);
        image_dirizhabl = findViewById(R.id.image_dirizhabl);
        image_african_name = findViewById(R.id.image_african_name);

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

        image_bananas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });
        image_ded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });

        image_dirizhabl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newMemesThirdStepActivity.this, newMemesFourthStepActivity.class);
                startActivity(intent);
                mPlayer.stop();
            }
        });

        image_african_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFalse();
            }
        });

    }

    public  void imageFalse(){
        Toast toast = Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_LONG);
        toast.show();
    }
}