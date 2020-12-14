package com.example.multifrag;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.FragmentTransaction;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    ListView student;
    private static FragmentManager fragmentManager;
    String[] stud = {"Evans","Chris","Johnny"};
    String[] roll = {"P2CSC19002", "P2CSC19005", "P2CSC19023"};
    int[] image = {R.drawable.evans, R.drawable.chris, R.drawable.johnny};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student = (ListView) findViewById(R.id.listView);
        fragmentManager =  getFragmentManager();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stud);
        student.setAdapter(adapter);
        student.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment list = new StudentFragment();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLay, list, "HELLO");
                Bitmap bmp = BitmapFactory.decodeResource(view.getResources(), image[position]);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                Bundle bundle = new Bundle();
                bundle.putString("name", student.getItemAtPosition(position).toString());
                bundle.putString("roll", roll[position]);
                bundle.putByteArray("image", byteArray);
                StudentFragment myObj = new StudentFragment();
                list.setArguments(bundle);

                Fragment f = getFragmentManager().findFragmentByTag("HELLO");
                if(f!=null) fragmentTransaction.remove(f);
                fragmentTransaction.commit();
            }
        });


    }

}