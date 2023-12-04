package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Times_FourActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times_four);


        //math home
        ImageButton imageButton300 = findViewById(R.id.imageButton300);
        imageButton300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });
        //times
        ImageButton imageButton255 = findViewById(R.id.imageButton255);
        imageButton255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_TimesActivity();
            }
        });
        //1
        ImageButton imageButton256 = findViewById(R.id.imageButton256);
        imageButton256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_OneActivity();
            }
        });
        //2
        ImageButton imageButton257 = findViewById(R.id.imageButton257);
        imageButton257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_TwoActivity();
            }
        });
        //3
        ImageButton imageButton258 = findViewById(R.id.imageButton258);
        imageButton258.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_ThreeActivity();
            }
        });
        //5
        ImageButton imageButton259 = findViewById(R.id.imageButton259);
        imageButton259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FiveActivity();
            }
        });

        ImageButton imageButton252 = findViewById(R.id.imageButton252); //4
       // imageButton252.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.audio_4);
        imageButton252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });


        ImageButton imageButton251 = findViewById(R.id.imageButton251); //8
       // imageButton251.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.audio_8);
        imageButton251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });


        ImageButton imageButton250 = findViewById(R.id.imageButton250); //12
       // imageButton250.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.audio_12);
        imageButton250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });


        ImageButton imageButton249 = findViewById(R.id.imageButton249); //16
       // imageButton249.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.audio_16);
        imageButton249.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });


        ImageButton imageButton248 = findViewById(R.id.imageButton248); //20
       // imageButton248.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.audio_20);
        imageButton248.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });

        ImageButton imageButton247 = findViewById(R.id.imageButton247); //24
       // imageButton247.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.audio_24);
        imageButton247.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });


        ImageButton imageButton246 = findViewById(R.id.imageButton246); //28
       // imageButton246.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer28 = MediaPlayer.create(this, R.raw.audio_28);
        imageButton246.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });


        ImageButton imageButton245 = findViewById(R.id.imageButton245); //32
       // imageButton245.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer32 = MediaPlayer.create(this, R.raw.audio_32);
        imageButton245.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
            }
        });


        ImageButton imageButton244 = findViewById(R.id.imageButton244); //36
       // imageButton244.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer36 = MediaPlayer.create(this, R.raw.audio_36);
        imageButton244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });


        ImageButton imageButton243 = findViewById(R.id.imageButton243); //40
       // imageButton243.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer40 = MediaPlayer.create(this, R.raw.audio_40);
        imageButton243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });


        ImageButton imageButton242 = findViewById(R.id.imageButton242); //44
       // imageButton242.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer44 = MediaPlayer.create(this, R.raw.audio_44);
        imageButton242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer44.start();
            }
        });


        ImageButton imageButton241 = findViewById(R.id.imageButton241); //48
       // imageButton241.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer48 = MediaPlayer.create(this, R.raw.audio_48);
        imageButton241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer48.start();
            }
        });


    }

        public void openMaths_MainActivity() {
            Intent intent = new Intent(this, Maths_MainActivity.class);
            startActivity(intent);
        }
        public void openMaths_TimesActivity() {
            Intent intent = new Intent(this, Maths_TimesActivity.class);
            startActivity(intent);
        }
        public void openTimes_TwoActivity() {
            Intent intent = new Intent(this, Times_TwoActivity.class);
            startActivity(intent);
        }
        public void openTimes_ThreeActivity() {
            Intent intent = new Intent(this, Times_ThreeActivity.class);
            startActivity(intent);
        }
        public void openTimes_OneActivity() {
            Intent intent = new Intent(this, Times_OneActivity.class);
            startActivity(intent);
        }
        public void openTimes_FiveActivity() {
            Intent intent = new Intent(this, Times_FiveActivity.class);
            startActivity(intent);
        }
    }