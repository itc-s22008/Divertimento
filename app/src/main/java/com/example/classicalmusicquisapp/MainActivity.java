package com.example.classicalmusicquisapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Quiz> quizList;
    private int currentQuestion = 0;
    private int score = 0;

    private TextView questionText;
    private RadioButton[] optionRadioButtons = new RadioButton[4];
    private CheckBox[] optionCheckBoxes = new CheckBox[4];
    private LinearLayout radioGroupContainer, checkBoxContainer;
    private Button submitButton;

    private MediaPlayer mediaPlayer; // 音楽再生用
    private boolean[] radioButtonStates = new boolean[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionText = findViewById(R.id.questionText);
        optionRadioButtons[0] = findViewById(R.id.option1RadioButton);
        optionRadioButtons[1] = findViewById(R.id.option2RadioButton);
        optionRadioButtons[2] = findViewById(R.id.option3RadioButton);
        optionRadioButtons[3] = findViewById(R.id.option4RadioButton);
        optionCheckBoxes[0] = findViewById(R.id.option1CheckBox);
        optionCheckBoxes[1] = findViewById(R.id.option2CheckBox);
        optionCheckBoxes[2] = findViewById(R.id.option3CheckBox);
        optionCheckBoxes[3] = findViewById(R.id.option4CheckBox);
        radioGroupContainer = findViewById(R.id.radioGroupContainer);
        checkBoxContainer = findViewById(R.id.checkBoxContainer);
        submitButton = findViewById(R.id.submitButton);

        quizList = QuizData.getQuizzes();
        showQuestion();

        submitButton.setOnClickListener(view -> checkAnswer());
    }

    private void showQuestion() {
        if (currentQuestion >= quizList.size()) {
            showResult();
            return;
        }

        Quiz quiz = quizList.get(currentQuestion);
        questionText.setText(quiz.question);

        resetForms();

        if (quiz.type == 0) {
            setupRadioButtons(quiz);
        } else if (quiz.type == 1) {
            setupCheckBoxes(quiz);
        } else if (quiz.type == 2) {
            setupRadioButtonsForTrueFalse();
        }

        // 曲当てクイズの場合、音楽を再生
        if (quiz.type == 3) { // type 3: 曲当てクイズ
            playMusic(R.raw.quiz_music); // rawフォルダにある曲ファイル
        } else {
            stopMusic();
        }
    }

    private void resetForms() {
        for (int i = 0; i < optionRadioButtons.length; i++) {
            optionRadioButtons[i].setChecked(false);
            optionRadioButtons[i].setVisibility(View.GONE);
            radioButtonStates[i] = false;
        }

        for (CheckBox checkBox : optionCheckBoxes) {
            checkBox.setChecked(false);
            checkBox.setVisibility(View.GONE);
        }
    }

    private void setupRadioButtons(Quiz quiz) {
        radioGroupContainer.setVisibility(View.VISIBLE);
        checkBoxContainer.setVisibility(View.GONE);

        for (int i = 0; i < 4; i++) {
            optionRadioButtons[i].setText(quiz.options[i]);
            optionRadioButtons[i].setVisibility(View.VISIBLE);
        }
    }

    private void setupCheckBoxes(Quiz quiz) {
        checkBoxContainer.setVisibility(View.VISIBLE);
        radioGroupContainer.setVisibility(View.GONE);

        for (int i = 0; i < 4; i++) {
            optionCheckBoxes[i].setText(quiz.options[i]);
            optionCheckBoxes[i].setVisibility(View.VISIBLE);
        }
    }

    private void setupRadioButtonsForTrueFalse() {
        radioGroupContainer.setVisibility(View.VISIBLE);
        checkBoxContainer.setVisibility(View.GONE);

        optionRadioButtons[0].setText("〇");
        optionRadioButtons[1].setText("✘");
        optionRadioButtons[0].setVisibility(View.VISIBLE);
        optionRadioButtons[1].setVisibility(View.VISIBLE);
    }

    private void checkAnswer() {
        Quiz quiz = quizList.get(currentQuestion);
        boolean[] userAnswer = new boolean[4];

        if (quiz.type == 0 || quiz.type == 2) {
            for (int i = 0; i < 4; i++) {
                userAnswer[i] = optionRadioButtons[i].isChecked();
            }
        } else if (quiz.type == 1) {
            for (int i = 0; i < 4; i++) {
                userAnswer[i] = optionCheckBoxes[i].isChecked();
            }
        }

        boolean isCorrect = true;
        for (int i = 0; i < quiz.correctAnswers.length; i++) {
            if (quiz.correctAnswers[i] != userAnswer[i]) {
                isCorrect = false;
                break;
            }
        }

        showAnswerDialog(isCorrect, quiz.explanation);

        if (isCorrect) {
            score++;
        }

        currentQuestion++;
    }

    private void showAnswerDialog(boolean isCorrect, String explanation) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(isCorrect ? "正解！" : "不正解");
        builder.setMessage(explanation);

        builder.setPositiveButton("次へ", (dialog, which) -> showQuestion());
        builder.setCancelable(false);
        builder.show();
    }

    private void showResult() {
        stopMusic(); // クイズ音楽を停止
        //playMusic(R.raw.result_music); // リザルト画面用音楽を再生

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("SCORE", score);
        startActivity(intent);
        finish();
    }



    private void playMusic(int musicResId) {
        stopMusic(); // 再生中の音楽を停止
        mediaPlayer = MediaPlayer.create(this, musicResId);
        mediaPlayer.setLooping(true); // 音楽をループ再生
        mediaPlayer.start();
    }

    private void stopMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopMusic(); // アクティビティ終了時に音楽停止


    }
}