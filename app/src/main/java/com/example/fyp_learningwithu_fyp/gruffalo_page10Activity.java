package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page10Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page10);

        Button ra10btn = findViewById(R.id.ra10btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page10);
        ra10btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 11
        Button topage11btn = findViewById(R.id.topage11btn);
        topage11btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page11Activity();
            }
        });
        //to page 1
        Button topage9from10btn = findViewById(R.id.topage9from10btn);
        topage9from10btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page9Activity();
            }
        });
    }
    public void opengruffalo_page11Activity() {
        Intent intent = new Intent(this, gruffalo_page11Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page9Activity() {
        Intent intent = new Intent(this, gruffalo_page9Activity.class);
        startActivity(intent);
    }
}