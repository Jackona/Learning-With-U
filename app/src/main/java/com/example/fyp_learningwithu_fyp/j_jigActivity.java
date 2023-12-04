package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class j_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jjig);


        Button jhbtn = findViewById(R.id.jhbtn);
        jhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // h
        Button i2btn = findViewById(R.id.i2btn);
        i2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openi_jigActivity();
            }
        });
        //j
        Button j2kbtn = findViewById(R.id.j2kbtn);
        j2kbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openk_jigActivity();
            }
        });


        Button junglebtn = findViewById(R.id.junglebtn); //jungle
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jungle_aa);
        junglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button jagbtn = findViewById(R.id.jagbtn); //jagbtn
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.jag_aa);
        jagbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button jigbtn = findViewById(R.id.jigbtn); //jigbtn
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.js_aa);
        jigbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button jupiterbtn = findViewById(R.id.jupiterbtn); //jupiterbtn
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.jupiter_aa);
        jupiterbtn.setOnClickListener(new View.OnClickListener() {
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

    public void openi_jigActivity() {
        Intent intent = new Intent(this, i_jigActivity.class);
        startActivity(intent);
    }

    public void openk_jigActivity() {
        Intent intent = new Intent(this, k_jigActivity.class);
        startActivity(intent);
    }
}
