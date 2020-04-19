package com.example.songlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int imageList[] = {R.drawable.katyperry};
    ListView gv;
    String titleList[] = {"Roar"};
    String artistList[] = {"Katy Perry"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (ListView) findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), imageList, titleList ,artistList);
        gv.setAdapter(customAdapter);

    }
}
