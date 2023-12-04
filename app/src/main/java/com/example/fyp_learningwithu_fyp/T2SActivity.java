package com.example.fyp_learningwithu_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;

import org.w3c.dom.Text;

import java.util.Locale;

public class T2SActivity extends AppCompatActivity {

    private TextToSpeech mTTS;
    private EditText mEditText;
    private SeekBar mSeekBarPitch;
    private Button mButtonSpeak;

    private ImageButton imageButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2_sactivity);

        mButtonSpeak = findViewById(R.id.hearit);

        //to home page
        ImageButton imageButton = findViewById(R.id.tohomepageib);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymbol_LearningActivity();
            }
        });




        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS){
                    int result = mTTS.setLanguage(Locale.ENGLISH);

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("TTS","Language not supported");
                    }else {
                        mButtonSpeak.setEnabled(true);
                    }

                }else {
                    Log.e("TTS","Failed");
                }

            }
        });

        mEditText = findViewById(R.id.enter_text);
        mSeekBarPitch = findViewById(R.id.seek_bar_pitch);


        mButtonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });




    }
    private void speak(){
        String text = mEditText.getText().toString();
        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;

        mTTS.setPitch(pitch);
        mTTS.speak(text,TextToSpeech.QUEUE_FLUSH,null);




    }

    @Override
    protected void onDestroy() {
        if (mTTS != null){
            mTTS.stop();
            mTTS.shutdown();
        }



        super.onDestroy();
    }
    public void openSymbol_LearningActivity() {
        Intent intent = new Intent(this, Symbol_LearningActivity.class);
        startActivity(intent);
    }
}