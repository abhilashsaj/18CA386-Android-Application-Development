package com.example.songlist;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class CustomAdapter extends BaseAdapter{
    Context context;
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

    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.list_row, null);
        TextView title = (TextView) view.findViewById(R.id.title);
        TextView artist = (TextView) view.findViewById(R.id.artist);
        ImageView icon = (ImageView) view.findViewById(R.id.list_image);
        title.setText(titleList[i]);
        artist.setText(artistList[i]);
        icon.setImageResource(imageList[i]);
        return view;
    }

}
