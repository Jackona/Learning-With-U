package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class d_jigActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djig);

        Button d2home = findViewById(R.id.d2home);
        d2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // d to c page
        Button d2cbtn = findViewById(R.id.d2cbtn);
        d2cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openc_jigActivity();
            }
        });
        //d to e page
        Button c2ebtn = findViewById(R.id.c2ebtn);
        c2ebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opene_jigActivity();
            }
        });

        Button doorbtn = findViewById(R.id.doorbtn); //door
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audio_doord);
        doorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button dogbtn = findViewById(R.id.dogbtn); //dog
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.audio_dogd);
        dogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button skyrimbtn = findViewById(R.id.skyrimbtn); //dragon
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.audio_dragond);
        skyrimbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button danerousbtn = findViewById(R.id.danerousbtn); //oh no not too close
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.dangerous_audio);
        danerousbtn.setOnClickListener(new View.OnClickListener() {
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
    public void openc_jigActivity() {
        Intent intent = new Intent(this, c_jigActivity.class);
        startActivity(intent);
    }
    public void opene_jigActivity() {
        Intent intent = new Intent(this, e_jigActivity.class);
        startActivity(intent);
    }
}