package com.example.gabrielcuenca.spaceinvaders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    String score;
    int maxScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        Intent intent = getIntent(); // gets the previously created intent
        this.score = intent.getStringExtra("score");
        this.maxScore = Integer.parseInt(intent.getStringExtra("maxScore"));

        int n=Integer.parseInt(score);

        if(n==maxScore){
            TextView ganar = findViewById(R.id.estadoText);
            ganar.setText("WIN");
        }
        TextView textView = (TextView) findViewById(R.id.scoreView);
        textView.setText(this.score);
    }
}
