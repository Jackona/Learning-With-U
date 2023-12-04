package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujig);



        //home
        Button uhbtn = findViewById(R.id.uhbtn);
        uhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // t
        Button u2tbtn = findViewById(R.id.u2tbtn);
        u2tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent_jigActivity();
            }
        });
        //v
        Button u2vbtn = findViewById(R.id.u2vbtn);
        u2vbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openv_jigActivity();
            }
        });


        Button bUmbrella = findViewById(R.id.bUmbrella); //bUmbrella
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.umbrella_aa);
        bUmbrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button bUnicorn = findViewById(R.id.bUnicorn); //bUnicorn
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.unicorn_aa);
        bUnicorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button bUniverse = findViewById(R.id.bUniverse); //bUniverse
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.universe_aa);
        bUniverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button bUnicycle = findViewById(R.id.bUnicycle); //bUnicycle
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.unicycle_aa);
        bUnicycle.setOnClickListener(new View.OnClickListener() {
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

    public void opent_jigActivity() {
        Intent intent = new Intent(this, t_jigActivity.class);
        startActivity(intent);
    }

    public void openv_jigActivity() {
        Intent intent = new Intent(this, v_jigActivity.class);
        startActivity(intent);
    }
}
