package com.example.dayonehelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = findViewById(R.id.textView2);
        Button button1 = findViewById(R.id.button);
        final TextView textView1 = findViewById(R.id.textView);
        final ImageView imageView1 = findViewById(R.id.imageView);
        final Switch switch1 = findViewById(R.id.switch1);
        final SeekBar seekBar1 = findViewById(R.id.seekBar);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch1.setVisibility(View.VISIBLE);
                Log.d("MainActivity", "onbutton1Click: ");
            }
        });
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton,boolean i ) {
                //switch1.setChecked(false==switch1.isChecked());
                if(!switch1.isChecked()){
                    textView1.setVisibility(View.VISIBLE);
                }
                else textView1.setVisibility(View.INVISIBLE);
                Log.d("MainActivity", "onswitchchecked: ");
            }
        });
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                float p = seekBar1.getProgress();
                p = p/100;
                imageView1.setAlpha(p);
                Log.d("MainActivity", "onswitchchecked: "+seekBar1.getProgress()/100);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
