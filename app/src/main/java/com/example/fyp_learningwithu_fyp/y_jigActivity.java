package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class y_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yjig);



        //home
        Button yhbtn = findViewById(R.id.yhbtn);
        yhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // x
        Button y2xbtn = findViewById(R.id.y2xbtn);
        y2xbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openx_jigActivity();
            }
        });
        //z
        Button y2zbtn = findViewById(R.id.y2zbtn);
        y2zbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openz_jigActivity();
            }
        });


        Button bYoga = findViewById(R.id.bYoga); //bYoga
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.yoga_aa);
        bYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button bYacht = findViewById(R.id.bYacht); //bYacht
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.yacht_aa);
        bYacht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button bYoghurt = findViewById(R.id.bYoghurt); //bYoghurt
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.yog_aa);
        bYoghurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button bYoung = findViewById(R.id.bYoung); //bYoung
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.young_aa);
        bYoung.setOnClickListener(new View.OnClickListener() {
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

    public void openx_jigActivity() {
        Intent intent = new Intent(this, x_jigActivity.class);
        startActivity(intent);
    }

    public void openz_jigActivity() {
        Intent intent = new Intent(this, z_jigActivity.class);
        startActivity(intent);
    }
}
