package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class z_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zjig);



        //home
        Button zhbtn = findViewById(R.id.zhbtn);
        zhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // y
        Button z2ybtn = findViewById(R.id.z2ybtn);
        z2ybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openy_jigActivity();
            }
        });
        //a
        Button z2abtn = findViewById(R.id.z2abtn);
        z2abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRim_JigsawActivity();
            }
        });


        Button bZoo = findViewById(R.id.bZoo); //bZoo
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.zoo_aa);
        bZoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button bZebra = findViewById(R.id.bZebra); //bZebra
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.zebra_aa);
        bZebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button bZodiac = findViewById(R.id.bZodiac); //bZodiac
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.zodiac_aa);
        bZodiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button bZipper = findViewById(R.id.bZipper); //bZipper
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.zipper_aa);
        bZipper.setOnClickListener(new View.OnClickListener() {
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

    public void openy_jigActivity() {
        Intent intent = new Intent(this, y_jigActivity.class);
        startActivity(intent);
    }

    public void openRim_JigsawActivity() {
        Intent intent = new Intent(this, Rim_JigsawActivity.class);
        startActivity(intent);
    }
}
