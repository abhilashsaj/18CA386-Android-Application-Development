package com.example.radiocheckintentbundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RadioGroup rg;
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3,c4;
    ImageButton b;
    ArrayList<String> selection = new ArrayList<String>();
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RadioButton) findViewById(R.id.rb1);
        r2 = (RadioButton) findViewById(R.id.rb2);
        r3 = (RadioButton) findViewById(R.id.rb3);
        c1 = (CheckBox) findViewById(R.id.cb1);
        c2 = (CheckBox) findViewById(R.id.cb2);
        c3 = (CheckBox) findViewById(R.id.cb3);
        c4 = (CheckBox) findViewById(R.id.cb4);
        rg=(RadioGroup)findViewById(R.id.rg2);
        b = (ImageButton) findViewById(R.id.imageButton);
    }


    public void nextPage(View view)
    {
        final String course = ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();

        String final_itinerary = "";

        for (String Selections : selection)
        {
            final_itinerary = final_itinerary + Selections + "\n       ";
        }
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("course",course );
        bundle.putString("selection", final_itinerary);
        intent.putExtras(bundle);
        startActivity(intent);


    }


    public void selectItem(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.cb1:

                if (checked)
                {selection.add("Listening Music");}

                else
                {selection.remove("Listening Music");}

                break;


            case R.id.cb2:

                if (checked)
                {selection.add("Engaged in Sports");}

                else
                {selection.remove("Engaged in Sports");}

                break;

            case R.id.cb3:

                if (checked)
                {selection.add("Reading");}

                else
                {selection.remove("Reading");}

                break;

            case R.id.cb4:

                if (checked)
                {selection.add("Watching Movies");}

                else
                {selection.remove("Watching Movies");}

                break;
        }
    }
}