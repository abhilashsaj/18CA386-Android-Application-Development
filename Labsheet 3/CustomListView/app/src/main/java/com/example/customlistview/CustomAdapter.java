package com.example.customlistview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    String emailList[];
    String phoneList[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] countryList, String emailList[],String phoneList[], int[] flags) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        this.emailList = emailList;
        this.phoneList = phoneList;

        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        TextView email = (TextView) view.findViewById(R.id.textView2);
        TextView number = (TextView) view.findViewById(R.id.textView3);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(countryList[i]);
        email.setText(emailList[i]);
        number.setText(phoneList[i]);
        icon.setImageResource(flags[i]);
        return view;
    }

}