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

public class Maths_AddActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_add);


        //mathhome
        ImageButton imageButton13 = findViewById(R.id.imageButton13);
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaths_MainActivity();
            }
        });

        num1 = (EditText) findViewById(R.id.numone);
        num2 = (EditText) findViewById(R.id.numtwo);
        add = (Button) findViewById(R.id.btnadd);
        answer = (TextView) findViewById(R.id.tvanswer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                answer.setText("Answer: " + String.valueOf(sum));

            }
        });



    }

    public void openMaths_MainActivity() {
        Intent intent = new Intent(this, Maths_MainActivity.class);
        startActivity(intent);
    }
}