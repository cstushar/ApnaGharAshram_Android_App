package com.example.apnagharashram.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apnagharashram.Model.Life_mem_rv_model;
import com.example.apnagharashram.R;

import java.util.ArrayList;

public class Life_mem_rv_adapter extends RecyclerView.Adapter<Life_mem_rv_adapter.viewHolder>{

    ArrayList<Life_mem_rv_model> list;
    Context context;

    public Life_mem_rv_adapter(ArrayList<Life_mem_rv_model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rvlifemember,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Life_mem_rv_model model = list.get(position);

        holder.profile_img.setImageResource(model.getProfile_img());
        holder.username.setText(model.getUsername());
        holder.userphoneno.setText(model.getUserphoneno());
        holder.userbusiness.setText(model.getUserbusiness());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView profile_img;
        TextView username, userphoneno,userbusiness;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            profile_img = itemView.findViewById(R.id.profile_image);
            username = itemView.findViewById(R.id.rvusername);
            userphoneno = itemView.findViewById(R.id.rvphoneno);
            userbusiness = itemView.findViewById(R.id.rvbusiness);
        }
    }
}
