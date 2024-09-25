package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioGroup radioGroup;
    RatingBar ratingBar;
    SeekBar seekBar;
    Switch switch1;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        switch1 = findViewById(R.id.switch1);
        resultTextView = findViewById(R.id.resultTextView);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    resultTextView.setText("CheckBox is checked");
                } else {
                    resultTextView.setText("CheckBox is unchecked");
                }
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                resultTextView.setText("Selected RadioButton: " + radioButton.getText());
            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                resultTextView.setText("Rating: " + rating);
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                resultTextView.setText("SeekBar Progress: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Optional
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Optional
            }
        });


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    resultTextView.setText("Switch is ON");
                } else {
                    resultTextView.setText("Switch is OFF");
                }
            }
        });
    }
}
