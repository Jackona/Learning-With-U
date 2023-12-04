package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class k_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kjig);

        //home
        Button khbtn = findViewById(R.id.khbtn);
        khbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // L
        Button k2lbtn = findViewById(R.id.k2lbtn);
        k2lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openl_jigActivity();
            }
        });
        //j
        Button k2jbtn = findViewById(R.id.k2jbtn);
        k2jbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openj_jigActivity();
            }
        });


        Button btnkangaroo = findViewById(R.id.btnkangaroo); //btnkangaroo
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.kang_aa);
        btnkangaroo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button kingbtn = findViewById(R.id.kingbtn); //kingbtn
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.king_aa);
        kingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button kiwibtn = findViewById(R.id.kiwibtn); //kiwibtn
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.kiwi_aa);
        kiwibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button btnkarate = findViewById(R.id.btnkarate); //btnkarate
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.karate_aa);
        btnkarate.setOnClickListener(new View.OnClickListener() {
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

    public void openj_jigActivity() {
        Intent intent = new Intent(this, j_jigActivity.class);
        startActivity(intent);
    }

    public void openl_jigActivity() {
        Intent intent = new Intent(this, l_jigActivity.class);
        startActivity(intent);
    }
}
