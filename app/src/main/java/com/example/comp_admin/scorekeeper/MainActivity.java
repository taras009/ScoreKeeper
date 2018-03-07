package com.example.comp_admin.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTop = 0;
    int scoreBottom = 0;
    public void displayForTop(int score) {
        TextView scoreView = (TextView) findViewById(R.id.upper_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addToTop(View view) {
        displayForTop(scoreTop += 1);
    }


    public void displayForBottom(int score) {
        TextView scoreView = (TextView) findViewById(R.id.lower);
        scoreView.setText(String.valueOf(score));
    }

    public void addToBottom(View view) {
        displayForBottom(scoreBottom += 1);
    }
    public void resetScore(View view) {
        scoreBottom = 0;
        scoreTop = 0;
        displayForTop(scoreTop);
        displayForBottom(scoreBottom);
    }


}