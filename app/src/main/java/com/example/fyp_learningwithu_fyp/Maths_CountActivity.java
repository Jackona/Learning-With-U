package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Maths_CountActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_count);


        //math home
        ImageButton imageButton14 = findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });

        //1
        imageButton = findViewById(R.id.imageButton111);
        MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.audio_1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.start();
            }
        });

        //2
        imageButton = findViewById(R.id.imageButton110);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.audio_2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        //3


        imageButton = findViewById(R.id.imageButton112);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.audio_3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        //4
        imageButton = findViewById(R.id.imageButton113);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.audio_4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        //5


        imageButton = findViewById(R.id.imageButton114);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.audio_5);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        //6


        imageButton = findViewById(R.id.imageButton115);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.audio_6);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        //7

        imageButton = findViewById(R.id.imageButton183);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.audio_7);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        //8

        imageButton = findViewById(R.id.imageButton116);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.audio_8);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        //9

        imageButton = findViewById(R.id.imageButton117);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.audio_9);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        //10

        imageButton = findViewById(R.id.imageButton118);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.audio_10);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        //11
        imageButton = findViewById(R.id.imageButton119);
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.audio_11);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        //12
        imageButton = findViewById(R.id.imageButton120);
        MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.audio_12);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });

        //13
        imageButton = findViewById(R.id.imageButton121);
        MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.audio_13);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });

        //14
        imageButton = findViewById(R.id.imageButton122);
        MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.audio_14);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });

        //15
        imageButton = findViewById(R.id.imageButton123);
        MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.audio_15);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        //16
        imageButton = findViewById(R.id.imageButton124);
        MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.audio_16);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        //17
        imageButton = findViewById(R.id.imageButton125);
        MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.audio_17);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        //18
        imageButton = findViewById(R.id.imageButton126);
        MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.audio_18);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });
        //19
        imageButton = findViewById(R.id.imageButton150);
        MediaPlayer mediaPlayer19 = MediaPlayer.create(this,R.raw.audio_19);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });
       //20
        imageButton = findViewById(R.id.imageButton152);
        MediaPlayer mediaPlayer20 = MediaPlayer.create(this,R.raw.audio_20);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });
        //21
        imageButton = findViewById(R.id.imageButton153);
        MediaPlayer mediaPlayer21 = MediaPlayer.create(this,R.raw.audio_21);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });
        //22
        imageButton = findViewById(R.id.imageButton154);
        MediaPlayer mediaPlayer22 = MediaPlayer.create(this,R.raw.audio_22);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });
        //23
        imageButton = findViewById(R.id.imageButton155);
        MediaPlayer mediaPlayer23 = MediaPlayer.create(this,R.raw.audio_23);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });
        //24
        imageButton = findViewById(R.id.imageButton156);
        MediaPlayer mediaPlayer24 = MediaPlayer.create(this,R.raw.audio_24);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });
        //25
        imageButton = findViewById(R.id.imageButton157);
        MediaPlayer mediaPlayer25 = MediaPlayer.create(this,R.raw.audio_25);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });
        //26
        imageButton = findViewById(R.id.imageButton158);
        MediaPlayer mediaPlayer26 = MediaPlayer.create(this,R.raw.audio_26);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
            }
        });
        //27
        imageButton = findViewById(R.id.imageButton159);
        MediaPlayer mediaPlayer27 = MediaPlayer.create(this,R.raw.audio_27);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });
        //28
        imageButton = findViewById(R.id.imageButton160);
        MediaPlayer mediaPlayer28 = MediaPlayer.create(this,R.raw.audio_28);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });
        //29
        imageButton = findViewById(R.id.imageButton161);
        MediaPlayer mediaPlayer29 = MediaPlayer.create(this,R.raw.audio_29);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
            }
        });
        //30
        imageButton = findViewById(R.id.imageButton162);
        MediaPlayer mediaPlayer30 = MediaPlayer.create(this,R.raw.audio_30);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });
        //31
        imageButton = findViewById(R.id.imageButton163);
        MediaPlayer mediaPlayer31 = MediaPlayer.create(this,R.raw.audio_31);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer31.start();
            }
        });
        //32
        imageButton = findViewById(R.id.imageButton164);
        MediaPlayer mediaPlayer32 = MediaPlayer.create(this,R.raw.audio_32);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
            }
        });
        //33
        imageButton = findViewById(R.id.imageButton165);
        MediaPlayer mediaPlayer33 = MediaPlayer.create(this,R.raw.audio_33);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer33.start();
            }
        });
        //34
        imageButton = findViewById(R.id.imageButton166);
        MediaPlayer mediaPlayer34 = MediaPlayer.create(this,R.raw.audio_34);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer34.start();
            }
        });
       //35
        imageButton = findViewById(R.id.imageButton167);
        MediaPlayer mediaPlayer35 = MediaPlayer.create(this,R.raw.audio_35);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
            }
        });
       //36
        imageButton = findViewById(R.id.imageButton168);
        MediaPlayer mediaPlayer36 = MediaPlayer.create(this,R.raw.audio_36);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });
        //37
        imageButton = findViewById(R.id.imageButton169);
        MediaPlayer mediaPlayer37 = MediaPlayer.create(this,R.raw.audio_37);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer37.start();
            }
        });
        //38
        imageButton = findViewById(R.id.imageButton170);
        MediaPlayer mediaPlayer38 = MediaPlayer.create(this,R.raw.audio_38);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer38.start();
            }
        });
        //39
        imageButton = findViewById(R.id.imageButton171);
        MediaPlayer mediaPlayer39 = MediaPlayer.create(this,R.raw.audio_39);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer39.start();
            }
        });
        //40
        imageButton = findViewById(R.id.imageButton172);
        MediaPlayer mediaPlayer40 = MediaPlayer.create(this,R.raw.audio_40);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });
        //41
        imageButton = findViewById(R.id.imageButton173);
        MediaPlayer mediaPlayer41 = MediaPlayer.create(this,R.raw.audio_41);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer41.start();
            }
        });
        //42
        imageButton = findViewById(R.id.imageButton174);
        MediaPlayer mediaPlayer42 = MediaPlayer.create(this,R.raw.audio_42);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer42.start();
            }
        });
        //43
        imageButton = findViewById(R.id.imageButton175);
        MediaPlayer mediaPlayer43 = MediaPlayer.create(this,R.raw.audio_43);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer43.start();
            }
        });
        //44
        imageButton = findViewById(R.id.imageButton176);
        MediaPlayer mediaPlayer44 = MediaPlayer.create(this,R.raw.audio_44);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer44.start();
            }
        });
        //45
        imageButton = findViewById(R.id.imageButton177);
        MediaPlayer mediaPlayer45 = MediaPlayer.create(this,R.raw.audio_45);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer45.start();
            }
        });
        //46
        imageButton = findViewById(R.id.imageButton178);
        MediaPlayer mediaPlayer46 = MediaPlayer.create(this,R.raw.audio_46);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer46.start();
            }
        });
       //47
        imageButton = findViewById(R.id.imageButton179);
        MediaPlayer mediaPlayer47 = MediaPlayer.create(this,R.raw.audio_47);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer47.start();
            }
        });
        //48
        imageButton = findViewById(R.id.imageButton180);
        MediaPlayer mediaPlayer48 = MediaPlayer.create(this,R.raw.audio_48);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer48.start();
            }
        });
        //49
        imageButton = findViewById(R.id.imageButton181);
        MediaPlayer mediaPlayer49 = MediaPlayer.create(this,R.raw.audio_49);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer49.start();
            }
        });
        //50
        imageButton = findViewById(R.id.imageButton182);
        MediaPlayer mediaPlayer50 = MediaPlayer.create(this,R.raw.audio_50);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer50.start();
            }
        });



    }

    public void openMaths_MainActivity() {
        Intent intent = new Intent(this, Maths_MainActivity.class);
        startActivity(intent);
    }
}