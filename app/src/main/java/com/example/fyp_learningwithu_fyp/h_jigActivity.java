package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class h_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hjig);

        Button h2hbtn = findViewById(R.id.h2hbtn);
        h2hbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // g
        Button g2btn = findViewById(R.id.g2btn);
        g2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openg_jigActivity();
            }
        });
        //i
        Button i2btn = findViewById(R.id.i2btn);
        i2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openi_jigActivity();
            }
        });


        Button honeybtn = findViewById(R.id.honeybtn); //honey
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.honey_aa);
        honeybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button horsebtn = findViewById(R.id.horsebtn); //horse
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.horse_aaa);
        horsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button housebtn = findViewById(R.id.housebtn); //house
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.house_aa);
        housebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button hatbtn = findViewById(R.id.hatbtn); //hat
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.hat_aa);
        hatbtn.setOnClickListener(new View.OnClickListener() {
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
    public void openg_jigActivity() {
        Intent intent = new Intent(this, g_jigActivity.class);
        startActivity(intent);
    }
    public void openi_jigActivity() {
        Intent intent = new Intent(this, i_jigActivity.class);
        startActivity(intent);
    }
}