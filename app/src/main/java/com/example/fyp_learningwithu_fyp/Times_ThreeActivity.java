package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Times_ThreeActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times_three);


        //math home
        ImageButton imageButton228 = findViewById(R.id.imageButton228);
        imageButton228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });






        ImageButton imageButton227 = findViewById(R.id.imageButton227); //3
       // imageButton227.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.audio_3);
        imageButton227.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });


        ImageButton imageButton226 = findViewById(R.id.imageButton226); //6
       // imageButton226.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.audio_6);
        imageButton226.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });


        ImageButton imageButton225 = findViewById(R.id.imageButton225); //9
       // imageButton225.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.audio_9);
        imageButton225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });


        ImageButton imageButton224 = findViewById(R.id.imageButton224); //12
        //imageButton224.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.audio_12);
        imageButton224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });


        ImageButton imageButton223 = findViewById(R.id.imageButton223); //15
       // imageButton223.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.audio_15);
        imageButton223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });

        ImageButton imageButton222 = findViewById(R.id.imageButton222); //18
       // imageButton222.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.audio_18);
        imageButton222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


        ImageButton imageButton221 = findViewById(R.id.imageButton221); //21
       // imageButton221.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this, R.raw.audio_21);
        imageButton221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });

        ImageButton imageButton220 = findViewById(R.id.imageButton220); //24
       // imageButton220.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.audio_24);
        imageButton220.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });

        ImageButton imageButton219 = findViewById(R.id.imageButton219); //27 CLUB
       // imageButton219.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer27 = MediaPlayer.create(this, R.raw.audio_27);
        imageButton219.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });


        ImageButton imageButton218 = findViewById(R.id.imageButton218); //30
       // imageButton218.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer30 = MediaPlayer.create(this, R.raw.audio_30);
        imageButton218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });

        ImageButton imageButton217 = findViewById(R.id.imageButton217); //33
       // imageButton217.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer33 = MediaPlayer.create(this, R.raw.audio_33);
        imageButton217.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer33.start();
            }
        });


        ImageButton imageButton216 = findViewById(R.id.imageButton216); //36
       // imageButton216.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer36 = MediaPlayer.create(this, R.raw.audio_36);
        imageButton216.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });

        //times
        ImageButton imageButton238 = findViewById(R.id.imageButton238);
        imageButton238.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_TimesActivity();
            }
        });
        //1
        ImageButton imageButton239 = findViewById(R.id.imageButton239);
        imageButton239.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_OneActivity();
            }
        });
        //2
        ImageButton imageButton240 = findViewById(R.id.imageButton240);
        imageButton240.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_TwoActivity();
            }
        });
        //4
        ImageButton imageButton253 = findViewById(R.id.imageButton253);
        imageButton253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FourActivity();
            }
        });
        //5
        ImageButton imageButton254 = findViewById(R.id.imageButton254);
        imageButton253.setOnClickListener(new View.OnClickListener() {
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
    public void openTimes_OneActivity() {
        Intent intent = new Intent(this, Times_OneActivity.class);
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