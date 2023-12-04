package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class w_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wjig);



        //home
        Button whbtn = findViewById(R.id.whbtn);
        whbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // V
        Button w2vbtn = findViewById(R.id.w2vbtn);
        w2vbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openv_jigActivity();
            }
        });
        //x
        Button w2xbtn = findViewById(R.id.w2xbtn);
        w2xbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openx_jigActivity();
            }
        });


        Button bWater = findViewById(R.id.bWater); //bWater
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.water_aa);
        bWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button bWhale = findViewById(R.id.bWhale); //bWhale
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.whale_aa);
        bWhale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button bWheelchair = findViewById(R.id.bWheelchair); //bWheelchair
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.wheelchair_aa);
        bWheelchair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button bWizard = findViewById(R.id.bWizard); //bWizard
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.wizard_aa);
        bWizard.setOnClickListener(new View.OnClickListener() {
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

    public void openv_jigActivity() {
        Intent intent = new Intent(this, v_jigActivity.class);
        startActivity(intent);
    }

    public void openx_jigActivity() {
        Intent intent = new Intent(this, x_jigActivity.class);
        startActivity(intent);
    }
}
