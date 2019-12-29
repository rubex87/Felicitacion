package com.example.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.hola_mundo.R.id.titulo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        MediaPlayer mediaPlayer= MediaPlayer.create(this,R.raw.jingle_bells);
        mediaPlayer.start();
    }
}
