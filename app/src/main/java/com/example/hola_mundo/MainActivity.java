package com.example.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static com.example.hola_mundo.R.id.titulo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.startAnimation(animacion);





        MediaPlayer mediaPlayer= MediaPlayer.create(this,R.raw.jingle_bells);
        mediaPlayer.start();
    }
}
