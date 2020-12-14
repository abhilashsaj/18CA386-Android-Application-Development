package com.example.radiocheckintentbundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (TextView) findViewById(R.id.t1);

        Bundle bundle = getIntent().getExtras();
        String s1 = bundle.getString("course");
        String s2 = bundle.getString("selection");

        t1.append("\t\tCourse       : "+s1+"\n");
        t1.append("\n\t\tHobbies     : \n"+s2+"\n");

    }
}