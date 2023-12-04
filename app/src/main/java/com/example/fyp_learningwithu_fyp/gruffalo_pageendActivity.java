package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_pageendActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_pageend);

        //reading
        Button toengloshhomebtn = findViewById(R.id.toengloshhomebtn);
        toengloshhomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });
        //to page 1
        Button readagain = findViewById(R.id.readagain);
        readagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_mianActivity();
            }
        });


    }
    public void openEnglish_ReadingActivity() {
        Intent intent = new Intent(this, English_ReadingActivity.class);
        startActivity(intent);
    }
    public void opengruffalo_mianActivity() {
        Intent intent = new Intent(this, gruffalo_mianActivity.class);
        startActivity(intent);
    }
}