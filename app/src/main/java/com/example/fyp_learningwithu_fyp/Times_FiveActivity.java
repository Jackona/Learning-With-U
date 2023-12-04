package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Times_FiveActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times_five);


        //math home
        ImageButton imageButton300 = findViewById(R.id.imageButton300);
        imageButton300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });





        ImageButton imageButton252 = findViewById(R.id.imageButton252); //5
       // imageButton252.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.audio_5);
        imageButton252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });


        ImageButton imageButton251 = findViewById(R.id.imageButton251); //10
       // imageButton251.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.audio_10);
        imageButton251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        ImageButton imageButton250 = findViewById(R.id.imageButton250); //15
       // imageButton250.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.audio_15);
        imageButton250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });



        ImageButton imageButton249 = findViewById(R.id.imageButton249); //20
       // imageButton249.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.audio_20);
        imageButton249.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });
        ImageButton imageButton248 = findViewById(R.id.imageButton248); //25
       // imageButton248.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this, R.raw.audio_25);
        imageButton248.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });


        ImageButton imageButton247 = findViewById(R.id.imageButton247); //30
        //imageButton247.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer30 = MediaPlayer.create(this, R.raw.audio_30);
        imageButton247.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });

        ImageButton imageButton246 = findViewById(R.id.imageButton246); //35
       // imageButton246.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer35 = MediaPlayer.create(this, R.raw.audio_35);
        imageButton246.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
            }
        });


        ImageButton imageButton245 = findViewById(R.id.imageButton245); //40
       // imageButton245.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer40 = MediaPlayer.create(this, R.raw.audio_40);
        imageButton245.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });

        ImageButton imageButton244 = findViewById(R.id.imageButton244); //45
       // imageButton244.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer45 = MediaPlayer.create(this, R.raw.audio_45);
        imageButton244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer45.start();
            }
        });

        ImageButton imageButton243 = findViewById(R.id.imageButton243); //50
       // imageButton243.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer50 = MediaPlayer.create(this, R.raw.audio_50);
        imageButton243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer50.start();
            }
        });
        ImageButton imageButton242 = findViewById(R.id.imageButton242); //55
       // imageButton242.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer55 = MediaPlayer.create(this, R.raw.audio_55);
        imageButton242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer55.start();
            }
        });
        ImageButton imageButton241 = findViewById(R.id.imageButton241); //60
      //  imageButton241.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer60 = MediaPlayer.create(this, R.raw.audio_60);
        imageButton241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer60.start();
            }
        });



        //to times
        ImageButton imageButton260 = findViewById(R.id.imageButton260);
        imageButton260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_TimesActivity();
            }
        });
        //1
        ImageButton imageButton261 = findViewById(R.id.imageButton261);
        imageButton261.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_OneActivity();
            }
        });
        // to 2
        ImageButton imageButton262 = findViewById(R.id.imageButton262);
        imageButton262.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_TwoActivity();
            }
        });
        //3
        ImageButton imageButton263 = findViewById(R.id.imageButton263);
        imageButton263.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_ThreeActivity();
            }
        });
        //4
        ImageButton imageButton264 = findViewById(R.id.imageButton264);
        imageButton264.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FourActivity();
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
    public void openTimes_FourActivity() {
        Intent intent = new Intent(this, Times_FourActivity.class);
        startActivity(intent);
    }
}