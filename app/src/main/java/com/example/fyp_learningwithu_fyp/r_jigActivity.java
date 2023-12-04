package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class r_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rjig);



        //home
        Button rhbtn = findViewById(R.id.rhbtn);
        rhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // q
        Button r2qbtn = findViewById(R.id.r2qbtn);
        r2qbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openq_jigActivity();
            }
        });
        //s
        Button r2sbtn = findViewById(R.id.r2sbtn);
        r2sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opens_jigActivity();
            }
        });


        Button btnRat = findViewById(R.id.btnRat); //btnRat
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.rat_aa);
        btnRat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button btnRock = findViewById(R.id.btnRock); //btnRock
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.rock_aa);
        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button btnRainbow = findViewById(R.id.btnRainbow); //btnRainbow
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.rainbow_aa);
        btnRainbow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button btnReward = findViewById(R.id.btnReward); //btnReward
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.reward_aa);
        btnReward.setOnClickListener(new View.OnClickListener() {
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

    public void openq_jigActivity() {
        Intent intent = new Intent(this, q_jigActivity.class);
        startActivity(intent);
    }

    public void opens_jigActivity() {
        Intent intent = new Intent(this, s_jigActivity.class);
        startActivity(intent);
    }
}
