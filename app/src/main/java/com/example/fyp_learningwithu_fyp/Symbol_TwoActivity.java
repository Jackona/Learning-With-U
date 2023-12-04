package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Symbol_TwoActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol_two);



        //home
        ImageButton imageButton19 = findViewById(R.id.imageButton19);
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });
        //next page to s3 //openSymbol_ThreeActivity
        Button topagethreebtn = findViewById(R.id.topagethreebtn);
        topagethreebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_ThreeActivity();
            }
        });
        //back to s1
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_MainActivity();
            }
        });



        ImageButton imageButton20 = findViewById(R.id.imageButton20); //hook
        // imageButton20.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.hook);
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imageButton21 = findViewById(R.id.imageButton21); //screen
        //  imageButton21.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.screen);
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        ImageButton imageButton67 = findViewById(R.id.imageButton67); //mountain
        //  imageButton67.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.mountain);
        imageButton67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        ImageButton imageButton68 = findViewById(R.id.imageButton68); //piano
        //  imageButton68.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.piano);
        imageButton68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        ImageButton imageButton78 = findViewById(R.id.imageButton78); //swimming
        // imageButton78.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.scale);
        imageButton78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        ImageButton imageButton77 = findViewById(R.id.imageButton77); //printer
        // imageButton77.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.printer);
        imageButton77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        ImageButton imageButton76 = findViewById(R.id.imageButton76); //!
        // imageButton76.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.exclamationmark);
        imageButton76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        ImageButton imageButton72 = findViewById(R.id.imageButton72); //?
        //  imageButton72.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.questionmark);
        imageButton72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        ImageButton imageButton74 = findViewById(R.id.imageButton74); //confused
        // imageButton74.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.confused);
        imageButton74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        ImageButton imageButton69 = findViewById(R.id.imageButton69); //earth
        //  imageButton69.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.earth);
        imageButton69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        ImageButton imageButton70 = findViewById(R.id.imageButton70); //pin
        //  imageButton70.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.pin);
        imageButton70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        ImageButton imageButton71 = findViewById(R.id.imageButton71); //recycle
        // imageButton71.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.recycle);
        imageButton71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        ImageButton imageButton75 = findViewById(R.id.imageButton75); //refresh
        // imageButton75.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.refresh);
        imageButton75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });

        ImageButton imageButton73 = findViewById(R.id.imageButton73); //radio
        //  imageButton73.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this, R.raw.radio);
        imageButton73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });

        ImageButton imageButton79 = findViewById(R.id.imageButton79); //eye
        //   imageButton79.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this, R.raw.eye);
        imageButton79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });

        ImageButton imageButton80 = findViewById(R.id.imageButton80); //power cable
        //  imageButton80.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.powercable);
        imageButton80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });

        ImageButton imageButton81 = findViewById(R.id.imageButton81); //stop
        // imageButton81.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.stop);
        imageButton81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });

        ImageButton imageButton82 = findViewById(R.id.imageButton82); //warning
        //  imageButton82.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this, R.raw.warning);
        imageButton82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });

        ImageButton imageButton83 = findViewById(R.id.imageButton83); //knife and fork
        // imageButton83.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.knifeandfork);
        imageButton83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

        ImageButton imageButton88 = findViewById(R.id.imageButton88); //rocket
        // imageButton88.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this, R.raw.rocket);
        imageButton88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });

        ImageButton imageButton84 = findViewById(R.id.imageButton84); //rollerskating
        //  imageButton84.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.rollerskating);
        imageButton84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });

        ImageButton imageButton87 = findViewById(R.id.imageButton87); //rowing
        // imageButton87.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this, R.raw.rowing);
        imageButton87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });

        ImageButton imageButton85 = findViewById(R.id.imageButton85); //rules
        //  imageButton85.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this, R.raw.rules);
        imageButton85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });

        ImageButton imageButton86 = findViewById(R.id.imageButton86); //sailing
        //  imageButton86.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this, R.raw.sailing);
        imageButton86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });

        ImageButton imageButton93 = findViewById(R.id.imageButton93); //save
        //  imageButton93.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.save);
        imageButton93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });

        ImageButton imageButton92 = findViewById(R.id.imageButton92); //school
        // imageButton92.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this, R.raw.school);
        imageButton92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });

        ImageButton imageButton91 = findViewById(R.id.imageButton91); //pig
        // imageButton91.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer26 = MediaPlayer.create(this, R.raw.pig);
        imageButton91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
            }
        });

        ImageButton imageButton90 = findViewById(R.id.imageButton90); //science
        // imageButton90.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer27 = MediaPlayer.create(this, R.raw.science);
        imageButton90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });

        ImageButton imageButton89 = findViewById(R.id.imageButton89); //search
        // imageButton89.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer28 = MediaPlayer.create(this, R.raw.search);
        imageButton89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });

        ImageButton imageButton94 = findViewById(R.id.imageButton94); //diving
        // imageButton94.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer29 = MediaPlayer.create(this, R.raw.diving);
        imageButton94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
            }
        });

        ImageButton imageButton95 = findViewById(R.id.imageButton95); //shield
        // imageButton95.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer31 = MediaPlayer.create(this, R.raw.shield);
        imageButton95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer31.start();
            }
        });

        ImageButton imageButton96 = findViewById(R.id.imageButton96); //meditate
        // imageButton96.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer32 = MediaPlayer.create(this, R.raw.meditate);
        imageButton96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
            }
        });

        ImageButton imageButton97 = findViewById(R.id.imageButton97); //sell
        // imageButton97.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer34 = MediaPlayer.create(this, R.raw.sell);
        imageButton97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer34.start();
            }
        });

        ImageButton imageButton98 = findViewById(R.id.imageButton98); //send
        //  imageButton98.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer35 = MediaPlayer.create(this, R.raw.send);
        imageButton98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
            }
        });

        ImageButton imageButton99 = findViewById(R.id.imageButton99); //sad
        //   imageButton99.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer36 = MediaPlayer.create(this, R.raw.sad);
        imageButton99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });

        ImageButton imageButton100 = findViewById(R.id.imageButton100); //fish
        // imageButton100.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer37 = MediaPlayer.create(this, R.raw.fish);
        imageButton100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer37.start();
            }
        });

        ImageButton imageButton101 = findViewById(R.id.imageButton101); //microphone
        //  imageButton101.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer38 = MediaPlayer.create(this, R.raw.microphone);
        imageButton101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer38.start();
            }
        });

        ImageButton imageButton102 = findViewById(R.id.imageButton102); //snow
        //  imageButton102.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer39 = MediaPlayer.create(this, R.raw.snow);
        imageButton102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer39.start();
            }
        });

        ImageButton imageButton103 = findViewById(R.id.imageButton103); //share
        //  imageButton103.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer40 = MediaPlayer.create(this, R.raw.share);
        imageButton103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });

        ImageButton imageButton104 = findViewById(R.id.imageButton104); //shower
        //  imageButton104.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer41 = MediaPlayer.create(this, R.raw.shower);
        imageButton104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer41.start();
            }
        });

        ImageButton imageButton105 = findViewById(R.id.imageButton105); //sick
        //  imageButton105.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer42 = MediaPlayer.create(this, R.raw.sick);
        imageButton105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer42.start();
            }
        });

        ImageButton imageButton106 = findViewById(R.id.imageButton106); //skateboarding
        // imageButton106.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer43 = MediaPlayer.create(this, R.raw.skateboarding);
        imageButton106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer43.start();
            }
        });

        ImageButton imageButton107 = findViewById(R.id.imageButton107); //basketball
        //  imageButton107.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer44 = MediaPlayer.create(this, R.raw.basketball);
        imageButton107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer44.start();
            }
        });


    }

    public void openSymbol_LearningActivity() {
        Intent intent = new Intent(this, Symbol_LearningActivity.class);
        startActivity(intent);
    }

    public void openSymbol_ThreeActivity() {
        Intent intent = new Intent(this, Symbol_ThreeActivity.class);
        startActivity(intent);
    }

    public void openSymbol_MainActivity() {
        Intent intent = new Intent(this, Symbol_MainActivity.class);
        startActivity(intent);
    }
    public void openSymbol_FourActivity() {
        Intent intent = new Intent(this, Symbol_FourActivity.class);
        startActivity(intent);
    }

}

