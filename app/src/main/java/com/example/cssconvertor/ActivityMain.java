package com.example.cssconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityMain extends AppCompatActivity {
    EditText etPixels;
    EditText etEm;
    EditText etPoints;
    Button btCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        setListener();

    }

    private void setListener() {
        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateUserInput();
            }
        });
    }

    private void validateUserInput() {
        float pixels = Float.parseFloat(etPixels.getText().toString());
        float em = Float.parseFloat(etEm.getText().toString());
        float points = Float.parseFloat(etPoints.getText().toString());



    }

    private void setViews() {
        etPixels = findViewById(R.id.pixels);
        etEm = findViewById(R.id.em);
        etPoints = findViewById(R.id.points);
        btCalculate = findViewById(R.id.calculate);
    }
}