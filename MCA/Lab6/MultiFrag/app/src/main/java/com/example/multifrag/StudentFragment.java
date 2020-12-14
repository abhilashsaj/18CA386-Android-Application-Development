package com.example.multifrag;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import android.app.Fragment;

public class StudentFragment extends Fragment  {
    ImageView image;
    TextView name, roll;
    View view;
    public StudentFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_fragment, container, false);
        image = (ImageView) view.findViewById(R.id.imageView);
        name = (TextView) view.findViewById(R.id.nameText);
        roll = (TextView) view.findViewById(R.id.rollNo);


        Bundle bundle = getArguments();
        byte[] byteArray = bundle.getByteArray("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        image.setImageBitmap(bmp);
        name.setText(bundle.getString("name"));
        roll.setText(bundle.getString("roll"));
        return view;
    }



}