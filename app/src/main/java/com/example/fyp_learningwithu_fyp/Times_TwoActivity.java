package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Times_TwoActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times_two);


        //math home
        ImageButton imageButton202 = findViewById(R.id.imageButton202);
        imageButton202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });





        ImageButton imageButton203 = findViewById(R.id.imageButton203); //2
       // imageButton203.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.audio_2);
        imageButton203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });



        ImageButton imageButton204 = findViewById(R.id.imageButton204); //4
       // imageButton204.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.audio_4);
        imageButton204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });



        ImageButton imageButton205 = findViewById(R.id.imageButton205); //6
      //  imageButton205.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.audio_6);
        imageButton205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });



        ImageButton imageButton206 = findViewById(R.id.imageButton206); //8
      //  imageButton206.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.audio_8);
        imageButton206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });



        ImageButton imageButton207 = findViewById(R.id.imageButton207); //10
       // imageButton207.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.audio_10);
        imageButton207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });



        ImageButton imageButton208 = findViewById(R.id.imageButton208); //12
      //  imageButton208.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.audio_12);
        imageButton208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });



        ImageButton imageButton209 = findViewById(R.id.imageButton209); //14
       // imageButton209.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this, R.raw.audio_14);
        imageButton209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });



        ImageButton imageButton210 = findViewById(R.id.imageButton210); //16
       // imageButton210.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.audio_16);
        imageButton210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });



        ImageButton imageButton211 = findViewById(R.id.imageButton211); //18
       // imageButton211.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.audio_18);
        imageButton211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });



        ImageButton imageButton212 = findViewById(R.id.imageButton212); //20
       // imageButton212.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.audio_20);
        imageButton212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });



        ImageButton imageButton213 = findViewById(R.id.imageButton213); //22
       // imageButton213.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this, R.raw.audio_22);
        imageButton213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });


        ImageButton imageButton214 = findViewById(R.id.imageButton214); //24
       // imageButton214.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.audio_24);
        imageButton214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });


        //to times
        ImageButton imageButton215 = findViewById(R.id.imageButton215);
        imageButton215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_TimesActivity();
            }
        });
        //1
        ImageButton imageButton234 = findViewById(R.id.imageButton234);
        imageButton234.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_OneActivity();
            }
        });
        //3
        ImageButton imageButton235 = findViewById(R.id.imageButton235);
        imageButton235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_ThreeActivity();
            }
        });
        //4
        ImageButton imageButton236 = findViewById(R.id.imageButton236);
        imageButton236.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FourActivity();
            }
        });
        //5
        ImageButton imageButton237 = findViewById(R.id.imageButton237);
        imageButton237.setOnClickListener(new View.OnClickListener() {
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
    public void openTimes_OneActivity() {
        Intent intent = new Intent(this, Times_OneActivity.class);
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
