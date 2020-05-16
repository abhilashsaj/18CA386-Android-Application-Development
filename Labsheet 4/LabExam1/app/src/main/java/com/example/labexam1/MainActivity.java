package com.example.labexam1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;import android.widget.ListView;

public class MainActivity extends Activity
{
    // Array of strings...
    ListView simpleList;
    String nameList[] = {"Abhilash", "Rahul", "Jake"};
    String numberList[] = {"Abhilash", "Rahul", "Marhew"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.layout, R.id.textView, nameList);
        simpleList.setAdapter(arrayAdapter);
    }
}