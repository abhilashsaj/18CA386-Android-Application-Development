package com.example.songlist;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;


public class CustomAdapter extends BaseAdapter{
    private Context context;
    int imageList[] ;
    String titleList[] ;
    String artistList[] ;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, int[] imageList, String titleList[],String artistList[]) {
        this.context = context;
        this.imageList = imageList;
        this.titleList = titleList;
        this.artistList = artistList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    public int getCount() {
        return imageList.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.list_row, null);
        View holder = view;
        TextView title = (TextView) view.findViewById(R.id.title);
        TextView artist = (TextView) view.findViewById(R.id.artist);
        ImageView icon = (ImageView) view.findViewById(R.id.list_image);
        ImageView arrow = (ImageView) view.findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent in = new Intent(v.getContext(), SongDetails.class);
                // passing array index
                Bundle b = new Bundle();

                // Storing data into bundle
                b.putString("title", titleList[i]);
                b.putString("author", artistList[i]);
                b.putInt("image", imageList[i]);

                // Creating Intent object
                in.addFlags(FLAG_ACTIVITY_NEW_TASK);

                // Storing bundle object into intent
                in.putExtras(b);

//                context.startActivity(in);
                v.getContext().startActivity(in);
            }
        });


        title.setText(titleList[i]);
        artist.setText(artistList[i]);
        icon.setImageResource(imageList[i]);
        return view;
    }

}
