package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class VictoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);

        Button btnToMenu = findViewById(R.id.btn_to_menu);
        btnToMenu.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    }
}
