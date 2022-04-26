package com.example.firebasetemplate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterImages extends RecyclerView.Adapter<AdapterImages.ViewHolderImages> {
    ArrayList<Integer>images;
    String name;
    String contenido;

    public AdapterImages(ArrayList<Integer> images, String name,String contenido) {
        this.images = images;
        this.name = name;
        this.contenido=contenido;
    }

    @Override
    public ViewHolderImages onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_post,null,false);
        return new ViewHolderImages(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderImages holder, int position) {
    holder.textViewname.setText(name);
    holder.imageView.setImageResource(images.get(position));
    holder.textViewcontenido.setText("contenido");
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolderImages extends RecyclerView.ViewHolder {
        TextView textViewname;
        TextView textViewcontenido;
        ImageView imageView;

        public ViewHolderImages(@NonNull View itemView) {
            super(itemView);
            textViewname=itemView.findViewById(R.id.autor);
            imageView=itemView.findViewById(R.id.imagen);
            textViewcontenido=itemView.findViewById(R.id.contenido);

        }
    }
}
