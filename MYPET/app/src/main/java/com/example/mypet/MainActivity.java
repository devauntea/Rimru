package com.example.mypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declare Variable
    int track;
    int track2;
    int track3;
    ImageView Pet;
    private int exporessions[] = {R.drawable.confused,R.drawable.emo, R.drawable.mad, R.drawable.hap, R.drawable.happy,R.drawable.reg};
    ProgressBar myProgressBar;
    ProgressBar myProgressBar2;
    ProgressBar myProgressBar3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myProgressBar = findViewById(R.id.progress_bar1);
        myProgressBar2 = findViewById(R.id.progress_bar2);
        myProgressBar3 = findViewById(R.id.progress_bar3);
        Pet=findViewById(R.id.Pet);
        track = 100;
        track2 = 100;
        track3 = 100;

        new CountDownTimer(100000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                track--;
                track2 = track2 - 2;
                track3 = track3 - 3;
                myProgressBar.setProgress(track);
                myProgressBar2.setProgress(track2);
                myProgressBar3.setProgress(track3);

            }

            @Override
            public void onFinish() {
                Toast myAlert = Toast.makeText(getApplicationContext(),"Pet has met the Door", Toast.LENGTH_LONG);
                myAlert.show();
                //Toast myAlert2 = Toast.makeText(getApplicationContext(),"Pet needs food", Toast.LENGTH_SHORT);
                //myAlert2.show();
                //Toast myAlert3 = Toast.makeText(getApplicationContext(),"Pet is suffering from cripling depression", Toast.LENGTH_LONG);
                //myAlert3.show();
            }
        }.start();
    }
    public void healthPlus(View view){
        track = track + 3;
        myProgressBar.setProgress(track);
    }
    public void hungerPlus(View view){
        track2 = track2 + 5;
        track = track + 1;
        myProgressBar.setProgress(track);
        myProgressBar2.setProgress(track2);

    }
    public void happynessPlus(View view){
        track3 = track3 + 7;
        track = track + 1;
        myProgressBar.setProgress(track);
        myProgressBar3.setProgress(track3);
    }
    public void happynessPlus2(View view){
        track3 = track3 + 3;
        myProgressBar3.setProgress(track3);
        Pet.setImageResource(exporessions[1]);

    }
    /*public void faceExpress(View view){
        if( =< 75){
            Pet.setImageResource(exporessions[5]);
        }
        else if( =< 50){
            Pet.setImageResource(exporessions[0]);
        }
         else if( =< 25){
            Pet.setImageResource(exporessions[2]);
        }
         else{
             Pet.setImageResource(exporessions[4]);
        }

    }*/
    public void chatRoom(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}

