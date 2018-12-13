package org.pursuit.unit_02_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public TextView secondActivitytextView;
    public static final String SECOND_KEY = "second Key";
    public String getMessageFromTheMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        secondActivitytextView = findViewById(R.id.second_textView);
        Intent intent = getIntent();
        getMessageFromTheMain = intent.getStringExtra(MainActivity.MAIN_ACTIVITY_KEY);
        secondActivitytextView.setText(getMessageFromTheMain);
        if (savedInstanceState != null) {
            String saveState = savedInstanceState.getString(SECOND_KEY);
            secondActivitytextView.setText(saveState);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Intent intent = getIntent();
        getMessageFromTheMain = intent.getStringExtra(MainActivity.MAIN_ACTIVITY_KEY).toString();
        outState.putString(SECOND_KEY,
                getMessageFromTheMain);
    }
}
