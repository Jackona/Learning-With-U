package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Symbol_FourActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol_four);

        //home
        ImageButton homefrom4btn = findViewById(R.id.homefrom4btn);
        homefrom4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });
        //back to s3
        Button fourtothreebtn = findViewById(R.id.fourtothreebtn);
        fourtothreebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_ThreeActivity();
            }
        });


        ImageButton youhavegrown29btn = findViewById(R.id.youhavegrown29btn); //you have grown
       // imageButton29.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audio_youhavegrown);
        youhavegrown29btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        ImageButton imthirsty23btn = findViewById(R.id.imthirsty23btn); //im thirsty
       // imageButton23.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.audio_imthirsty);
        imthirsty23btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        ImageButton welldoneapplause24btn = findViewById(R.id.welldoneapplause24btn); //welldone AND applause
       // imageButton24.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.audio_welldone);
        welldoneapplause24btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        ImageButton nothankyou25btn = findViewById(R.id.nothankyou25btn); //no thank you
       // imageButton25.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.audio_nothankyou);
        nothankyou25btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        ImageButton maypeacebewithyou26btn = findViewById(R.id.maypeacebewithyou26btn); //may peace be with you
       // imageButton26.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.audio_maypeacebewithyou);
        maypeacebewithyou26btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        ImageButton needtostaycalm27btn = findViewById(R.id.needtostaycalm27btn); //need to stay calm
      //  imageButton27.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.audio_needtostaycalm);
        needtostaycalm27btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        ImageButton whatsontv28btn = findViewById(R.id.whatsontv28btn); //whats on tv
      //  imageButton28.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.audio_whatsontv);
        whatsontv28btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        ImageButton imsurprised30btn = findViewById(R.id.imsurprised30btn); //im surprised
       // imageButton30.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.audio_imsurprised);
        imsurprised30btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        ImageButton needthebathroom31btn = findViewById(R.id.needthebathroom31btn); //need the bathroom
       // imageButton31.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.audio_bathroom);
        needthebathroom31btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        ImageButton imconfused32btn = findViewById(R.id.imconfused32btn); //im confused
        //imageButton32.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.audio_confused);
        imconfused32btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        ImageButton feelingdizzy33btn = findViewById(R.id.feelingdizzy33btn); //feeling dizzy
      //  imageButton33.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.audio_dizzy);
        feelingdizzy33btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        ImageButton iwish34btn = findViewById(R.id.iwish34btn); //i wish
       // imageButton34.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.audio_wish);
        iwish34btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        ImageButton wherewegoing35btn = findViewById(R.id.wherewegoing35btn); //where we going
       // imageButton35.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.audo_wherearewegoing);
        wherewegoing35btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });

        ImageButton pickupthephone36btn = findViewById(R.id.pickupthephone36btn); //pick up the phone
      //  imageButton36.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this, R.raw.audio_pickupthephone);
        pickupthephone36btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });

        ImageButton dothedab37btn = findViewById(R.id.dothedab37btn); //do the dab
       // imageButton37.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this, R.raw.audio_dab);
        dothedab37btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });

        ImageButton isitworthit38btn = findViewById(R.id.isitworthit38btn); //is it worth it
       // imageButton38.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.audio_worthit);
        isitworthit38btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });

        ImageButton timetogohome39btn = findViewById(R.id.timetogohome39btn); //time to go home
       // imageButton39.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.audio_timetogohome);
        timetogohome39btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });

        ImageButton lookatthis40btn = findViewById(R.id.lookatthis40btn); //look at this
       // imageButton40.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this, R.raw.audio_lookatthis);
        lookatthis40btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });

        ImageButton timetopray41btn = findViewById(R.id.timetopray41btn); //time to pray
       // imageButton41.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.audio_prayer);
        timetopray41btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

        ImageButton caniplaywithafriend42btn = findViewById(R.id.caniplaywithafriend42btn); //can i play with a friend
       // imageButton42.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this, R.raw.audio_friends);
        caniplaywithafriend42btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });



        ImageButton whosatthedoor43btn = findViewById(R.id.whosatthedoor43btn); //whos at the door
      //  imageButton43.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this, R.raw.audio_whosatdoor);
        whosatthedoor43btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });

        ImageButton iwanttobealone44btn = findViewById(R.id.iwanttobealone44btn); //i want to be alone
       // imageButton44.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this, R.raw.audio_alone);
        iwanttobealone44btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });

        ImageButton doorisclosed45btn = findViewById(R.id.doorisclosed45btn); //door is closed
       // imageButton45.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this, R.raw.audio_doorclosed);
        doorisclosed45btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });

        ImageButton doorisopen46btn = findViewById(R.id.doorisopen46btn); //door is open
        // imageButton46.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.audio_dooropen);
        doorisopen46btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });

        ImageButton whatseasonisit47btn = findViewById(R.id.whatseasonisit47btn); //what season is it
       // imageButton47.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.audio_season);
        whatseasonisit47btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });

        ImageButton itsgettinghot48btn = findViewById(R.id.itsgettinghot48btn); //its getting hot
       // imageButton48.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this, R.raw.audio_hot);
        itsgettinghot48btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });

        ImageButton iloveyou49btn = findViewById(R.id.iloveyou49btn); //i love you
      //  imageButton49.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer26 = MediaPlayer.create(this, R.raw.audio_loveyou);
        iloveyou49btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
            }
        });

        ImageButton whenweleaving50btn = findViewById(R.id.whenweleaving50btn); //when we leaving
      //  imageButton50.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer27 = MediaPlayer.create(this, R.raw.audio_leaving);
        whenweleaving50btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });

        ImageButton itstooquite51btn = findViewById(R.id.itstooquite51btn); //its too quite
      //  imageButton51.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer28 = MediaPlayer.create(this, R.raw.audio_quiet);
        itstooquite51btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });

        ImageButton itstooloud52btn = findViewById(R.id.itstooloud52btn); //its too loud
      //  imageButton52.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer29 = MediaPlayer.create(this, R.raw.audio_loud);
        itstooloud52btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
            }
        });

        ImageButton itsgettingcold53btn = findViewById(R.id.itsgettingcold53btn); //its getting cold
       // imageButton53.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer30 = MediaPlayer.create(this, R.raw.audio_cold);
        itsgettingcold53btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });

        ImageButton acupofteawouldbenice54btn = findViewById(R.id.acupofteawouldbenice54btn); //a cup of tea would be nice
       // imageButton54.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer31 = MediaPlayer.create(this, R.raw.audio_cupoftea);
        acupofteawouldbenice54btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer31.start();
            }
        });

        ImageButton acupofhotchocolatewouldbenice55btn = findViewById(R.id.acupofhotchocolatewouldbenice55btn); //a cup of hot chocolate would be nice
       // imageButton55.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer32 = MediaPlayer.create(this, R.raw.audio_hotchoc);
        acupofhotchocolatewouldbenice55btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
            }
        });

        ImageButton acupofcoffewouldbenice56btn = findViewById(R.id.acupofcoffewouldbenice56btn); //a cup of coffe would be nice
       // imageButton56.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer33 = MediaPlayer.create(this, R.raw.audio_cupofcoffee);
        acupofcoffewouldbenice56btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer33.start();
            }
        });

        ImageButton imsweating57btn = findViewById(R.id.imsweating57btn); //im sweating
        // imageButton57.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer34 = MediaPlayer.create(this, R.raw.audio_sweat);
        imsweating57btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer34.start();
            }
        });

        ImageButton thisisforyou58btn = findViewById(R.id.thisisforyou58btn); //this is for you
        // imageButton58.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer35 = MediaPlayer.create(this, R.raw.audio_thisisforyou);
        thisisforyou58btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
            }
        });

        ImageButton imscared59btn = findViewById(R.id.imscared59btn); //im scared
        // imageButton59.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer36 = MediaPlayer.create(this, R.raw.audio_scared);
        imscared59btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });

        ImageButton thestarsarebeautiful60btn = findViewById(R.id.thestarsarebeautiful60btn); //the stars are beautiful
        // imageButton60.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer37 = MediaPlayer.create(this, R.raw.audio_stars);
        thestarsarebeautiful60btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer37.start();
            }
        });

        ImageButton themoonisbright61btn = findViewById(R.id.themoonisbright61btn); //the moon is bright
        // imageButton61.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer38 = MediaPlayer.create(this, R.raw.audio_moonisbright);
        themoonisbright61btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer38.start();
            }
        });

        ImageButton showertime62btn = findViewById(R.id.showertime62btn); //shower time
        //  imageButton62.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer39 = MediaPlayer.create(this, R.raw.audio_showertimr);
        showertime62btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer39.start();
            }
        });

        ImageButton cleaningtime63btn = findViewById(R.id.cleaningtime63btn); //cleaning time
        // imageButton63.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer40 = MediaPlayer.create(this, R.raw.audio_cleaningtime);
        cleaningtime63btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });

        ImageButton timetobrustheteeth64btn = findViewById(R.id.timetobrustheteeth64btn); //time to brush the teeth
        // imageButton64.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer41 = MediaPlayer.create(this, R.raw.audio_brush);
        timetobrustheteeth64btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer41.start();
            }
        });

        ImageButton imconcerned65btn = findViewById(R.id.imconcerned65btn); //im concerned
        // imageButton65.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer42 = MediaPlayer.create(this, R.raw.audio_concerned);
        imconcerned65btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer42.start();
            }
        });

        ImageButton whatstheweatherlike66btn = findViewById(R.id.whatstheweatherlike66btn); //whats the weather like
        // imageButton66.setOnClickListener((View.OnClickListener) this);
        final MediaPlayer mediaPlayer43 = MediaPlayer.create(this, R.raw.audio_weatherlike);
        whatstheweatherlike66btn.setOnClickListener(new View.OnClickListener() {
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

    public void openSymbol_ThreeActivity() {
        Intent intent = new Intent(this, Symbol_ThreeActivity.class);
        startActivity(intent);
    }

}
