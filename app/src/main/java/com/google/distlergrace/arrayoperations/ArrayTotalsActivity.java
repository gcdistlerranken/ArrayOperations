package com.google.distlergrace.arrayoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArrayTotalsActivity extends AppCompatActivity
{
    TextView    textViewTotalsResult;
    Button      buttonReturnHome;

    Integer     sum;
    Integer     average;
    Integer     largestNumber;
    Integer     smallestNumber;
    Integer     range;
    String      result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_totals);

        textViewTotalsResult    = findViewById(R.id.textViewTotalsResult);
        buttonReturnHome        = findViewById(R.id.buttonReturnHome);

        //Get The Intent In The Target Activity
        Intent totalsIntent = getIntent();

        //Get The Attached Bundle From The Intent
        Bundle extras = totalsIntent.getExtras();

        //Extract The Stored Data From The Bundle
        if (extras != null)
        {
            if (extras.containsKey("sum"))
            {
                sum = extras.getInt("sum", 0);
            }
            if (extras.containsKey("average"))
            {
                average = extras.getInt("average", 0);
            }
            if (extras.containsKey("largestNumber"))
            {
                largestNumber = extras.getInt("largestNumber", 0);
            }
            if (extras.containsKey("smallestNumber"))
            {
                smallestNumber = extras.getInt("smallestNumber", 0);
            }
            if (extras.containsKey("range"))
            {
                range = extras.getInt("range", 0);
            }

            result  = "\nSum of 25 array elements: \t"  + sum.toString()            + "\n";
            result += "\nAvg of 25 array elements: \t"  + average.toString()        + "\n";
            result += "\nLargest array elements: \t"    + largestNumber.toString()  + "\n";
            result += "\nSmallest array elements: \t"   + smallestNumber.toString() + "\n";
            result += "\nRange of array elements: \t"   + average.toString()        + "\n";

            textViewTotalsResult.setText(result);

        }

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
