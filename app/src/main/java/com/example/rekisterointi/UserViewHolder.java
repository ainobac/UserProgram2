package com.example.rekisterointi;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView userName, userAla, userEmail;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        userName = itemView.findViewById(R.id.textViewName);
        userAla = itemView.findViewById(R.id.textViewAla);
        userEmail = itemView.findViewById(R.id.textViewEmail);
    }
}
