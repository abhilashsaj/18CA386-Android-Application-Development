package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contact extends AppCompatActivity {



    DbHandler db ;
    EditText editName,editSurname,editMarks ,editTextId;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete, btnviewUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        db = new DbHandler(this);
        editName = (EditText)findViewById(R.id.editText_name);
        editSurname = (EditText)findViewById(R.id.editText_surname);
        editMarks = (EditText)findViewById(R.id.editText_Marks);
        editTextId = (EditText)findViewById(R.id.editText_id);
        btnAddData = (Button)findViewById(R.id.button_add);
        btnviewAll = (Button)findViewById(R.id.button_viewAll);
        btnviewUpdate= (Button)findViewById(R.id.button_update);
        btnDelete= (Button)findViewById(R.id.button_delete);


        String name, phone,email;
        long id;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                name= null;
            } else {
                name= extras.getString("name");
                phone= extras.getString("phone");
                email= extras.getString("email");
                id = extras.getLong("id");
                editName.setText(name);
                editSurname.setText(phone);
                editMarks.setText(email);
                Toast.makeText(getApplicationContext(), name + " selected"+id, Toast.LENGTH_LONG).show();
            }
        } else {
            name = (String) savedInstanceState.getSerializable("name");
            phone = (String) savedInstanceState.getSerializable("phone");
            email = (String) savedInstanceState.getSerializable("email");
            id = (long)savedInstanceState.getSerializable("id");
            Toast.makeText(getApplicationContext(), name + " selected ", Toast.LENGTH_LONG).show();
        }

        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    Bundle extras = getIntent().getExtras();
                    @Override
                    public void onClick(View v) {
                        if(db.DeleteName(extras.getString("name"))) {
                            Intent intent = new Intent(Contact.this, MainActivity.class);
                            Toast.makeText(Contact.this, "Data Deleted", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(Contact.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                    }
                }
        );
        btnviewUpdate.setOnClickListener(
                new View.OnClickListener() {
                    Bundle extras = getIntent().getExtras();
                    @Override
                    public void onClick(View v) {
                        if(db.UpdateUser(extras.getString("name"),
                                extras.getString("phone"),
                                extras.getString("email"))>0) {
                            Intent intent = new Intent(Contact.this, MainActivity.class);
                            Toast.makeText(Contact.this, "Data Updated", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(Contact.this,"Data not Updat ed",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}