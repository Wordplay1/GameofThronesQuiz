package com.example.android.gameofthronesquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView name = (TextView) findViewById(R.id.quizName);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Game of Thrones.ttf");
        name.setTypeface(font);

        RadioButton oneRadioButton = findViewById(R.id.radio_westoros);
        boolean questionOne = oneRadioButton.isChecked();

        RadioButton twoRadioButton = findViewById(R.id.radio_wife);
        boolean questionTwo = twoRadioButton.isChecked();

        RadioButton threeRadioButton = findViewById(R.id.radio_aegon);
        boolean questionThree = threeRadioButton.isChecked();

        RadioButton fourRadioButton = findViewById(R.id.radio_moore);
        boolean questionsFour = fourRadioButton.isChecked();

        RadioButton fiveRadioButton = findViewById(R.id.radio_hound);
        boolean questionFive = fiveRadioButton.isChecked();

        RadioButton sixRadioButton = findViewById(R.id.radio_dragon2);
        boolean questionSix = fourRadioButton.isChecked();

        int score = calculateScore(questionOne,questionTwo,questionThree,questionsFour,questionFive,questionSix);


    }


    public int calculateScore(boolean one, boolean two, boolean three, boolean four, boolean five, boolean six) {
        if (points == 6) {
            /*
            String resultsScore = "You scored " + points + " out of 6!";
            Toast.makeText(this, resultsScore, Toast.LENGTH_LONG).show();
            */
        }
    }
}


