package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class s_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjig);



        //home
        Button shbtn = findViewById(R.id.shbtn);
        shbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // r
        Button s2rbtn = findViewById(R.id.s2rbtn);
        s2rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openr_jigActivity();
            }
        });
        //t
        Button s2tbtn = findViewById(R.id.s2tbtn);
        s2tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent_jigActivity();
            }
        });


        Button btnSun = findViewById(R.id.btnSun); //btnSun
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sun_aa);
        btnSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button btnSleep = findViewById(R.id.btnSleep); //btnSleep
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.sleep_aa);
        btnSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button btnSea = findViewById(R.id.btnSea); //btnSea
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.sea_aa);
        btnSea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button btnSand = findViewById(R.id.btnSand); //btnSand
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.sand_aa);
        btnSand.setOnClickListener(new View.OnClickListener() {
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

    public void openr_jigActivity() {
        Intent intent = new Intent(this, r_jigActivity.class);
        startActivity(intent);
    }

    public void opent_jigActivity() {
        Intent intent = new Intent(this, t_jigActivity.class);
        startActivity(intent);
    }
}
