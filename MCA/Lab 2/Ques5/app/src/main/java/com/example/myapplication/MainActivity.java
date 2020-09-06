package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        Button button = (Button)findViewById(R.id.button1);

        // implementation of onClick event for Implicit Intent
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                // performing webpage open action
                String url = editText1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
