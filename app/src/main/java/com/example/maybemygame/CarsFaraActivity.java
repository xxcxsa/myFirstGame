package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CarsFaraActivity extends AppCompatActivity {

    private int currentStep = 0;

    private final int[] stepLayouts = {
            R.layout.activity_cars_fara_two_step,
            R.layout.activity_cars_fara_three,
            R.layout.activity_cars_fara_four,
            R.layout.activity_cars_fara_five,
            R.layout.activity_cars_fara_six,
            R.layout.activity_cars_fara_seven,
            R.layout.activity_cars_fara_eight,
            R.layout.activity_cars_fara_nine,
            R.layout.activity_cars_fara_ten,
            R.layout.activity_cars_fara_eleven,
            R.layout.activity_cars_fara_twelve
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showStep(0);
    }

    private void showStep(int stepIndex) {
        if (stepIndex >= stepLayouts.length) {
            goToMenu();
            return;
        }

        currentStep = stepIndex;
        setContentView(stepLayouts[stepIndex]);
        setupStepUI(stepIndex);
    }

    private void setupStepUI(int stepIndex) {
        if (stepIndex < stepLayouts.length - 1) {
            // универсальная логика для шагов
            Button btnCorrect = findViewById(R.id.btn_correct);
            Button btnWrong = findViewById(R.id.btn_wrong);

            if (btnCorrect != null) {
                btnCorrect.setOnClickListener(v -> showStep(stepIndex + 1));
            }
            if (btnWrong != null) {
                btnWrong.setOnClickListener(v -> goToGameOver());
            }
        } else {
            // победный экран
            Button btnFinish = findViewById(R.id.btn_finish);
            if (btnFinish != null) {
                btnFinish.setOnClickListener(v -> goToMenu());
            }

            Button Endd = findViewById(R.id.btn_endd);
            Endd.setOnClickListener(v -> goToMenu());
        }
    }

    private void goToMenu() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    private void goToGameOver() {
        startActivity(new Intent(this, GameOverActivity.class));
        finish();
    }

    private void goToVictory() {
        startActivity(new Intent(this, VictoryActivity.class));

    }
}
