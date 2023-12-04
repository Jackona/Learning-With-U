package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gruffalo_mianActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruffalo_mian);

        //englishhome
        ImageButton g2home = findViewById(R.id.g2home);
        g2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnglish_MainActivity();
            }
        });
        //to page 1
        Button readmebtn = findViewById(R.id.readmebtn);
        readmebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengruffalo_page1Activity();
            }
        });





    }
    public void openEnglish_MainActivity() {
        Intent intent = new Intent(this, English_MainActivity.class);
        startActivity(intent);
    }
    public void opengruffalo_page1Activity() {
        Intent intent = new Intent(this, gruffalo_page1Activity.class);
        startActivity(intent);
    }
}