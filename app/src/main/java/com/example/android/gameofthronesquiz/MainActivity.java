package com.example.android.gameofthronesquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textName = (TextView) findViewById(R.id.quiz_name);
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

        CheckBox dragonOneCheckBox = (CheckBox) findViewById(R.id.check_dragon1);
        boolean dragonOne = dragonOneCheckBox.isChecked();

        CheckBox dragonTwoCheckBox = (CheckBox) findViewById(R.id.check_dragon2);
        boolean dragonTwo = dragonTwoCheckBox.isChecked();

        CheckBox dragonThreeCheckBox = (CheckBox) findViewById(R.id.check_dragon3);
        boolean dragonThree = dragonThreeCheckBox.isChecked();

        CheckBox dragonFourCheckBox = (CheckBox) findViewById(R.id.check_dragon4);
        boolean dragonFour = dragonFourCheckBox.isChecked();

        CheckBox bookOneCheckBox = (CheckBox) findViewById(R.id.check_book1);
        boolean bookOne = bookOneCheckBox.isChecked();

        CheckBox bookTwoCheckBox = (CheckBox) findViewById(R.id.check_book2);
        boolean bookTwo = bookTwoCheckBox.isChecked();

        CheckBox bookThreeCheckBox = (CheckBox) findViewById(R.id.check_book3);
        boolean bookThree = bookThreeCheckBox.isChecked();

        CheckBox bookFourCheckBox = (CheckBox) findViewById(R.id.check_book4);
        boolean bookFour = bookFourCheckBox.isChecked();


        EditText questionNineAnswer = findViewById(R.id.question_nine_answer);
        String answer = questionNineAnswer.getText().toString();


        score = calculateScore(questionOne, questionTwo, questionThree, questionsFour, questionFive, questionSix);
        score += calculateCheckBox(dragonOne, dragonTwo, dragonThree, dragonFour);
        score += calculateCheckBoxTwo(bookOne, bookTwo, bookThree, bookFour);
        score += calculateEditText(answer);

        printResults(name);
    }

    public void printResults(String name) {
        if (score <= 2) {
            if (name.trim().isEmpty()) {
                Toast.makeText(this, "You scored " + score + " points. You may need to watch some more GoT!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, name + ", you scored " + score + " points. You may need to watch some more GoT!", Toast.LENGTH_SHORT).show();
            }
        } else if (score <= 4) {
            if (name.trim().isEmpty()) {
                Toast.makeText(this, "You scored " + score + " points. You are a GoT noble!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, name + ", You scored " + score + " You are a GoT noble!", Toast.LENGTH_SHORT).show();
            }
        } else if (score <= 6) {
            if (name.trim().isEmpty()) {
                Toast.makeText(this, "You scored " + score + " points. You are a friend of the crown!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, name + ", You scored " + score + " points. You are a friend of the crown!", Toast.LENGTH_SHORT).show();
            }
        } else if (score <= 8) {
            if (name.trim().isEmpty()) {
                Toast.makeText(this, "You scored " + score + " points. You are a true LORD of the Realm!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, name + ", You scored " + score + " points. You are a true LORD of the Realm!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public int calculateCheckBox(boolean d1, boolean d2, boolean d3, boolean d4) {
        int points = 0;
        if (d1 && d2 && d3 && !d4) {
            points = 1;
        }
       /* if (d4) {
            points = 0;
        }*/
        return points;
    }

    public int calculateCheckBoxTwo(boolean b1, boolean b2, boolean b3, boolean b4) {
        int points = 0;
        if (!b1 && !b2 && b3 && b4) {
            points = 1;
        }
        return points;
    }

    public int calculateEditText(String answer) {
        int points = 0;

        if (answer.equalsIgnoreCase("The Children of the Forest"))
            points = 1;

        return points;
    }
}


