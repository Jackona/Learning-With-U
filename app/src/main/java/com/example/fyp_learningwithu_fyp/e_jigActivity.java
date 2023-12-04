package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class e_jigActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejig);

        Button e2home = findViewById(R.id.e2home);
        e2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // e to d page
        Button e2dbtn = findViewById(R.id.e2dbtn);
        e2dbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opend_jigActivity();
            }
        });
        //e to f page
        Button e2fbtn = findViewById(R.id.e2fbtn);
        e2fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openf_jigActivity();
            }
        });


        Button eyebtn = findViewById(R.id.eyebtn); //eye
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eye_audioe);
        eyebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button earthbtn = findViewById(R.id.earthbtn); //earth
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.earth_audio);
        earthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button elephantbtn = findViewById(R.id.elephantbtn); //elep
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.elephant_audio);
        elephantbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button elfbtn = findViewById(R.id.elfbtn); //elf
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.elf_audio);
        elfbtn.setOnClickListener(new View.OnClickListener() {
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
    public void opend_jigActivity() {
        Intent intent = new Intent(this, d_jigActivity.class);
        startActivity(intent);
    }
    public void openf_jigActivity() {
        Intent intent = new Intent(this, f_jigActivity.class);
        startActivity(intent);
    }
}