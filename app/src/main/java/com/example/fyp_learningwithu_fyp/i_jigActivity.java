package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class i_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ijig);


        Button ihbtn = findViewById(R.id.ihbtn);
        ihbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // h
        Button h2btn = findViewById(R.id.h2btn);
        h2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh_jigActivity();
            }
        });
        //j
        Button i2jbtn = findViewById(R.id.i2jbtn);
        i2jbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openj_jigActivity();
            }
        });


        Button icebtn = findViewById(R.id.icebtn); //ice
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ice_aa);
        icebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button ironbtn = findViewById(R.id.ironbtn); //iron
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.iron_aa);
        ironbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button iguanabtn = findViewById(R.id.iguanabtn); //iguanabtn
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.iguana_aa);
        iguanabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button islandbtn = findViewById(R.id.islandbtn); //islandbtn
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.island_aa);
        islandbtn.setOnClickListener(new View.OnClickListener() {
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
    public void openh_jigActivity() {
        Intent intent = new Intent(this, h_jigActivity.class);
        startActivity(intent);
    }
    public void openj_jigActivity() {
        Intent intent = new Intent(this, j_jigActivity.class);
        startActivity(intent);
    }
}