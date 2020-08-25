package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;

import com.example.assignment.R;

public class MainActivity extends AppCompatActivity {

    Button login;
    TextView uname, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        uname =  (TextView) findViewById((R.id.editText)) ;
        pass =  (TextView) findViewById((R.id.editText)) ;
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "Hey" + uname.getText() +" " +pass.getText(), Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
    }
}
