package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class l_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ljig);


        //home
        Button lhbtn = findViewById(R.id.lhbtn);
        lhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // k
        Button l2kbtn = findViewById(R.id.l2kbtn);
        l2kbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openk_jigActivity();
            }
        });
        //m
        Button l2mbtn = findViewById(R.id.l2mbtn);
        l2mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm_jigActivity();
            }
        });


        Button ladderbtn = findViewById(R.id.ladderbtn); //ladderbtn
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ladder_aa);
        ladderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button leafbtn = findViewById(R.id.leafbtn); //leafbtn
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.leaf_aa);
        leafbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button lionbtn = findViewById(R.id.lionbtn); //lionbtn
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.lion_aa);
        lionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button lbbtn = findViewById(R.id.lbbtn); //lbbtn
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.lb_aa);
        lbbtn.setOnClickListener(new View.OnClickListener() {
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

    public void openk_jigActivity() {
        Intent intent = new Intent(this, k_jigActivity.class);
        startActivity(intent);
    }

    public void openm_jigActivity() {
        Intent intent = new Intent(this, m_jigActivity.class);
        startActivity(intent);
    }
}
