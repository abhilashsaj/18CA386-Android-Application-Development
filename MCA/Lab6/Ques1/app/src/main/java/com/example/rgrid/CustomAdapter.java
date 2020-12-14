package com.example.rgrid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;


class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Holder> {
    String[] names;
    String[] posi;
    int[] photo;
    Context context;
    public CustomAdapter(Context context, String[] name, String[] posi, int[] photo){
        this.context = context;
        this.names = name;
        this.posi = posi;
        this.photo = photo;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview, viewGroup, false);
        Holder holder = new Holder(view);
        return holder;
    }


    public void onBindViewHolder(@NonNull final Holder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.image.setImageResource(photo[i]);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bmp = BitmapFactory.decodeResource(view.getResources(), photo[i]);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                Intent intent = new Intent(context, Details.class);
                intent.putExtra("name", names[i]);
                intent.putExtra("image", byteArray);
                intent.putExtra("awards", " Oscar 2");
                intent.putExtra("nominees", "Oscar 5");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return names.length;
    }
    public class Holder extends RecyclerView.ViewHolder{
        ImageView image;
        public Holder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
