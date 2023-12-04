package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class x_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xjig);



        //home
        Button xhbtn = findViewById(R.id.xhbtn);
        xhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // w
        Button x2wbtn = findViewById(R.id.x2wbtn);
        x2wbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openw_jigActivity();
            }
        });
        //y
        Button x2ybtn = findViewById(R.id.x2ybtn);
        x2ybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openy_jigActivity();
            }
        });


        Button bXylophone = findViewById(R.id.bXylophone); //bXylophone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.xylophone_aa);
        bXylophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button btnxray = findViewById(R.id.btnxray); //btnxray
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.xray_aa);
        btnxray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button bXiaosaurus = findViewById(R.id.bXiaosaurus); //bXiaosaurus
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.xiaosaurus_aa);
        bXiaosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button bXylem = findViewById(R.id.bXylem); //bXylem
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.xylem_aa);
        bXylem.setOnClickListener(new View.OnClickListener() {
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

    public void openw_jigActivity() {
        Intent intent = new Intent(this, w_jigActivity.class);
        startActivity(intent);
    }

    public void openy_jigActivity() {
        Intent intent = new Intent(this, y_jigActivity.class);
        startActivity(intent);
    }
}
