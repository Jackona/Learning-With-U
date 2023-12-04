package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Times_OneActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times_one);


        //math home
        ImageButton imageButton189 = findViewById(R.id.imageButton189);
        imageButton189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });





        ImageButton imageButton190 = findViewById(R.id.imageButton190); //1
        //imageButton190.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audio_1);
        imageButton190.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton191 = findViewById(R.id.imageButton191); //2
       // imageButton191.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.audio_2);
        imageButton191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton192 = findViewById(R.id.imageButton192); //3
       // imageButton192.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.audio_3);
        imageButton192.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton193 = findViewById(R.id.imageButton193); //4
       // imageButton193.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.audio_4);
        imageButton193.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton194 = findViewById(R.id.imageButton194); //5
       // imageButton194.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.audio_5);
        imageButton194.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton195 = findViewById(R.id.imageButton195); //6
       // imageButton195.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.audio_6);
        imageButton195.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton196 = findViewById(R.id.imageButton196); //7
      //  imageButton196.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.audio_7);
        imageButton196.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton197 = findViewById(R.id.imageButton197); //8
      //  imageButton197.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.audio_8);
        imageButton197.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton198 = findViewById(R.id.imageButton198); //9
       // imageButton198.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.audio_9);
        imageButton198.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton199 = findViewById(R.id.imageButton199); //10
       // imageButton199.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.audio_10);
        imageButton199.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton200 = findViewById(R.id.imageButton200); //11
       // imageButton200.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.audio_11);
        imageButton200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton201 = findViewById(R.id.imageButton201); //12
      //  imageButton201.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.audio_12);
        imageButton201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });


        //to times
        ImageButton imageButton233 = findViewById(R.id.imageButton233);
        imageButton233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_TimesActivity();
            }
        });
        //to 2
        ImageButton imageButton229 = findViewById(R.id.imageButton229);
        imageButton229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_TwoActivity();
            }
        });
        //to 3
        ImageButton imageButton230 = findViewById(R.id.imageButton230);
        imageButton230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_ThreeActivity();
            }
        });
        //4
        ImageButton imageButton231 = findViewById(R.id.imageButton231);
        imageButton231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FourActivity();
            }
        });
        //5
        ImageButton imageButton232 = findViewById(R.id.imageButton232);
        imageButton232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FiveActivity();
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
    public void openTimes_FourActivity() {
        Intent intent = new Intent(this, Times_FourActivity.class);
        startActivity(intent);
    }
    public void openTimes_FiveActivity() {
        Intent intent = new Intent(this, Times_FiveActivity.class);
        startActivity(intent);
    }
}