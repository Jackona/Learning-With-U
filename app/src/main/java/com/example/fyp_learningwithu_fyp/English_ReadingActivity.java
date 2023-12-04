package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class English_ReadingActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_reading);


        //englishhome
        ImageButton imageButton18 = findViewById(R.id.imageButton18);
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_MainActivity();
            }
        });
        //gruffalo main page
        Button twothegbtn = findViewById(R.id.twothegbtn);
        twothegbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_mianActivity();
            }
        });
        //rim jigsaw
        Button rimjigsaw = findViewById(R.id.rimjigsaw);
        rimjigsaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRim_JigsawActivity();
            }
        });



    }

    public void openEnglish_MainActivity() {
        Intent intent = new Intent(this, English_MainActivity.class);
        startActivity(intent);
    }
    public void opengruffalo_mianActivity() {
        Intent intent = new Intent(this, gruffalo_mianActivity.class);
        startActivity(intent);
    }
    public void openRim_JigsawActivity() {
        Intent intent = new Intent(this, Rim_JigsawActivity.class);
        startActivity(intent);
    }
}