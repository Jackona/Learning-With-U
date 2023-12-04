package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Maths_MinusActivity extends AppCompatActivity {

    private ImageButton imageButton;

    private EditText onenum;
    private EditText twonum;
    private Button Subtract;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_minus);

        //mathhome
        ImageButton imageButton15 = findViewById(R.id.imageButton15);
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });


        onenum = (EditText) findViewById(R.id.onenum);
        twonum = (EditText) findViewById(R.id.twonum);
        Subtract = (Button) findViewById(R.id.btnminus);
        answer = (TextView) findViewById(R.id.answertv);

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a = Double.parseDouble(onenum.getText().toString());
                b = Double.parseDouble(twonum.getText().toString());
                c = a-b;
                answer.setText(Double.toString(c));





            }
        });

    }

    public void openMaths_MainActivity() {
        Intent intent = new Intent(this, Maths_MainActivity.class);
        startActivity(intent);
    }
}