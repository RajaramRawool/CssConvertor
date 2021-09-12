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
    EditText etPixels, etEms, etPoints;
    TextView tvPxToEm, tvPxToPt, tvEmToPx, tvEmToPt, tvPtToPx, tvPtToEm;
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

//                Toast.makeText(ActivityMain.this,"Hi!",Toast.LENGTH_SHORT).show();

            }
        });

        btPixels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_px_convertor, null, false );
                llConvertor.removeAllViews();
                llConvertor.addView(view);
            }
        });
        btEms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_ems_convertor,null, false);
                llConvertor.removeAllViews();
                llConvertor.addView(view);
            }
        });

        btPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_points_convertor,null, false);
                llConvertor.removeAllViews();
                llConvertor.addView(view);
            }
        });
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
        btPixels = findViewById(R.id.button_pixels);
        btEms = findViewById(R.id.button_ems);
        btPoints = findViewById(R.id.button_points);
//        LinearLayout
        llConvertor = findViewById(R.id.layout_convertor);
    }
}