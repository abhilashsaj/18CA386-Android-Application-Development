package com.example.bundleform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = (TextView) findViewById(R.id.textView5);
        t2 = (TextView) findViewById(R.id.textView6);
        t3 = (TextView) findViewById(R.id.textView7);
        t4 = (TextView) findViewById(R.id.textView8);



        Bundle bundle = getIntent().getExtras();
        String s1 = bundle.getString("fname");
        String s2 = bundle.getString("lname");
        String s3 = bundle.getString("age");
        String s4 = bundle.getString("mark");

        t1.setText("First Name : "+s1);
        t2.setText("Last Name  : "+s2);
        t3.setText("Age : "+s3);
        t4.setText("Mark: "+s4);
    }
}
