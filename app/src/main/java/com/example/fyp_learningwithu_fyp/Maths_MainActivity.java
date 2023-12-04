package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Maths_MainActivity extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_main);


        //add
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_AddActivity();
            }
        });
        //count
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_CountActivity();
            }
        });
        //minus
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MinusActivity();
            }
        });
        //times
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_TimesActivity();
            }
        });
        //symbol home
        ImageButton imageButton12 = findViewById(R.id.imageButton12);
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });


    }


    public void openMaths_AddActivity() {
        Intent intent = new Intent(this, Maths_AddActivity.class);
        startActivity(intent);
    }
    public void openMaths_CountActivity() {
        Intent intent = new Intent(this, Maths_CountActivity.class);
        startActivity(intent);
    }
    public void openMaths_MinusActivity() {
        Intent intent = new Intent(this, Maths_MinusActivity.class);
        startActivity(intent);
    }
    public void openMaths_TimesActivity() {
        Intent intent = new Intent(this, Maths_TimesActivity.class);
        startActivity(intent);
    }
    public void openSymbol_LearningActivity() {
        Intent intent = new Intent(this, Symbol_LearningActivity.class);
        startActivity(intent);
    }




}