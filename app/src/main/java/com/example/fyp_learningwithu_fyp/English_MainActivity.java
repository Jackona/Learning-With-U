package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class English_MainActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_main);



        //home
        ImageButton imageButton10 = findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });
        //Alphabet
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_AlphabetActivity();
            }
        });
        //Reading
        ImageButton toreadingbtn = findViewById(R.id.toreadingbtn);
        toreadingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_ReadingActivity();
            }
        });

    }

    public void openSymbol_LearningActivity() {
        Intent intent = new Intent(this, Symbol_LearningActivity.class);
        startActivity(intent);
    }
    public void openEnglish_AlphabetActivity() {
        Intent intent = new Intent(this, English_AlphabetActivity.class);
        startActivity(intent);
    }
    public void openEnglish_ReadingActivity() {
        Intent intent = new Intent(this, English_ReadingActivity.class);
        startActivity(intent);
    }


}