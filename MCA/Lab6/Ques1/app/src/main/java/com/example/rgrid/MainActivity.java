package com.example.rgrid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    String name[] = {"Chris Hemsworth", "Chris Evans", "Johnny Depp"};
    String position[] = {"Actor", "Actor", "Actor & Producer"};
    int image[] = {R.drawable.chris,R.drawable.evans,R.drawable.johnny};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView = (RecyclerView) findViewById(R.id.recycler);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
            CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, name, position, image);
            recyclerView.setAdapter(customAdapter);

        }
}