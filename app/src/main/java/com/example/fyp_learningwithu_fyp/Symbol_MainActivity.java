package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Symbol_MainActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol_main);


        //home
        ImageButton imageButton11 = findViewById(R.id.imageButton11);
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });
        //next page to s2
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_TwoActivity();
            }
        });



        ImageButton imageButton29 = findViewById(R.id.imageButton29); //moon
        // imageButton29.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.moon);
        imageButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton23 = findViewById(R.id.imageButton23); //airplane
        // imageButton23.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.airplane);
        imageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        ImageButton imageButton24 = findViewById(R.id.imageButton24); //bed
        // imageButton24.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.bed);
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        ImageButton imageButton25 = findViewById(R.id.imageButton25); //battery
        // imageButton25.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.battery);
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        ImageButton imageButton26 = findViewById(R.id.imageButton26); //scale
        // imageButton26.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.scale);
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        ImageButton imageButton27 = findViewById(R.id.imageButton27); //phone
        // imageButton27.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.phone);
        imageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        ImageButton imageButton28 = findViewById(R.id.imageButton28); //chair
        // imageButton28.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.chair);
        imageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        ImageButton imageButton30 = findViewById(R.id.imageButton30); //party
        // imageButton30.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.party);
        imageButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        ImageButton imageButton31 = findViewById(R.id.imageButton31); //bug
        //  imageButton31.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.bug);
        imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        ImageButton imageButton32 = findViewById(R.id.imageButton32); //correct
        //  imageButton32.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.correct);
        imageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        ImageButton imageButton33 = findViewById(R.id.imageButton33); //cake
        //  imageButton33.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.cake);
        imageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        ImageButton imageButton34 = findViewById(R.id.imageButton34); //castle
        // imageButton34.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.castle);
        imageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        ImageButton imageButton35 = findViewById(R.id.imageButton35); //painting
        // imageButton35.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.painting);
        imageButton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });

        ImageButton imageButton36 = findViewById(R.id.imageButton36); //sun
        // imageButton36.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.sun);
        imageButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });

        ImageButton imageButton37 = findViewById(R.id.imageButton37); //umbrella
        // imageButton37.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.umbrella);
        imageButton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });

        ImageButton imageButton38 = findViewById(R.id.imageButton38); //church
        // imageButton38.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.church);
        imageButton38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });

        ImageButton imageButton39 = findViewById(R.id.imageButton39); //cloud
        // imageButton39.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.cloud);
        imageButton39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });

        ImageButton imageButton40 = findViewById(R.id.imageButton40); //coffee
        // imageButton40.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.coffee);
        imageButton40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });

        ImageButton imageButton41 = findViewById(R.id.imageButton41); //scissors
        // imageButton41.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.scissors);
        imageButton41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

        ImageButton imageButton42 = findViewById(R.id.imageButton42); //pencil
        // imageButton42.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this,R.raw.pencil);
        imageButton42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });

        ImageButton imageButton46 = findViewById(R.id.imageButton46); //money
        // imageButton46.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this,R.raw.money);
        imageButton46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });

        ImageButton imageButton43 = findViewById(R.id.imageButton43); //boat
        // imageButton43.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this,R.raw.boat);
        imageButton43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });

        ImageButton imageButton44 = findViewById(R.id.imageButton44); //bus
        // imageButton44.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this,R.raw.bus);
        imageButton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });

        ImageButton imageButton45 = findViewById(R.id.imageButton45); //motorbike
        // imageButton45.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this,R.raw.motorbike);
        imageButton45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });

        ImageButton imageButton47 = findViewById(R.id.imageButton47); //bunny
        //  imageButton47.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this,R.raw.bunny);
        imageButton47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });

        ImageButton imageButton48 = findViewById(R.id.imageButton48); //skiing
        //  imageButton48.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this,R.raw.skiing);
        imageButton48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });

        ImageButton imageButton49 = findViewById(R.id.imageButton49); //walking
        //  imageButton49.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer26 = MediaPlayer.create(this,R.raw.walking);
        imageButton49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
            }
        });

        ImageButton imageButton50 = findViewById(R.id.imageButton50); //running
        // imageButton50.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer27 = MediaPlayer.create(this,R.raw.walking);
        imageButton50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });

        ImageButton imageButton51 = findViewById(R.id.imageButton51); //train
        // imageButton51.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer28 = MediaPlayer.create(this,R.raw.train);
        imageButton51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });

        ImageButton imageButton52 = findViewById(R.id.imageButton52); //car
        //  imageButton52.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer29 = MediaPlayer.create(this,R.raw.car);
        imageButton52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
            }
        });

        ImageButton imageButton53 = findViewById(R.id.imageButton53); //happy
        //  imageButton53.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer30 = MediaPlayer.create(this,R.raw.happy);
        imageButton53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });

        ImageButton imageButton54 = findViewById(R.id.imageButton54); //trophies
        // imageButton54.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer31 = MediaPlayer.create(this,R.raw.trophie);
        imageButton54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer31.start();
            }
        });

        ImageButton imageButton55 = findViewById(R.id.imageButton55); //tea
        // imageButton55.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer32 = MediaPlayer.create(this,R.raw.tea);
        imageButton55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
            }
        });

        ImageButton imageButton56 = findViewById(R.id.imageButton56); //lightblub
        // imageButton56.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer33 = MediaPlayer.create(this,R.raw.lightblub);
        imageButton56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer33.start();
            }
        });

        ImageButton imageButton57 = findViewById(R.id.imageButton57); //flower
        // imageButton57.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer34 = MediaPlayer.create(this,R.raw.flower);
        imageButton57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer34.start();
            }
        });

        ImageButton imageButton58 = findViewById(R.id.imageButton58); //bird
        // imageButton58.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer35 = MediaPlayer.create(this,R.raw.bird);
        imageButton58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
            }
        });

        ImageButton imageButton59 = findViewById(R.id.imageButton59); //tree
        // imageButton59.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer36 = MediaPlayer.create(this,R.raw.tree);
        imageButton59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });

        ImageButton imageButton60 = findViewById(R.id.imageButton60); //star
        //  imageButton60.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer37 = MediaPlayer.create(this,R.raw.star);
        imageButton60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer37.start();
            }
        });

        ImageButton imageButton61 = findViewById(R.id.imageButton61); //hammer
        // imageButton61.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer38 = MediaPlayer.create(this,R.raw.hammer);
        imageButton61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer38.start();
            }
        });

        ImageButton imageButton62 = findViewById(R.id.imageButton62); //ice cream
        // imageButton62.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer39 = MediaPlayer.create(this,R.raw.icecream);
        imageButton62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer39.start();
            }
        });

        ImageButton imageButton63 = findViewById(R.id.imageButton63); //trolley
        //  imageButton63.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer40 = MediaPlayer.create(this,R.raw.trolly);
        imageButton63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });

        ImageButton imageButton64 = findViewById(R.id.imageButton64); //bell
        //  imageButton64.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer41 = MediaPlayer.create(this,R.raw.bell);
        imageButton64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer41.start();
            }
        });

        ImageButton imageButton65 = findViewById(R.id.imageButton65); //bike
        // imageButton65.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer42 = MediaPlayer.create(this,R.raw.bike);
        imageButton65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer42.start();
            }
        });

        ImageButton imageButton66 = findViewById(R.id.imageButton66); //mouse
        //  imageButton66.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer43 = MediaPlayer.create(this,R.raw.mouse);
        imageButton66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer43.start();
            }
        });



    }

    public void openSymbol_LearningActivity() {
        Intent intent = new Intent(this, Symbol_LearningActivity.class);
        startActivity(intent);
    }
    public void openSymbol_TwoActivity() {
        Intent intent = new Intent(this, Symbol_TwoActivity.class);
        startActivity(intent);
    }
}