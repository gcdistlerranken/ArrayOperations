package com.google.distlergrace.arrayoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
    ArrayList<Integer> integerList;
    int     sum             = 0;
    double  average         = 0;
    int     largestNumber   = 0;
    int     smallestNumber  = 0;
    int     range           = 0;

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
                produceNewNumbers();
            }
        });

        buttonSortAscending.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                clearAll();

                //Sort Array List Into Ascending Order
                Collections.sort(integerList);

                for (int i = 0; i < 25; i++)
                {
                    textViewResults.setText(textViewResults.getText() + "" +
                                            integerList.get(i) + ", ");
                }
            }
        });

        buttonSortDescending.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                clearAll();

                //Sort Array List Into Descending Order
                Collections.reverse(integerList);

                for (int i = 0; i < 25; i++)
                {
                    textViewResults.setText(textViewResults.getText() + "" +
                                            integerList.get(i) + ", ");
                }
            }
        });

        buttonTotals.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sumArrayNums();
                avgArrayNums();
                largestArrayNum();
                smallestArrayNum();
                rangeArrayNums();

                //Create A Bundle Object
                Bundle extras = new Bundle();

                //Add 'sum', 'average', 'largestNumber', 'smallestNumber', & 'range' To Bundle
                extras.putInt("sum", sum);
                extras.putDouble("average", average);
                extras.putInt("largestNumber", largestNumber);
                extras.putInt("smallestNumber", smallestNumber);
                extras.putInt("range", range);

                //Create & Initialize Intent
                Intent totalsIntent =  new Intent(getApplicationContext(),
                                                  ArrayTotalsActivity.class);

                //Attach Bundle To Intent
                totalsIntent.putExtras(extras);

                //Start The Activity
                startActivity(totalsIntent);
            }
        });
    }

    private ArrayList<Integer> produceNewNumbers()
    {
        clearNumberList();
        clearAll();

        integerList = new ArrayList<Integer>(25);
        for (int i=1; i<101; i++)
        {
            integerList.add(new Integer(i));
        }
        Collections.shuffle(integerList);
        for (int i=0; i<25; i++)
        {
            textViewResults.setText(textViewResults.getText() + "" + integerList.get(i) + ", ");
        }

        return integerList;
    }

    private void clearAll()
    {
        textViewResults.setText("");
    }

    private void clearNumberList()
    {
        integerList     = null;
        sum             = 0;
        average         = 0;
        largestNumber   = 0;
        smallestNumber  = 0;
        range           = 0;
    }

    private int sumArrayNums()
    {
        sum = 0;

        for(int i=0; i<integerList.size(); i++)
        {
            sum += integerList.get(i);
        }
        return sum;
    }
    private void avgArrayNums()
    {
        average = sum /integerList.size();
    }

    private int largestArrayNum()
    {
        largestNumber = Collections.max(integerList);
        return largestNumber;
    }

    private int smallestArrayNum()
    {
        smallestNumber = Collections.min(integerList);
        return smallestNumber;
    }

    private void rangeArrayNums()
    {
        range = largestNumber - smallestNumber;
    }
}
