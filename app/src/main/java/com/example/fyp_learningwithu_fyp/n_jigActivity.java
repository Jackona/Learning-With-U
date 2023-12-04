package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class n_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_njig);



        //home
        Button nhbtn = findViewById(R.id.nhbtn);
        nhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // m
        Button n2mbtn = findViewById(R.id.n2mbtn);
        n2mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm_jigActivity();
            }
        });
        //o
        Button n2obtn = findViewById(R.id.n2obtn);
        n2obtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openo_jigActivity();
            }
        });


        Button ninjabtn = findViewById(R.id.ninjabtn); //ninjabtn
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ninja_aa);
        ninjabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button nursebtn = findViewById(R.id.nursebtn); //nursebtn
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.nurse_aa);
        nursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button necklacebtn = findViewById(R.id.necklacebtn); //necklacebtn
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.necklace_aa);
        necklacebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button numberbtn = findViewById(R.id.numberbtn); //musicbtn
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.number_aa);
        numberbtn.setOnClickListener(new View.OnClickListener() {
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

    public void openm_jigActivity() {
        Intent intent = new Intent(this, m_jigActivity.class);
        startActivity(intent);
    }

    public void openo_jigActivity() {
        Intent intent = new Intent(this, o_jigActivity.class);
        startActivity(intent);
    }
}
