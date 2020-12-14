package com.example.recyclerviewexample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {
    ImageView image;
    TextView name, score, wicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        image = (ImageView) findViewById(R.id.detailImage);
        name = (TextView) findViewById(R.id.detailsName);
        score = (TextView) findViewById(R.id.detailScore);
        wicket = (TextView) findViewById(R.id.detailWicket);

        image.setImageBitmap(bmp);
        name.setText(getIntent().getStringExtra("name"));
        score.setText(getIntent().getStringExtra("score"));
        wicket.setText(getIntent().getStringExtra("wicket"));


    }
}
