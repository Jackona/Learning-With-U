package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButton;
    TextView totalquestionsTextView;
    TextView questionshereTextView;
    Button aa, ab, ac, ad;
    Button submit_answer;

    int score = 0;
    int totalQuestions = Questions_Answers.questions.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ImageButton quiztohome = findViewById(R.id.quiztohome);
        quiztohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });

        totalquestionsTextView = findViewById(R.id.totalquestions);
        questionshereTextView = findViewById(R.id.questionshere);
        aa = findViewById(R.id.aa);
        ab = findViewById(R.id.ab);
        ac = findViewById(R.id.ac);
        ad = findViewById(R.id.ad);
        submit_answer = findViewById(R.id.submit_answer);

        aa.setOnClickListener(this);
        ab.setOnClickListener(this);
        ac.setOnClickListener(this);
        ad.setOnClickListener(this);
        submit_answer.setOnClickListener(this);

        totalquestionsTextView.setText("Total question: "+totalQuestions);
        loadNewQuestion();
    }
    @Override
    public void onClick(View view) {

        aa.setBackgroundColor(Color.BLUE);
        ab.setBackgroundColor(Color.BLUE);
        ac.setBackgroundColor(Color.BLUE);
        ad.setBackgroundColor(Color.BLUE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_answer){

            if(selectedAnswer.equals(Questions_Answers.correctanswers[currentQuestionIndex])){
                score++;
            }

            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.GREEN);

            ;

        }

    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestions){
            finishQuiz();
            return;
        }


        questionshereTextView.setText(Questions_Answers.questions[currentQuestionIndex]);
        aa.setText(Questions_Answers.choices[currentQuestionIndex][0]);
        ab.setText(Questions_Answers.choices[currentQuestionIndex][1]);
        ac.setText(Questions_Answers.choices[currentQuestionIndex][2]);
        ad.setText(Questions_Answers.choices[currentQuestionIndex][3]);

    }

    void finishQuiz(){

        String passStatus = "";
        if(score > totalQuestions*0.60){
            passStatus = "Passed!!!!";
        }else {
            passStatus = "Try agian";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Your Score is"+ score+"out of"+totalQuestions)
                .setPositiveButton("Quiz again",(dialogInterface, i) -> restartQuiz())
                .setCancelable(false)
                .show();
    }

    void restartQuiz(){
        score = 0;
        loadNewQuestion();
    }

    public void openSymbol_LearningActivity() {
        Intent intent = new Intent(this, Symbol_LearningActivity.class);
        startActivity(intent);
    }
}