package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class f_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fjig);


        Button f2homebtn = findViewById(R.id.f2homebtn);
        f2homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // f to e page
        Button f2ebtn = findViewById(R.id.f2ebtn);
        f2ebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opene_jigActivity();
            }
        });
        //f to g page
        Button f2gbtn = findViewById(R.id.f2gbtn);
        f2gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openg_jigActivity();
            }
        });


        Button fishbtn = findViewById(R.id.fishbtn); //fish
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.fish_f);
        fishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button fencebtn = findViewById(R.id.fencebtn); //fence
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.fence_f);
        fencebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button frogbtn = findViewById(R.id.frogbtn); //frog
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.frog_f);
        frogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button fuelbtn = findViewById(R.id.fuelbtn); //fuel
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.fuel_f);
        fuelbtn.setOnClickListener(new View.OnClickListener() {
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
    public void opene_jigActivity() {
        Intent intent = new Intent(this, e_jigActivity.class);
        startActivity(intent);
    }
    public void openg_jigActivity() {
        Intent intent = new Intent(this, g_jigActivity.class);
        startActivity(intent);
    }
}