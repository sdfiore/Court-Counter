/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.courtcounter
 * If you get an error when copying this code into Android studio, update it to match the package name found
 * in the project's AndroidManifest.xml file.
 **/
package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int team_a_score;
    private int team_b_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null)
        {
            team_a_score = savedInstanceState.getInt("teamAScore");
            team_b_score = savedInstanceState.getInt("teamBScore");
            displayForTeamA(team_a_score);
            displayForTeamB(team_b_score);
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds three points to Team A.
     * @param v
     */
    public void displayPlusThreeA(View v) {
        team_a_score = team_a_score + 3;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds two points to Team A.
     * @param v
     */
    public void displayPlusTwoA(View v) {
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds one point to Team A.
     * @param v
     */
    public void displayFreeThrowA(View v) {
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds three points to Team B.
     * @param v
     */
    public void displayPlusThreeB(View v) {
        team_b_score = team_b_score + 3;
        displayForTeamB(team_b_score);
    }

    /**
     * Adds two points to Team B.
     * @param v
     */
    public void displayPlusTwoB(View v) {
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }

    /**
     * Adds one point to Team B.
     * @param v
     */
    public void displayFreeThrowB(View v) {
        team_b_score = team_b_score + 1;
        displayForTeamB(team_b_score);
    }

    /**
     * Resets the score of both Team A and Team B.
     * @param v
     */
    public void resetScore(View v) {
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }

    /**
     * Stores the score values of both Team A and Team B.
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("teamAScore", team_a_score);
        outState.putInt("teamBScore", team_b_score);
    }
}
