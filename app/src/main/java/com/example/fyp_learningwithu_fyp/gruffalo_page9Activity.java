package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page9Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page9);

        Button ra9btn = findViewById(R.id.ra9btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page9);
        ra9btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 9
        Button topage10btn = findViewById(R.id.topage10btn);
        topage10btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page10Activity();
            }
        });
        //to page 1
        Button topage8from9btn = findViewById(R.id.topage8from9btn);
        topage8from9btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page8Activity();
            }
        });
    }
    public void opengruffalo_page10Activity() {
        Intent intent = new Intent(this, gruffalo_page10Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page8Activity() {
        Intent intent = new Intent(this, gruffalo_page8Activity.class);
        startActivity(intent);
    }
}