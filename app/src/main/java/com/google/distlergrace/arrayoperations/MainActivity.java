package com.google.distlergrace.arrayoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //Program Constants
    final int   MINNUMBER = 1;
    final int   MAXNUMBER = 100;

    //Program Widget Variables
    TextView    textViewResults;
    Button      buttonNewNumbers;
    Button      buttonSortAscending;
    Button      buttonSortDescending;
    Button      buttonTotals;

    //Program Non-Widget Variables


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResults         = findViewById(R.id.textViewResults);
        buttonNewNumbers        = findViewById(R.id.buttonNewNumbers);
        buttonSortAscending     = findViewById(R.id.buttonSortAscending);
        buttonSortDescending    = findViewById(R.id.buttonSortDescending);
        buttonTotals            = findViewById(R.id.buttonTotals);

        buttonNewNumbers.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
}
