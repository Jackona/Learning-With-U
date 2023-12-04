package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page3Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page3);


        Button ra3btn = findViewById(R.id.ra3btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page3);
        ra3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 4
        Button topage4btn = findViewById(R.id.topage4btn);
        topage4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page4Activity();
            }
        });
        //to page 1
        Button topage2from3btn = findViewById(R.id.topage2from3btn);
        topage2from3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page2Activity();
            }
        });


    }
    public void opengruffalo_page4Activity() {
        Intent intent = new Intent(this, gruffalo_page4Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page2Activity() {
        Intent intent = new Intent(this, gruffalo_page2Activity.class);
        startActivity(intent);
    }
}