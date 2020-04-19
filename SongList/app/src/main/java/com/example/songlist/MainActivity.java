package com.example.songlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    int imageList[] = {R.drawable.katyperry};
    String titleList[] = {"Roar"};
    String artistList[] = {"Katy Perry"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView gv = (ListView) findViewById(R.id.list);
        gv.setAdapter(new CustomAdapter(getApplicationContext(),imageList, titleList,artistList));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), SongDetails.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}
