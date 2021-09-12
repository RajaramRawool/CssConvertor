package com.example.cssconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityMain extends AppCompatActivity {
    EditText etPixels;
    EditText etEm;
    EditText etPoints;
    Button btCalculate, btPixels, btEms, btPoints;
    LinearLayout llConvertor ;

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

        btPixels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_px_convertor, null, false );
                llConvertor.addView(view);


            }
        });

    }

    private void validateUserInput() {

    }

    private void setViews() {

        btCalculate = findViewById(R.id.calculate);
        btPixels = findViewById(R.id.button_pixels);
        btEms = findViewById(R.id.button_ems);
        btPoints = findViewById(R.id.button_points);
        llConvertor = findViewById(R.id.layout_convertor);
    }
}