package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.speech.tts.TextToSpeech;

import android.widget.Button;


import java.util.Locale;


public class MainActivity extends AppCompatActivity {


    public static final float MINIMUM_CONFIDENCE_TF_OD_API = 0.6f;

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tfe_od_activity_camera);

        tts = new TextToSpeech(this, status -> {
            if(status!= TextToSpeech.ERROR) {
                tts.setLanguage(Locale.KOREAN);
            }
        });

        Button btn_Speak = findViewById(R.id.btnSpeak);

        btn_Speak.setOnClickListener(v -> {
            String text = "hello";

            tts.setPitch(1.0f);
            tts.setSpeechRate(1.0f);
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        });
    }

     */


}




