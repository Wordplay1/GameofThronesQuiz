package com.example.android.gameofthronesquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {

    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textName = (TextView) findViewById(R.id.quizName);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Game of Thrones.ttf");
        textName.setTypeface(font);

    }


    public int calculateScore(boolean one, boolean two, boolean three, boolean four, boolean five, boolean six) {
        int runningScore = 0;

        if (one) {
            runningScore += 1;
        }
        if (two) {
            runningScore += 1;
        }
        if (three) {
            runningScore += 1;
        }
        if (four) {
            runningScore += 1;
        }
        if (five) {
            runningScore += 1;
        }
        if (six) {
            runningScore += 1;
        }
        return runningScore;
    }

    public void submitQuiz(View view) {

        EditText userName = findViewById(R.id.name_input_view);
        String name = userName.getText().toString();

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
        boolean questionSix = sixRadioButton.isChecked();

        score = calculateScore(questionOne, questionTwo, questionThree, questionsFour, questionFive, questionSix);

        printResults(name);
    }
    public void printResults(String name){
        if (score <= 2) {
            Toast.makeText(this, name+" you scored "+score+" points. You may need to watch some more GoT!", Toast.LENGTH_SHORT).show();
        } else if (score <= 4) {
            Toast.makeText(this, name+" you scored "+score+" points. You are a friend of the crown!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, name+" you scored "+score+" points. DonalYou are a true lord of the realm!", Toast.LENGTH_SHORT).show();
        }
    }
}


