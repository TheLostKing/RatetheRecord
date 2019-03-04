package com.example.ratetherecord;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    boolean playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playing = false;

        final Button button1 = findViewById(R.id.btnEveryBodyKnows);
        final Button button2 = findViewById(R.id.btnAllForNothing);
        final Button button3 = findViewById(R.id.btnStandByMe);

        final MediaPlayer mpEverbodyKnows = MediaPlayer.create(this, R.raw.everybodyknows);
        final MediaPlayer mpAllForNothing = MediaPlayer.create(this, R.raw.allfornothing);
        final MediaPlayer mpStandByMe = MediaPlayer.create(this, R.raw.standbyme);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!playing){
                    mpEverbodyKnows.start();
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    playing = true;
                } else {
                    mpEverbodyKnows.pause();
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    playing = false;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!playing){
                    mpAllForNothing.start();
                    button1.setEnabled(false);
                    button3.setEnabled(false);
                    playing = true;
                } else {
                    mpAllForNothing.pause();
                    button1.setEnabled(true);
                    button3.setEnabled(true);
                    playing = false;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!playing){
                    mpStandByMe.start();
                    button2.setEnabled(false);
                    button1.setEnabled(false);
                    playing = true;
                } else {
                    mpStandByMe.pause();
                    button2.setEnabled(true);
                    button1.setEnabled(true);
                    playing = false;
                }
            }
        });
    }

}
