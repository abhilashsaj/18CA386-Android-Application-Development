package com.example.songlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SongDetails extends Activity {
    public TextView title, artist;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_layout);

        // initialize TextViews
        initializeViews();

        // get the Intent that started this Activity
        Intent in = getIntent();

        // get the Bundle that stores the data of this Activity
        Bundle b = in.getExtras();

        // getting data from bundle
        String nameString = b.getString("title");
        String authorString = b.getString("author");
        int imageID = b.getInt("image");


        // show data to layout
        title.setText("Title : " + nameString);
        artist.setText("Artist: "+authorString);

    }

    public void initializeViews() {
        title = (TextView) findViewById(R.id.textView);
        artist = (TextView) findViewById(R.id.textView2);
        image = (ImageView) findViewById(R.id.icon);
    }
}
