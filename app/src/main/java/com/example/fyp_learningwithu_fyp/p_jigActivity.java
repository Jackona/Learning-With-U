package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p_jigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pjig);





        //home
        Button phbtn = findViewById(R.id.phbtn);
        phbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        // o
        Button p2obtn = findViewById(R.id.p2obtn);
        p2obtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openo_jigActivity();
            }
        });
        //q
        Button p2qbtn = findViewById(R.id.p2qbtn);
        p2qbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openq_jigActivity();
            }
        });


        Button btnPencil = findViewById(R.id.btnPencil); //btnPencil
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.pencil_aa);
        btnPencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        Button btnParrot = findViewById(R.id.btnParrot); //btnParrot
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.parrot_aa);
        btnParrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        Button btnPiano = findViewById(R.id.btnPiano); //btnPiano
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.piano_aa);
        btnPiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        Button btnPizza = findViewById(R.id.btnPizza); //btnPizza
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.pizza_aa);
        btnPizza.setOnClickListener(new View.OnClickListener() {
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

    public void openo_jigActivity() {
        Intent intent = new Intent(this, o_jigActivity.class);
        startActivity(intent);
    }

    public void openq_jigActivity() {
        Intent intent = new Intent(this, q_jigActivity.class);
        startActivity(intent);
    }
}