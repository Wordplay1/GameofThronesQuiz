package com.example.android.gameofthronesquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.quizName);
        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Game of Thrones.ttf");
        name.setTypeface(font);
    }
}
