package com.example.mypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<String> comments = new ArrayList<>();
    private EditText inputComments;
    private String comment2;
    private TextView commentz;
    private TextView commentz2;
    String Noise[] ={"glooop","glamp","jiggily","splish","splat","argh","offf","Bwah-hah-hah","D'of","raggy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        commentz = findViewById(R.id.Commenttext);
        commentz2 = findViewById(R.id.Commenttext2);
        inputComments = findViewById(R.id.inputComment);
    }
    public void PetRoom(View view){
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }
    public void getComment(View views){
        int botNoise = getRand();
        comment2 = inputComments.getText().toString();
        comments.add(comment2);
        commentz.append(String.format(comment2 + "\n"));
        commentz2.append(String.format(Noise[botNoise] + "\n"));
    }
    public int getRand(){ return(int) Math.floor(Math.random() * 10); }
}
