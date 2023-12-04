package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class t_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tjig);



        //home
        Button thbtn = findViewById(R.id.thbtn);
        thbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // s
        Button t2sbtn = findViewById(R.id.t2sbtn);
        t2sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opens_jigActivity();
            }
        });
        //u
        Button t2ubtn = findViewById(R.id.t2ubtn);
        t2ubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openu_jigActivity();
            }
        });


        Button bTable = findViewById(R.id.bTable); //bTable
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.table_aa);
        bTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button bTomato = findViewById(R.id.bTomato); //bTomato
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.tomato_aa);
        bTomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button bTiger = findViewById(R.id.bTiger); //bTiger
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.tiger_aa);
        bTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button bTrain = findViewById(R.id.bTrain); //bTrain
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.train_aa);
        bTrain.setOnClickListener(new View.OnClickListener() {
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

    public void opens_jigActivity() {
        Intent intent = new Intent(this, s_jigActivity.class);
        startActivity(intent);
    }

    public void openu_jigActivity() {
        Intent intent = new Intent(this, u_jigActivity.class);
        startActivity(intent);
    }
}
