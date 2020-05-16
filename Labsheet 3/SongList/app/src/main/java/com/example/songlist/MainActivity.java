package com.example.songlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int imageList[] = {R.drawable.user};
    ListView gv;
    String titleList[] = {"Abhilash"};
    String artistList[] = {"9567347371"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (ListView) findViewById(R.id.list);
        Button buttonOne = findViewById(R.id.button);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(getApplicationContext(), Add.class);
                startActivity(activity2Intent);
            }
        });
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), imageList, titleList ,artistList);
        gv.setAdapter(customAdapter);

    }
}
