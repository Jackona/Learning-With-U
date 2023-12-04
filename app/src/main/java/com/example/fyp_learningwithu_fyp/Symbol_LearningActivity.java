package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Symbol_LearningActivity extends AppCompatActivity {
    private ImageButton imageButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol_learning);

        //math
        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });
        //english
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_MainActivity();
            }
        });
        //symbol
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_MainActivity();
            }
        });
        //T2S
        ImageButton imageButton265 = findViewById(R.id.imageButton265);
        imageButton265.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openT2SActivity();
            }
        });
        //art
        ImageButton imageButton266 = findViewById(R.id.imageButton266);
        imageButton266.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArtActivity();
            }
        });
        //quiz
        ImageButton imageButton267 = findViewById(R.id.imageButton267);
        imageButton267.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });
        Button toSingoutbtn = findViewById(R.id.toSingoutbtn);
        toSingoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });






    }


    public void openMaths_MainActivity() {
        Intent intent = new Intent(this, Maths_MainActivity.class);
        startActivity(intent);
    }
    public void openEnglish_MainActivity() {
        Intent intent = new Intent(this, English_MainActivity.class);
        startActivity(intent);
    }
    public void openSymbol_MainActivity() {
        Intent intent = new Intent(this, Symbol_MainActivity.class);
        startActivity(intent);
    }
    public void openT2SActivity() {
        Intent intent = new Intent(this, T2SActivity.class);
        startActivity(intent);
    }
    public void openArtActivity() {
        Intent intent = new Intent(this, ArtActivity.class);
        startActivity(intent);
    }
    public void openQuizActivity() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
