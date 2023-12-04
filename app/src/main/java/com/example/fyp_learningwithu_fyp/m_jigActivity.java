package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class m_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mjig);


        //home
        Button mhbtn = findViewById(R.id.mhbtn);
        mhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // l
        Button m2lbtn = findViewById(R.id.m2lbtn);
        m2lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openl_jigActivity();
            }
        });
        //m
        Button m2nbtn = findViewById(R.id.m2nbtn);
        m2nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openn_jigActivity();
            }
        });


        Button milkbtn = findViewById(R.id.milkbtn); //milkbtn
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.milk_aa);
        milkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button mailbtn = findViewById(R.id.mailbtn); //mailbtn
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.mail_aa);
        mailbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button melonbtn = findViewById(R.id.melonbtn); //melonbtn
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.melon_aa);
        melonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button musicbtn = findViewById(R.id.musicbtn); //musicbtn
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.music_aa);
        musicbtn.setOnClickListener(new View.OnClickListener() {
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

    public void openl_jigActivity() {
        Intent intent = new Intent(this, l_jigActivity.class);
        startActivity(intent);
    }

    public void openn_jigActivity() {
        Intent intent = new Intent(this, n_jigActivity.class);
        startActivity(intent);
    }
}
