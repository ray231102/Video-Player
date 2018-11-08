package com.example.farras23.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

/*KUCING TEKNO */

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    //deklarasi objek

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Video Offline");
        getSupportActionBar().setSubtitle("Tread hoffer");

        videoView = (VideoView) findViewById(R.id.videoView);
        //inisialisasi object videoView
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.thelostonesweeping));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(this));
        //menampilkan media controller video
        videoView.start();
        //memulai video
    }
}