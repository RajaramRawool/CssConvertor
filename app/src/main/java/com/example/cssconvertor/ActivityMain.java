package com.example.cssconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {
    EditText etPixels, etEms, etPoints,etTemp;
    TextView tvPxToEm, tvPxToPt, tvEmToPx, tvEmToPt, tvPtToPx, tvPtToEm, tvTemp;
    Button btConvert, btPixels, btEms, btPoints;
    LinearLayout llConvertor ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        setListener();

    }

    private void setListener() {
        btConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
                convertPx();
                convertEms();
                convertPoints();
            }
        });


    }

    private void convertPoints() {
        int points = Integer.parseInt(etPoints.getText().toString());
        tvPtToPx.setText(String.valueOf((int)(points * 1.34)));
        tvPtToEm.setText(String.valueOf(points / 12));
    }

    private void convertEms() {
        float ems = Float.parseFloat(etEms.getText().toString());
        tvEmToPx.setText(String.valueOf(ems * 16));
        tvEmToPt.setText(String.valueOf(ems * 12.0));
    }

    private void convertPx() {
        float pixels = Float.parseFloat(etPixels.getText().toString());
        tvPxToEm.setText(String.valueOf(pixels/16));
        tvPxToPt.setText(String.valueOf(pixels * 0.75));
    }

    private void validate() {
        if (etPixels.getText().toString().isEmpty()) {
            etPixels.setText("0");
        }
        if (etEms.getText().toString().isEmpty()) {
            etEms.setText("0");
        }
        if (etPoints.getText().toString().isEmpty()) {
            etPoints.setText("0");
        }
    }

    private void setViews() {
//        EditText
        etPixels = findViewById(R.id.px_pixels);
        etEms = findViewById(R.id.ems_em);
        etPoints = findViewById(R.id.points_points);
//        TextViews
        tvPxToEm = findViewById(R.id.px_em);
        tvPxToPt = findViewById(R.id.px_points);
        tvEmToPx = findViewById(R.id.ems_pixels);
        tvEmToPt = findViewById(R.id.ems_points);
        tvPtToPx = findViewById(R.id.points_pixels);
        tvPtToEm = findViewById(R.id.points_em);
//        Buttons
        btConvert = findViewById(R.id.convert);
//        LinearLayout
        llConvertor = findViewById(R.id.layout_convertor);
    }
}