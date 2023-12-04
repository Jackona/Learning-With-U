package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class c_jigActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cjig);

        Button c2home = findViewById(R.id.c2home);
        c2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // c to d page
        Button c2dbtn = findViewById(R.id.c2dbtn);
        c2dbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oepnd_jigActivity();
            }
        });
        //c to b page
        Button c2bbtn = findViewById(R.id.c2bbtn);
        c2bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openb_jigActivity();
            }
        });

        Button catbtn = findViewById(R.id.catbtn); //cat
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audio_catc);
        catbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button cowbtn = findViewById(R.id.cowbtn); //cow
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.audio_cowc);
        cowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button cakebtn = findViewById(R.id.cakebtn); //cake
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.audio_cakecc);
        cakebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button chairbtn = findViewById(R.id.chairbtn); //chair
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.audio_chairc);
        chairbtn.setOnClickListener(new View.OnClickListener() {
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
    public void oepnd_jigActivity() {
        Intent intent = new Intent(this, d_jigActivity.class);
        startActivity(intent);
    }
    public void openb_jigActivity() {
        Intent intent = new Intent(this, b_jigActivity.class);
        startActivity(intent);
    }
}