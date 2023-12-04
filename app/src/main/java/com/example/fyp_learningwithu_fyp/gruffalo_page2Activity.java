package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page2Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page2);

        Button ra2btn2 = findViewById(R.id.ra2btn2); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page2);
        ra2btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { mediaPlayer.start();
            }
        });

        //to page 3//error
        Button topage3btn = findViewById(R.id.topage3btn);
        topage3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {opengruffalo_page3Activity();}
        });

        //to page 1
        Button topage1from2btn = findViewById(R.id.topage1from2btn);
        topage1from2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page1Activity();
            }
        });




    }
    public void opengruffalo_page1Activity() {
        Intent intent = new Intent(this, gruffalo_page1Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page3Activity() {
        Intent intent = new Intent(this, gruffalo_page3Activity.class);
        startActivity(intent);
    }
}