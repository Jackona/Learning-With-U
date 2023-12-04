package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class q_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qjig);


        //home
        Button qhbtn = findViewById(R.id.qhbtn);
        qhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // p
        Button q2pbtn = findViewById(R.id.q2pbtn);
        q2pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openp_jigActivity();
            }
        });
        //r
        Button q2rbtn = findViewById(R.id.q2rbtn);
        q2rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openr_jigActivity();
            }
        });


        Button btnQuuen = findViewById(R.id.btnQuuen); //btnQuuen
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.queen_aa);
        btnQuuen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button btnQuiz = findViewById(R.id.btnQuiz); //btnQuiz
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.quiz_aa);
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button btnQuestion = findViewById(R.id.btnQuestion); //btnQuestion
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.questoin_aa);
        btnQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button btnQuiet = findViewById(R.id.btnQuiet); //btnQuiet
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.quiet_aa);
        btnQuiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });


    }

    public void openEnglish_ReadingActivity() {
        Intent intent = new Intent(this, English_ReadingActivity.class);
        startActivity(intent);
    }

    public void openp_jigActivity() {
        Intent intent = new Intent(this, p_jigActivity.class);
        startActivity(intent);
    }

    public void openr_jigActivity() {
        Intent intent = new Intent(this, r_jigActivity.class);
        startActivity(intent);
    }
}
