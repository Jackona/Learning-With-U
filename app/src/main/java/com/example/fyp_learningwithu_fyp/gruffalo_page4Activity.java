package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page4Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page4);

        Button ra4btn = findViewById(R.id.ra4btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page4);
        ra4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 5
        Button topage5btn = findViewById(R.id.topage5btn);
        topage5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page5Activity();
            }
        });
        //to page 1
        Button topage3from5btn = findViewById(R.id.topage3from5btn);
        topage3from5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page3Activity();
            }
        });


    }
    public void opengruffalo_page5Activity() {
        Intent intent = new Intent(this, gruffalo_page5Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page3Activity() {
        Intent intent = new Intent(this, gruffalo_page3Activity.class);
        startActivity(intent);
    }
}