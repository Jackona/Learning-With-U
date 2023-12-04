package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Rim_JigsawActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rim_jigsaw);

        Button aforant = findViewById(R.id.aforant); //ant
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ant_audio);
        aforant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button a4apple = findViewById(R.id.a4apple); //apple
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.apple_audio);
        a4apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button a4alligator = findViewById(R.id.a4alligator); //gator
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.alligator_audio);
        a4alligator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button a4air = findViewById(R.id.a4air); //air
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.airplane_audio);
        a4air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        Button a2bbtn = findViewById(R.id.a2bbtn);
        a2bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openb_jigActivity();
            }
        });
        Button a2home = findViewById(R.id.a2home);
        a2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });





    }
    public void openEnglish_ReadingActivity() {
        Intent intent = new Intent(this, English_ReadingActivity.class);
        startActivity(intent);
    }
    public void openb_jigActivity() {
        Intent intent = new Intent(this, b_jigActivity.class);
        startActivity(intent);
    }
}