package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class b_jigActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bjig);

        Button busbtn = findViewById(R.id.busbtn); //bus
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bus_b);
        busbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button bearbtn = findViewById(R.id.bearbtn); //bear
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.bear_b);
        bearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button ballbtn = findViewById(R.id.ballbtn); //ball
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.ball_b);
        ballbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button beebtn = findViewById(R.id.beebtn); //bee
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.bee_b);
        beebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });




        //b to a page
        Button b2a = findViewById(R.id.b2a);
        b2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRim_JigsawActivity();
            }
        });
        //b to c page
        Button b2c = findViewById(R.id.b2c);
        b2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openc_jigActivity();
            }
        });
        //b to home page
        Button b2home = findViewById(R.id.b2home);
        b2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });


    }
    //reading home
    public void openEnglish_ReadingActivity() {
        Intent intent = new Intent(this, English_ReadingActivity.class);
        startActivity(intent);
    }
    //2 c page
    public void openc_jigActivity() {
        Intent intent = new Intent(this, c_jigActivity.class);
        startActivity(intent);
    }
    //b 2 a page
    public void openRim_JigsawActivity() {
        Intent intent = new Intent(this, Rim_JigsawActivity.class);
        startActivity(intent);
    }

}