package com.example.apnagharashram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apnagharashram.Model.Top_donater_rv_model;
import com.example.apnagharashram.R;

import java.util.ArrayList;

public class Top_donater_rv_adapter extends RecyclerView.Adapter<Top_donater_rv_adapter.viewHolder>{

    ArrayList<Top_donater_rv_model> list;
    Context context;

    public Top_donater_rv_adapter(ArrayList<Top_donater_rv_model> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rvtopdonater,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        Top_donater_rv_model model = list.get(position);

        holder.profileimg.setImageResource(model.getProfileimg());
        holder.username.setText(model.getUsername());
        holder.amount.setText(model.getAmount());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView profileimg ;
        TextView username , amount;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            profileimg = itemView.findViewById(R.id.profile_image);
            username = itemView.findViewById(R.id.rvusername);
            amount = itemView.findViewById(R.id.rvamount);


        }
    }
}
