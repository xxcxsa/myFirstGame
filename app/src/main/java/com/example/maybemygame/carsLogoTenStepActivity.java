package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class carsLogoTenStepActivity extends AppCompatActivity {

    Button byd_btn, reno_btn, mclaren_btn, citroen_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cars_logo_ten_step);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        byd_btn = findViewById(R.id.byd_btn);
        reno_btn = findViewById(R.id.reno_btn);
        mclaren_btn = findViewById(R.id.mclaren_btn);
        citroen_btn = findViewById(R.id.citroen_btn);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoTenStepActivity.this, carsLogoNintStepActivity.class);
                startActivity(intent);
            }
        });

        citroen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carsLogoTenStepActivity.this, carsLogoLastWindowActivity.class);
                startActivity(intent);
            }
        });

        reno_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
            }
        });

        mclaren_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
            }
        });

        byd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFalse();
            }
        });
    }
    public void btnFalse(){
        Toast.makeText(this, "Неверно! Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }

}