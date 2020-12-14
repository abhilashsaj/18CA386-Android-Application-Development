package com.example.menusexample;


import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button pop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2) ;
        registerForContextMenu(imageView);

        pop = (Button) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, pop);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this, "Item Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popup.show();
            }
        });
    }






    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo
            menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cont_menu, menu);
        menu.setHeaderTitle("Pick Option");
    }

    public boolean onContextItemSelected (MenuItem item){
        if (item.getItemId() == R.id.edit) {
            Toast.makeText(getApplicationContext(), "Edited", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.share) {
            Toast.makeText(getApplicationContext(), "Shared", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.delete) {
            Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
        }
        else{
            return false;
        }
        return true;
    }


    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.activity_menu, menu);


        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){
        if(item.getItemId() == R.id.share){
            ApplicationInfo applicationInfo = getApplicationContext().getApplicationInfo();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,"Shared");
            startActivity(Intent.createChooser(intent, "Share Via"));
        }
        switch (item.getItemId()) {
            case R.id.about:
                Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting:
                Toast.makeText(MainActivity.this, "Settings Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
