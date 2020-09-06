package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Main Activity","Created Main Activity");
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Log.e("Calling Second Activity","Calling Activity two ");
        Intent i = new Intent(getApplicationContext(), MainActivityTwo.class);
        i.putExtra("Value1", "Hi");
        i.putExtra("Value2", "Man");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
    public void callThirdActivity(View view){
        Log.e("Calling Third Activity","Calling Activity three ");
        Intent i = new Intent(getApplicationContext(), MainActivityThree.class);
        i.putExtra("Value1", "Hi");
        i.putExtra("Value2", "Man");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
    protected void onStart() {
        super.onStart();
        Log.e("Main Activity", "Main Activity Started, onStart invoked");
    }
    protected void onRestart() {
        super.onRestart();
        Log.e("Main Activity", "Main Activity Restarted, onRestart invoked");
    }
    protected void onResume() {
        super.onResume();
        Log.e("Main Activity", "Main Activity Resumed, onResume invoked");
    }
    protected void onPause() {
        super.onPause();
        Log.e("Main Activity", "Main Activity Pause, onPause invoked");
    }
    protected void onStop() {
        super.onStop();
        Log.e("Main Activity", "Main Activity stopped, onStop invoked");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Main Activity", "Main Activity Destroyed, onDestroy invoked");
    }
}
