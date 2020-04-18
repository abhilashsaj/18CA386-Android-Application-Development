package com.example.customlistview;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView simpleList;
    String nameList[] = {"Abhilash", "Max", "Christy", "Sam", "Rika", "Jimmy"};
    String emailList[] = {"abhilash@gmail.com", "Max@gmail.com", "Christy@gmail.com", "Sam@gmail.com", "Rika@gmail.com", "Jimmy@gmail.com"};
    String phone[] = {"9655464123", "465413554", "645642312", "46563115", "544546113", "456213511"};
    int images[] = {R.drawable.me, R.drawable.person1, R.drawable.person2, R.drawable.person3, R.drawable.person4, R.drawable.pug};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), nameList,  emailList, phone, images);
        simpleList.setAdapter(customAdapter);
    }
}