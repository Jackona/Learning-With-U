package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gruffalo_page12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page12);

        Button ra12btn = findViewById(R.id.ra12btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page12);
        ra12btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 12
        Button topageendbtn = findViewById(R.id.topageendbtn);
        topageendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_pageendActivity();
            }
        });
        //to page 1
        Button topage11from12btn = findViewById(R.id.topage11from12btn);
        topage11from12btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page11Activity();
            }
        });
    }
    public void opengruffalo_pageendActivity() {
        Intent intent = new Intent(this, gruffalo_pageendActivity.class);
        startActivity(intent);
    }
    public void opengruffalo_page11Activity() {
        Intent intent = new Intent(this, gruffalo_page11Activity.class);
        startActivity(intent);
    }
}