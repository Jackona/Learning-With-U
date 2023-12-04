package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class English_AlphabetActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabet);


        //english home
        ImageButton imageButton17 = findViewById(R.id.imageButton17);
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_MainActivity();
            }
        });

        ImageButton imageButton108 = findViewById(R.id.imageButton108); //A
        //imageButton108.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audioa);
        imageButton108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton127 = findViewById(R.id.imageButton127); //B
        //imageButton127.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.audiob);
        imageButton127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton128 = findViewById(R.id.imageButton128); //C
       // imageButton128.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.audioc);
        imageButton128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton129 = findViewById(R.id.imageButton129); //D
        //imageButton129.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.audiod);
        imageButton129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton130 = findViewById(R.id.imageButton130); //E
        //imageButton130.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.audioe);
        imageButton130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton131 = findViewById(R.id.imageButton131); //F
       //imageButton131.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.audiof);
        imageButton131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton132 = findViewById(R.id.imageButton132); //G
       // imageButton132.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.audiog);
        imageButton132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton133 = findViewById(R.id.imageButton133); //H
       // imageButton133.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.audioh);
        imageButton133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton134 = findViewById(R.id.imageButton134); //I
       // imageButton134.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.audioi);
        imageButton134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton135 = findViewById(R.id.imageButton135); //J
       // imageButton135.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.audioj);
        imageButton135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton136 = findViewById(R.id.imageButton136); //K
       // imageButton136.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.audiok);
        imageButton136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton109 = findViewById(R.id.imageButton109); //L
       // imageButton109.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.audiol);
        imageButton109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton137 = findViewById(R.id.imageButton137); //M
       // imageButton137.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this, R.raw.audiom);
        imageButton137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton138 = findViewById(R.id.imageButton138); //N
       // imageButton138.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this, R.raw.audion);
        imageButton138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton139 = findViewById(R.id.imageButton139); //O
       // imageButton139.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.audioo);
        imageButton139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton140 = findViewById(R.id.imageButton140); //P
       // imageButton140.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.audiop);
        imageButton140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton141 = findViewById(R.id.imageButton141); //Q
       // imageButton141.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this, R.raw.audioq);
        imageButton141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton142 = findViewById(R.id.imageButton142); //R
        //imageButton142.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.audior);
        imageButton142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton143 = findViewById(R.id.imageButton143); //S
       // imageButton143.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this, R.raw.audios);
        imageButton143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton144 = findViewById(R.id.imageButton144); //T
        //imageButton144.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.audiot);
        imageButton144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton145 = findViewById(R.id.imageButton145); //U
       // imageButton145.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this, R.raw.audiou);
        imageButton145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton146 = findViewById(R.id.imageButton146); //V
       // imageButton146.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this, R.raw.audiov);
        imageButton146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton147 = findViewById(R.id.imageButton147); //W
       // imageButton147.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this, R.raw.audiow);
        imageButton147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton148 = findViewById(R.id.imageButton148); //X
       // imageButton148.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.audiox);
        imageButton148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton149 = findViewById(R.id.imageButton149); //Y
       // imageButton149.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this, R.raw.audioy);
        imageButton149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton151 = findViewById(R.id.imageButton151); //Z
       // imageButton151.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer26 = MediaPlayer.create(this, R.raw.audioz);
        imageButton151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });


    }

    public void openEnglish_MainActivity() {
        Intent intent = new Intent(this, English_MainActivity.class);
        startActivity(intent);
    }
}