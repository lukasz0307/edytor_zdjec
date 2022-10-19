package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
float transparency;
int rotation;
int r,g,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView image_filter=(TextView)findViewById(R.id.image_filter);
        image_filter.setAlpha((float) 0.5);
        SeekBar seekBar_transparency=(SeekBar) findViewById(R.id.transparency);
        SeekBar seekBar_rotate=(SeekBar) findViewById(R.id.rotate);
        SeekBar seekBar_r=(SeekBar) findViewById(R.id.seekbar_r);
        SeekBar seekBar_g=(SeekBar) findViewById(R.id.seekbar_g);
        SeekBar seekBar_b=(SeekBar) findViewById(R.id.seekbar_b);
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
           image_filter.setRotation(rotation);

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

        seekBar_r.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                r= progress;
                rgb();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar_g.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                g= progress;
                rgb();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar_b.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                b= progress;
                rgb();

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
        TextView image_filter=(TextView)findViewById(R.id.image_filter);
        imageview.setRotation(imageview.getRotation()-90);
        image_filter.setRotation(image_filter.getRotation()-90);
    }

    public void right_rotation(View view){
        ImageView imageview=(ImageView) findViewById(R.id.image);
        TextView image_filter=(TextView)findViewById(R.id.image_filter);
        imageview.setRotation(imageview.getRotation()+90);
        image_filter.setRotation(image_filter.getRotation()+90);
    }
    public void rgb(){
       TextView image_filter=(TextView) findViewById(R.id.image_filter);
        image_filter.setBackgroundColor(Color.rgb(r,g,b));
    }

}