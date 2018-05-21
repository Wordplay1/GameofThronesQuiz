package com.example.android.gameofthronesquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView name = (TextView) findViewById(R.id.quizName);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Game of Thrones.ttf");
        name.setTypeface(font);


    }

    public void radioQuestionOne(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_westoros:
                if (checked) {
                    points += 1;
                }
                break;
            default:
                points += 0;
        }
    }

    public void radioQuestionTwo(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_wife:
                if (checked) {
                    points += 1;
                }
            default:
                points += 0;
        }
    }
}


