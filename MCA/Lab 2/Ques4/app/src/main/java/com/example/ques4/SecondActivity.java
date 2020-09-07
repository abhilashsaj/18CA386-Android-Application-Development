package com.example.ques4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t = (TextView) findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("name");
        String password = extras.getString("password");
        String email = extras.getString("email");
        String contact = extras.getString("contact");
        String date = extras.getString("date");
        Toast.makeText(getApplicationContext(),"Values are:\n Name: "+name+
                "\n Second Value: "+password, Toast.LENGTH_LONG).show();
        t.setText(name+"\n"+password + "\n" +email + "\n"+ contact + "\n" + date);
    }


}