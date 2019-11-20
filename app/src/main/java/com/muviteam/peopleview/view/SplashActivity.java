package com.muviteam.peopleview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import com.muviteam.peopleview.R;

public class SplashActivity extends AppCompatActivity {

    private VideoView videoViewVideoSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        encontrarComponentesPorId();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 2000);

        String stringVideoPath = "android.resource://" + getPackageName() + "/" + R.raw.fluxitvideo;
        Uri uri = Uri.parse(stringVideoPath);
        videoViewVideoSplash.setVideoURI(uri);
        videoViewVideoSplash.requestFocus();
        videoViewVideoSplash.start();

    }

    private void encontrarComponentesPorId(){
        videoViewVideoSplash = findViewById(R.id.SplashActivity_VideoView_VideoSplash);
    }
}
