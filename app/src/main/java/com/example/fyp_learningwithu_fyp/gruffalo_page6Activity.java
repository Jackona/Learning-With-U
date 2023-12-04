package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_page6Activity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_page6);

        Button ra6btn = findViewById(R.id.ra6btn); //read alone
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g_page6);
        ra6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        //to page 7
        Button topage7btn = findViewById(R.id.topage7btn);
        topage7btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page7Activity();
            }
        });
        //to page 1
        Button topage5from6btn = findViewById(R.id.topage5from6btn);
        topage5from6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page5Activity();
            }
        });




    }
    public void opengruffalo_page7Activity() {
        Intent intent = new Intent(this, gruffalo_page7Activity.class);
        startActivity(intent);
    }
    public void opengruffalo_page5Activity() {
        Intent intent = new Intent(this, gruffalo_page5Activity.class);
        startActivity(intent);
    }
}