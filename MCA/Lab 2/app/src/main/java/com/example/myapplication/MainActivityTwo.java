package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytwo_main);

        Log.e("Main Activity Two","Created Main Activity Two");
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2, Toast.LENGTH_LONG).show();
    }
    public void callFirstActivity(View view){
        Log.e("Calling First Activity","Calling Main Activity ");
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
    protected void onStart() {
        super.onStart();
        Log.e("Main Activity Two", "Main Activity Two Started, onstart invoked");
    }
    protected void onRestart() {
        super.onRestart();
        Log.e("Main Activity Two", "Main Activity Two Started, onstart invoked");
    }
    protected void onResume() {
        super.onResume();
        Log.e("Main Activity Two", "Main Activity Two Resumed, onResume invoked");
    }
    protected void onPause() {
        super.onPause();
        Log.e("Main Activity Two", "Main Activity Two Pause, onPause invoked");
    }
    protected void onStop() {
        super.onStop();
        Log.e("Main Activity Two", "Main Activity Two stopped, onStop invoked");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Main Activity Two", "Main Activity Two Destroyed, onDestroy invoked");
    }
}