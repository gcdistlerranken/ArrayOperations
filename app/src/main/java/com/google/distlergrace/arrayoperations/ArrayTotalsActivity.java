package com.google.distlergrace.arrayoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArrayTotalsActivity extends AppCompatActivity
{
    TextView    textViewTotalsResult;
    Button      buttonReturnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_totals);

        textViewTotalsResult    = findViewById(R.id.textViewTotalsResult);
        buttonReturnHome        = findViewById(R.id.buttonReturnHome);

        //Get The Intent In The Target Activity

        //Get The Attached Bundle From The Intent

        //Extract The Stored Data From The Bundle

        buttonReturnHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }
}
