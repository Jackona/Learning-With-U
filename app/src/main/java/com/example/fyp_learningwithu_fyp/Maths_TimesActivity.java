package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Maths_TimesActivity extends AppCompatActivity {

     private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_times);

        //mathhome
        ImageButton imageButton16 = findViewById(R.id.imageButton16);
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });
        //1
        ImageButton imageButton184 = findViewById(R.id.imageButton184);
        imageButton184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_OneActivity();
            }
        });
        //2
        ImageButton imageButton185 = findViewById(R.id.imageButton185);
        imageButton185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_TwoActivity();
            }
        });
        //3
        ImageButton imageButton186 = findViewById(R.id.imageButton186);
        imageButton186.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_ThreeActivity();
            }
        });
        //4
        ImageButton imageButton187 = findViewById(R.id.imageButton187);
        imageButton187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FourActivity();
            }
        });
        //5
        ImageButton imageButton188 = findViewById(R.id.imageButton188);
        imageButton188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimes_FiveActivity();
            }
        });

    }

    public void openMaths_MainActivity() {
        Intent intent = new Intent(this, Maths_MainActivity.class);
        startActivity(intent);
    }
    public void openTimes_OneActivity() {
        Intent intent = new Intent(this, Times_OneActivity.class);
        startActivity(intent);
    }
    public void openTimes_TwoActivity() {
        Intent intent = new Intent(this, Times_TwoActivity.class);
        startActivity(intent);
    }
    public void openTimes_ThreeActivity() {
        Intent intent = new Intent(this, Times_ThreeActivity.class);
        startActivity(intent);
    }
    public void openTimes_FourActivity() {
        Intent intent = new Intent(this, Times_FourActivity.class);
        startActivity(intent);
    }
    public void openTimes_FiveActivity() {
        Intent intent = new Intent(this, Times_FiveActivity.class);
        startActivity(intent);
    }
}