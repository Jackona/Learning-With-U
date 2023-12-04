package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class g_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gjig);

        Button g2home = findViewById(R.id.g2home);
        g2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // f
        Button g2fbtn = findViewById(R.id.g2fbtn);
        g2fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openf_jigActivity();
            }
        });
        //h
        Button g2hbtn = findViewById(R.id.g2hbtn);
        g2hbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh_jigActivity();
            }
        });


        Button ghostbtn = findViewById(R.id.ghostbtn); //ghost
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ghost_aa);
        ghostbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button grapebtn = findViewById(R.id.grapebtn); //grape
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.grape_aa);
        grapebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button guitarbtn = findViewById(R.id.guitarbtn); //guitar
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.rockon_aa);
        guitarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button goatbtn = findViewById(R.id.goatbtn); //goat
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.goat_aa);
        goatbtn.setOnClickListener(new View.OnClickListener() {
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
    public void openf_jigActivity() {
        Intent intent = new Intent(this, f_jigActivity.class);
        startActivity(intent);
    }
    public void openh_jigActivity() {
        Intent intent = new Intent(this, h_jigActivity.class);
        startActivity(intent);
    }
}