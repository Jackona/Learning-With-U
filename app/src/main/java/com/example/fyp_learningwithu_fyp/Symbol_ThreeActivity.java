package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Symbol_ThreeActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol_three);



        //home
        ImageButton tothehomepagefrom3btn = findViewById(R.id.tothehomepagefrom3btn);
        tothehomepagefrom3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });
        //next page to s4
        Button topage4btn = findViewById(R.id.topage4btn);
        topage4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_FourActivity();
            }
        });
        //back to s2
        Button backto2btn = findViewById(R.id.backto2btn);
        backto2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_TwoActivity();
            }
        });



        ImageButton hello29btn = findViewById(R.id.hello29btn); //hello
        //  imageButton29.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audio_hello);
        hello29btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton goodbye23btn = findViewById(R.id.goodbye23btn); //Goodbye
        //  imageButton23.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.audio_goodbye);
        goodbye23btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        ImageButton howareyou24btn = findViewById(R.id.howareyou24btn); //how are you
        // imageButton24.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.audio_howareyou);
        howareyou24btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        ImageButton thankyou25btn = findViewById(R.id.thankyou25btn); //thank you
        // imageButton25.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.audio_thankyou);
        thankyou25btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        ImageButton worry26btn = findViewById(R.id.worry26btn); //im worried
        // imageButton26.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.audio_imworried);
        worry26btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        ImageButton imthinking27btn = findViewById(R.id.imthinking27btn); //im thinking
        // imageButton27.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.audio_imthinking);
        imthinking27btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        ImageButton ihavealotonmymind28btn = findViewById(R.id.ihavealotonmymind28btn); //i have a lot on my mind
        // imageButton28.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.audio_ihavealotonmymind);
        ihavealotonmymind28btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        ImageButton imsad30btn = findViewById(R.id.imsad30btn); //im sad
        // imageButton30.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.audio_imsad);
        imsad30btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        ImageButton imill31btn = findViewById(R.id.imill31btn); //im ill
        //  imageButton31.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.audio_imill);
        imill31btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        ImageButton imtooembarrassed32btn = findViewById(R.id.imtooembarrassed32btn); //I'm too embarrassed
        // imageButton32.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.auido_imtooembarrassed);
        imtooembarrassed32btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        ImageButton imsorry33btn = findViewById(R.id.imsorry33btn); //im sorry
        // imageButton33.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.audio_imsorry);
        imsorry33btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        ImageButton itssnowing34btn = findViewById(R.id.itssnowing34btn); //its snowing
        // imageButton34.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.audio_itssnowing);
        itssnowing34btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        ImageButton itsraining35btn = findViewById(R.id.itsraining35btn); //its raining
        // imageButton35.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.audio_itsraining);
        itsraining35btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });

        ImageButton itsunny36btn = findViewById(R.id.itsunny36btn); //its sunny
        // imageButton36.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this, R.raw.audio_itssunny);
        itsunny36btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });

        ImageButton sorrywhat37btn = findViewById(R.id.sorrywhat37btn); //sorrywhat
        // imageButton37.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this, R.raw.audio_sorrywhat);
        sorrywhat37btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });

        ImageButton imhappy38btn = findViewById(R.id.imhappy38btn); //im happy
        // imageButton38.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.audio_imhappy);
        imhappy38btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });

        ImageButton imfinished39btn = findViewById(R.id.imfinished39btn); //im finished
        // imageButton39.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.audio_imfinished);
        imfinished39btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });

        ImageButton imbored40btn = findViewById(R.id.imbored40btn); //im bored
        // imageButton40.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this, R.raw.audio_imbored);
        imbored40btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });

        ImageButton goingtoplayfootball41btn = findViewById(R.id.goingtoplayfootball41btn); //going to play football
        //  imageButton41.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.audio_goingtoplayfootball);
        goingtoplayfootball41btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

        ImageButton goingtoplaybasketball42btn = findViewById(R.id.goingtoplaybasketball42btn); //going to play basketball
        //  imageButton42.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this, R.raw.audio_goingtoplaybasketball);
        goingtoplaybasketball42btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });



        ImageButton imhungry43btn = findViewById(R.id.imhungry43btn); //im hungry
        // imageButton43.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this, R.raw.audio_imhungry);
        imhungry43btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });

        ImageButton cantwaittosing44btn = findViewById(R.id.cantwaittosing44btn); // cant wait to sing
        // imageButton44.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this, R.raw.audio_cantwaittosing);
        cantwaittosing44btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });

        ImageButton howmuch45btn = findViewById(R.id.howmuch45btn); //how much
        // imageButton45.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this, R.raw.audio_howmuch);
        howmuch45btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });

        ImageButton highfive46btn = findViewById(R.id.highfive46btn); //high five
        // imageButton46.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.audio_highfive);
        highfive46btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });

        ImageButton happybirthday47btn = findViewById(R.id.happybirthday47btn); //happy birthday
        // imageButton47.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.audio_happybirthday);
        happybirthday47btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });

        ImageButton mustbesilent48btn = findViewById(R.id.mustbesilent48btn); //must be silent
        //  imageButton48.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this, R.raw.audio_mustbesilent);
        mustbesilent48btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });

        ImageButton justlookingforsomething49btn = findViewById(R.id.justlookingforsomething49btn); //just looking for something
        // imageButton49.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer26 = MediaPlayer.create(this, R.raw.audio_justlookingforsomething);
        justlookingforsomething49btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
            }
        });

        ImageButton Ineedtostretch50btn = findViewById(R.id.Ineedtostretch50btn); //I need to stretch
        //  imageButton50.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer27 = MediaPlayer.create(this, R.raw.audio_ineedtostretch);
        Ineedtostretch50btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });

        ImageButton Ilovetodance51btn = findViewById(R.id.Ilovetodance51btn); //I love to dance
        //  imageButton51.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer28 = MediaPlayer.create(this, R.raw.audio_ilovetodance);
        Ilovetodance51btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });

        ImageButton ihavelostmytooth52btn = findViewById(R.id.ihavelostmytooth52btn); //i have lost my tooth
        //  imageButton52.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer29 = MediaPlayer.create(this, R.raw.audio_ihavelostmytooth);
        ihavelostmytooth52btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
            }
        });

        ImageButton sodoi53btn = findViewById(R.id.sodoi53btn); //so do i
        // imageButton53.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer30 = MediaPlayer.create(this, R.raw.audio_sodoi);
        sodoi53btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });

        ImageButton timeforbed54btn = findViewById(R.id.timeforbed54btn); //time for bed
        //  imageButton54.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer31 = MediaPlayer.create(this, R.raw.audio_timeforbed);
        timeforbed54btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer31.start();
            }
        });

        ImageButton timeforschool55btn = findViewById(R.id.timeforschool55btn); //time for school
        //  imageButton55.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer32 = MediaPlayer.create(this, R.raw.audio_timeforschool);
        timeforschool55btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
            }
        });

        ImageButton timetoexercise56btn = findViewById(R.id.timetoexercise56btn); //time to exercise
        // imageButton56.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer33 = MediaPlayer.create(this, R.raw.audio_timetoexercise);
        timetoexercise56btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer33.start();
            }
        });

        ImageButton timetolearn57btn = findViewById(R.id.timetolearn57btn); //time to learn
        //  imageButton57.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer34 = MediaPlayer.create(this, R.raw.audio_timetolearn);
        timetolearn57btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer34.start();
            }
        });

        ImageButton toeat58btn = findViewById(R.id.toeat58btn); //to eat
        // imageButton58.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer35 = MediaPlayer.create(this, R.raw.audio_toeat);
        toeat58btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
            }
        });

        ImageButton whatamilearningtoday59btn = findViewById(R.id.whatamilearningtoday59btn); //what am i learning today
        //  imageButton59.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer36 = MediaPlayer.create(this, R.raw.audio_whatamilearningtoday);
        whatamilearningtoday59btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });

        ImageButton whatdayoftheweekisit60btn = findViewById(R.id.whatdayoftheweekisit60btn); //what day of the week is it
        //  imageButton60.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer37 = MediaPlayer.create(this, R.raw.audio_whatdayoftheweekisit);
        whatdayoftheweekisit60btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer37.start();
            }
        });

        ImageButton whatdoyouhave61btn = findViewById(R.id.whatdoyouhave61btn); //what do you have
        //  imageButton61.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer38 = MediaPlayer.create(this, R.raw.audio_whatdoyouhave);
        whatdoyouhave61btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer38.start();
            }
        });

        ImageButton whatisthat62btn = findViewById(R.id.whatisthat62btn); //what is that
        //  imageButton62.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer39 = MediaPlayer.create(this, R.raw.audio_whatisthat);
        whatisthat62btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer39.start();
            }
        });

        ImageButton whatsthetime63btn = findViewById(R.id.whatsthetime63btn); //whats the time
        // imageButton63.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer40 = MediaPlayer.create(this, R.raw.audio_whatsthetime);
        whatsthetime63btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });

        ImageButton whatsyourname64btn = findViewById(R.id.whatsyourname64btn); //whats your name
        // imageButton64.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer41 = MediaPlayer.create(this, R.raw.audio_whatsyourname);
        whatsyourname64btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer41.start();
            }
        });

        ImageButton wherearemyshoes65btn = findViewById(R.id.wherearemyshoes65btn); //where are my shoes
        //  imageButton65.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer42 = MediaPlayer.create(this, R.raw.audio_wherearemyshoes);
        wherearemyshoes65btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer42.start();
            }
        });

        ImageButton youarefantastic66btn = findViewById(R.id.youarefantastic66btn); //you are fantastic
        //  imageButton66.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer43 = MediaPlayer.create(this, R.raw.audio_yourefantastic);
        youarefantastic66btn.setOnClickListener(new View.OnClickListener() {
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

    public void openSymbol_FourActivity() {
        Intent intent = new Intent(this, Symbol_FourActivity.class);
        startActivity(intent);
    }
    public void openSymbol_TwoActivity() {
        Intent intent = new Intent(this, Symbol_TwoActivity.class);
        startActivity(intent);
    }
}
