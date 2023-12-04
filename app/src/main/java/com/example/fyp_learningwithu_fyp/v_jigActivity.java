package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class v_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vjig);



        //home
        Button vhtbn = findViewById(R.id.vhtbn);
        vhtbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // u
        Button v2ubtn = findViewById(R.id.v2ubtn);
        v2ubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openu_jigActivity();
            }
        });
        //w
        Button v2wbtn = findViewById(R.id.v2wbtn);
        v2wbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openw_jigActivity();
            }
        });


        Button bVolcano = findViewById(R.id.bVolcano); //bVolcano
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.volcano_aa);
        bVolcano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button bVan = findViewById(R.id.bVan); //bVan
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.van_aa);
        bVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button bViper = findViewById(R.id.bViper); //bViper
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.viper_aa);
        bViper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button bVacuum = findViewById(R.id.bVacuum); //bVacuum
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.vacuum_aa);
        bVacuum.setOnClickListener(new View.OnClickListener() {
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

    public void openu_jigActivity() {
        Intent intent = new Intent(this, u_jigActivity.class);
        startActivity(intent);
    }

    public void openw_jigActivity() {
        Intent intent = new Intent(this, w_jigActivity.class);
        startActivity(intent);
    }
}
