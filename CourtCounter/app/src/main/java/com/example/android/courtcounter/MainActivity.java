package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
int score_A=0;
public void addThree (View view) {
    score_A=score_A+3;
    displayForTeamA(score_A);
}

    public void addTwo (View view) {
        score_A=score_A+2;
        displayForTeamA(score_A);
    }

    public void addOne (View view) {
        score_A=score_A+1;
        displayForTeamA(score_A);
    }

    public void setZero (View view) {
        score_A=0;
        score_B=0;
        displayForTeamA(score_A);
        displayForTeamB(score_B);
    }



    int score_B=0;

    public void baddThree (View view) {
        score_B=score_B+3;
        displayForTeamB(score_B);
    }

    public void baddTwo (View view) {
        score_B=score_B+2;
        displayForTeamB(score_B);
    }

    public void baddOne (View view) {
        score_B=score_B+1;
        displayForTeamB(score_B);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
