package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.fyp_learningwithu_fyp.display.colorArrayList;
import static com.example.fyp_learningwithu_fyp.display.current_brush;
import static com.example.fyp_learningwithu_fyp.display.pathArrayList;


public class ArtActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        Button button = findViewById(R.id.arttohomebtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });

    }
    public void paintbrush(View view){
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }
    public void eraser(View view){
        pathArrayList.clear();
        colorArrayList.clear();
        path.reset();
    }
    public void redcolour(View view){
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());
    }
    public void yellowcolour(View view){
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }
    public void greencolour(View view){
        paint_brush.setColor(Color.GREEN);
        currentColor(paint_brush.getColor());
    }
    public void bluecolour(View view){
        paint_brush.setColor(Color.BLUE);
        currentColor(paint_brush.getColor());
    }
    public void magentacolour(View view){
        paint_brush.setColor(Color.MAGENTA);
        currentColor(paint_brush.getColor());
    }
    public void currentColor(int c){
        current_brush = c;
        path = new Path();
    }
    public void openSymbol_LearningActivity() {
        Intent intent = new Intent(this, Symbol_LearningActivity.class);
        startActivity(intent);
    }


}
