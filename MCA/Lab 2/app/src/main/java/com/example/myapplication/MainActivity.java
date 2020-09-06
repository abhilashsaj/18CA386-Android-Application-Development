package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final String STATE_USER = "Abhilash";
    private String mUser = "Abhilash";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Main Activity","Created Main Activity");
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"User info: "+ mUser, Toast.LENGTH_LONG).show();
        if (savedInstanceState != null) {
            mUser = savedInstanceState.getString(STATE_USER);
        } else {
            mUser = "user";
        }

    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(STATE_USER, mUser);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void callSecondActivity(View view){
        Log.e("Calling Second Activity","Calling Activity two ");
        Intent i = new Intent(getApplicationContext(), MainActivityTwo.class);
        i.putExtra("Value1", "Hi");
        i.putExtra("Value2", "Man");
        startActivity(i);
    }
    public void callThirdActivity(View view){
        Log.e("Calling Third Activity","Calling Activity three ");
        Intent i = new Intent(getApplicationContext(), MainActivityThree.class);
        i.putExtra("Value1", "Hi");
        i.putExtra("Value2", "Man");
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
