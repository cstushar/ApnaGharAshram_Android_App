package com.example.apnagharashram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apnagharashram.Model.Recently_donated_rv_model;
import com.example.apnagharashram.R;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class Recently_donated_rv_adapter extends RecyclerView.Adapter<Recently_donated_rv_adapter.viewHolder>{

    ArrayList<Recently_donated_rv_model> list;
    Context context;

    public Recently_donated_rv_adapter(ArrayList<Recently_donated_rv_model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recently_donated_rv_design,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Recently_donated_rv_model model = list.get(position);
        holder.user_profile_pic.setImageResource(model.getUser_profile_pic());
        holder.Donation_type.setText(model.getDonation_type());
        holder.Donater_name.setText(model.getDonater_name());
        holder.Donation_date.setText(model.getDonation_date());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView user_profile_pic;
        TextView Donation_type,Donater_name,Donation_date;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            user_profile_pic = itemView.findViewById(R.id.user_profile_pic);
            Donation_type = itemView.findViewById(R.id.Donation_type);
            Donater_name = itemView.findViewById(R.id.Donater_name);
            Donation_date = itemView.findViewById(R.id.Donation_date);

        }
    }
}
