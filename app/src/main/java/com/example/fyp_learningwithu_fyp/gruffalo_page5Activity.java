package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page5Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page5);

        Button ra5btn = findViewById(R.id.ra5btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page5);
        ra5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 6
        Button topage6btn = findViewById(R.id.topage6btn);
        topage6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page6Activity();
            }
        });
        //to page 1
        Button topage4from5btn = findViewById(R.id.topage4from5btn);
        topage4from5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page4Activity();
            }
        });
    }
    public void opengruffalo_page6Activity() {
        Intent intent = new Intent(this, gruffalo_page6Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page4Activity() {
        Intent intent = new Intent(this, gruffalo_page4Activity.class);
        startActivity(intent);
    }
}