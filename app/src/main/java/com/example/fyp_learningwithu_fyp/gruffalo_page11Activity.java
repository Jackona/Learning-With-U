package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page11Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page11);

        Button ra11btn = findViewById(R.id.ra11btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page11);
        ra11btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 12
        Button topage12btn = findViewById(R.id.topage12btn);
        topage12btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page12Activity();
            }
        });
        //to page 1
        Button topage10from11btn = findViewById(R.id.topage10from11btn);
        topage10from11btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page10Activity();
            }
        });


    }
    public void opengruffalo_page12Activity() {
        Intent intent = new Intent(this, gruffalo_page12Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page10Activity() {
        Intent intent = new Intent(this, gruffalo_page10Activity.class);
        startActivity(intent);
    }
}