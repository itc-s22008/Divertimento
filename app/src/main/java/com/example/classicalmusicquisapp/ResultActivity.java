package com.example.classicalmusicquisapp;

// ResultActivity.java


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView scoreText = findViewById(R.id.scoreText);
        TextView messageText = findViewById(R.id.messageText);
        Button backButton = findViewById(R.id.backButton);

        // スコアを受け取る
        int score = getIntent().getIntExtra("SCORE", 0);
        scoreText.setText("あなたのスコア: " + score);

        // スコアに応じたメッセージを表示
        String message;
        if (score == 10) {
            message = "お見事、満点です！";
        } else if (score >= 5) {
            message = "その調子です！";
        } else {
            message = "もう少し頑張りましょう！";
        }
        messageText.setText(message);

        // 音楽を再生
        playMusic(R.raw.result_music);

        // 戻るボタンをクリックした際の処理
        backButton.setOnClickListener(view -> {
            stopMusic(); // 音楽を停止
            // ホーム画面（MainActivity）に戻る
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish(); // 現在のアクティビティを終了
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopMusic(); // アクティビティ終了時に音楽を停止
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
}
