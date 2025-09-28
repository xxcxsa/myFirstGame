package com.example.maybemygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarsLogoActivity extends BaseActivity {
    private int currentStep = 0;

    private final int[] stepLayouts = {
            R.layout.activity_cars_logo,
            R.layout.activity_cars_logo_two_step,
            R.layout.activity_cars_logo_three_step,
            R.layout.activity_cars_logo_four_step,
            R.layout.activity_cars_logo_five_step,
            R.layout.activity_cars_logo_six_step,
            R.layout.activity_cars_logo_seven_step,
            R.layout.activity_cars_logo_eight_step,
            R.layout.activity_cars_logo_nint_step,
            R.layout.activity_cars_logo_ten_step,
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

            Button End = findViewById(R.id.btn_end);
            End.setOnClickListener(v -> goToMenu());
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
