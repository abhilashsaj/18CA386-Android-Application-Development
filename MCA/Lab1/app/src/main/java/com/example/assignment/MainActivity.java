package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
        pass =  (TextView) findViewById((R.id.editText2)) ;
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.login:
                        alertDialog();
                        break;
                }
            Toast.makeText(getApplicationContext(), "Hey" + uname.getText() +" " +pass.getText(), Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
    }
    private void alertDialog() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage(uname.getText() +" " +pass.getText());
        dialog.setTitle("Dialog Box");
        dialog.setPositiveButton("YES",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                    }
                });
        dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }
}
