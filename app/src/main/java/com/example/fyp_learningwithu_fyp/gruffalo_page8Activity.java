package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page8Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page8);

        Button ra8btn = findViewById(R.id.ra8btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page8);
        ra8btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 9
        Button topage9btn = findViewById(R.id.topage9btn);
        topage9btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page9Activity();
            }
        });
        //to page 1
        Button topage7from8btn = findViewById(R.id.topage7from8btn);
        topage7from8btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page7Activity();
            }
        });
    }
    public void opengruffalo_page9Activity() {
        Intent intent = new Intent(this, gruffalo_page9Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page7Activity() {
        Intent intent = new Intent(this, gruffalo_page7Activity.class);
        startActivity(intent);
    }
}