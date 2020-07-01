package com.example.labexam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

//import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button add_btn;
    ListView simpleList;
//    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    myDbAdapter helper;
//    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new myDbAdapter(this);
        ArrayList<HashMap<String, String>> userList = helper.getData();
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ListAdapter adapter = new SimpleAdapter(MainActivity.this, userList, R.layout.list_row,new String[]{"name","designation","location"}, new int[]{R.id.name, R.id.designation, R.id.location});
        simpleList.setAdapter(adapter);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item text from ListView
//                String selectedItem = (String) parent.getItemAtPosition(position);
                    Integer i = position+1;
                // Display the selected item text on TextView
//                Toast.makeText(this, selectedItem.toString(), Toast.LENGTH_LONG).show();
                int a= helper.delete(i.toString());
                if(a<=0)
                {
                    Message.message(getApplicationContext(),"Unsuccessful");
//                    delete.setText("");
                }
                else
                {
                    Message.message(MainActivity.this, "DELETED");
//                    delete.setText("");
                }
                Toast.makeText(MainActivity.this, i.toString(),
                        Toast.LENGTH_LONG).show();
                finish();
                startActivity(getIntent());
            }
        });

        add_btn = (Button)findViewById(R.id.add_button);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new  Intent(getBaseContext(), Add_Activity.class);
                startActivity(intent);
            }
        });
    }
}
