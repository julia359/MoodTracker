package com.example.moodtracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Declare variables for our UI components
    private EditText moodInput;
    private Button submitButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Initialize variables by linking them to XML IDs
        moodInput = findViewById(R.id.moodInput);
        submitButton = findViewById(R.id.submitButton);
        resultText = findViewById(R.id.resultText);

        // 3. Set a Click Listener for the button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mood = moodInput.getText().toString();

                if (mood.isEmpty()) {
                    resultText.setText(getString(R.string.empty_mood_error));
                } else {
                    resultText.setText(getString(R.string.mood_result_format, mood));
                }
            }
        });
    }
}
