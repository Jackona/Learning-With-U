package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class o_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojig);




        //home
        Button ohbtn = findViewById(R.id.ohbtn);
        ohbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // n
        Button o2nbtn = findViewById(R.id.o2nbtn);
        o2nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openn_jigActivity();
            }
        });
        //o
        Button o2pbtn = findViewById(R.id.o2pbtn);
        o2pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openp_jigActivity();
            }
        });


        Button orangebtn = findViewById(R.id.orangebtn); //orangebtn
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.orange_aa);
        orangebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button owlbtn = findViewById(R.id.owlbtn); //owlbtn
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.owl_aa);
        owlbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button oysterbtn = findViewById(R.id.oysterbtn); //oysterbtn
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.oyster_aa);
        oysterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button ostrichbtn = findViewById(R.id.ostrichbtn); //ostrichbtn
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.ostrich_aa);
        ostrichbtn.setOnClickListener(new View.OnClickListener() {
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

    public void openn_jigActivity() {
        Intent intent = new Intent(this, n_jigActivity.class);
        startActivity(intent);
    }

    public void openp_jigActivity() {
        Intent intent = new Intent(this, p_jigActivity.class);
        startActivity(intent);
    }
}