package com.example.bundleform;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2,e3,e4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.fname);
        e2 = (EditText) findViewById(R.id.lname);
        e3 = (EditText) findViewById(R.id.age);
        e4 = (EditText) findViewById(R.id.mark);
        btn= (Button)   findViewById(R.id.button);

    }

    public void nextPage(View view)
    {
        final String fname= e1.getText().toString();
        final String lname= e2.getText().toString();
        final String age  = e3.getText().toString();
        final String mark = e4.getText().toString();

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("fname", fname);
        bundle.putString("lname", lname);
        bundle.putString("age",age );
        bundle.putString("mark",mark );
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
