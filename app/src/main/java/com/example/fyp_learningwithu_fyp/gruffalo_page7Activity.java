package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page7Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page7);

        Button ra7btn = findViewById(R.id.ra7btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page7);
        ra7btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 8
        Button topage8btn = findViewById(R.id.topage8btn);
        topage8btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page8Activity();
            }
        });
        //to page 6
        Button topage6from7btn = findViewById(R.id.topage6from7btn);
        topage6from7btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page6Activity();
            }
        });

    }
    public void opengruffalo_page8Activity() {
        Intent intent = new Intent(this, gruffalo_page8Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page6Activity() {
        Intent intent = new Intent(this, gruffalo_page6Activity.class);
        startActivity(intent);
    }
}