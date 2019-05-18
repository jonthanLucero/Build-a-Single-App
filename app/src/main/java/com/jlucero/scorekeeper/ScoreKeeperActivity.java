package com.jlucero.scorekeeper;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreKeeperActivity extends AppCompatActivity {


    private int globalScoreTeamA = 0;
    private int globalScoreTeamB = 0;

    TextView textViewScoreTeamA;
    TextView textViewScoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);
        setupToolBar();

        textViewScoreTeamA = findViewById(R.id.team_a_score);
        textViewScoreTeamB = findViewById(R.id.team_b_score);
    }

    public void setupToolBar()
    {
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Court Counter");
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#f9a825")));
        ab.setDisplayHomeAsUpEnabled(true);
    }


    /****************************TEAM A METHODS*****************************/
    public void addOneForTeamA(View v)
    {
        globalScoreTeamA += 1;
        displayForTeamA(String.valueOf(globalScoreTeamA));
    }

    public void addTwoForTeamA(View v)
    {
        globalScoreTeamA += 2;
        displayForTeamA(String.valueOf(globalScoreTeamA));
    }

    public void addThreeForTeamA(View v)
    {
        globalScoreTeamA += 3;
        displayForTeamA(String.valueOf(globalScoreTeamA));
    }

    public void displayForTeamA(String score)
    {
        textViewScoreTeamA.setText(score);
    }
    /**********************************************************************/

    /****************************TEAM B METHODS*****************************/
    public void addOneForTeamB(View v)
    {
        globalScoreTeamB += 1;
        displayForTeamB(String.valueOf(globalScoreTeamB));
    }

    public void addTwoForTeamB(View v)
    {
        globalScoreTeamB += 2;
        displayForTeamB(String.valueOf(globalScoreTeamB));
    }

    public void addThreeForTeamB(View v)
    {
        globalScoreTeamB += 3;
        displayForTeamB(String.valueOf(globalScoreTeamB));
    }

    public void displayForTeamB(String score)
    {
        textViewScoreTeamB.setText(score);
    }

    /**********************************************************************/

    public void resetScore(View v)
    {
        globalScoreTeamA = 0;
        displayForTeamA(String.valueOf(globalScoreTeamA));
        globalScoreTeamB = 0;
        displayForTeamB(String.valueOf(globalScoreTeamB));
    }
}
