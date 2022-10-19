package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
float transparency;
int rotation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar_transparency=(SeekBar) findViewById(R.id.transparency);
        SeekBar seekBar_rotate=(SeekBar) findViewById(R.id.rotate);
        ImageView imageview=(ImageView) findViewById(R.id.image);
        seekBar_transparency.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
           transparency= (float) (progress*0.1);
           imageview.setAlpha(transparency);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

        seekBar_rotate.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
           rotation= progress;
           imageview.setRotation(rotation);

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
    }
    public void left_rotation(View view){
        ImageView imageview=(ImageView) findViewById(R.id.image);
        imageview.setRotation(imageview.getRotation()-90);
    }

    public void right_rotation(View view){
        ImageView imageview=(ImageView) findViewById(R.id.image);
        imageview.setRotation(imageview.getRotation()+90);
    }
}