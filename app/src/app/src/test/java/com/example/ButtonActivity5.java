package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.MediaController;
import android.widget.VideoView;

public class ButtonActivity5 extends AppCompatActivity {
    private Chronometer chronometer;
    private boolean running;
    VideoView videoView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button5);
        chronometer = findViewById(R.id.chronometer);
        videoView1 = findViewById(R.id.videoView1);
        videoView1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.buddy);
        MediaController med=new MediaController(this);
        videoView1.setMediaController(med);
        med.setAnchorView(med);
        videoView1.start();
    }
    public void startChronometer(View v){
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();
            running = true;
        }

    }
    public void stopChronometer(View v){
        chronometer.setBase(SystemClock.elapsedRealtime());
    }

}
