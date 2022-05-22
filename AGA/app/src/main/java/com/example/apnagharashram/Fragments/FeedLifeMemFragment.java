package com.example.apnagharashram.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apnagharashram.Adapter.Life_mem_rv_adapter;
import com.example.apnagharashram.Adapter.Top_donater_rv_adapter;
import com.example.apnagharashram.Model.Life_mem_rv_model;
import com.example.apnagharashram.Model.Top_donater_rv_model;
import com.example.apnagharashram.R;

import java.util.ArrayList;


public class FeedLifeMemFragment extends Fragment {

    RecyclerView rvlifemember;
    ArrayList<Life_mem_rv_model> list;

    public FeedLifeMemFragment() {
        // Required empty public constructor
    }

    public static FeedLifeMemFragment newInstance(String param1, String param2) {
        FeedLifeMemFragment fragment = new FeedLifeMemFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feed_life_mem, container, false);

        rvlifemember = view.findViewById(R.id.rvlifemember);
        list = new ArrayList<>();

        list.add(new Life_mem_rv_model(R.drawable.userimage," Tushar Gupta","9927013215","Software Engineer"));
        list.add(new Life_mem_rv_model(R.drawable.userimage," Tushar Gupta","9927013215","Software Engineer"));
        list.add(new Life_mem_rv_model(R.drawable.userimage," Tushar Gupta","9927013215","Software Engineer"));
        list.add(new Life_mem_rv_model(R.drawable.userimage," Tushar Gupta","9927013215","Software Engineer"));
        list.add(new Life_mem_rv_model(R.drawable.userimage," Tushar Gupta","9927013215","Software Engineer"));
        list.add(new Life_mem_rv_model(R.drawable.userimage," Tushar Gupta","9927013215","Software Engineer"));

        Life_mem_rv_adapter life_mem_rv_adapter = new Life_mem_rv_adapter(list,getContext());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rvlifemember.setLayoutManager(layoutManager);
        rvlifemember.setNestedScrollingEnabled(false);
        rvlifemember.setAdapter(life_mem_rv_adapter);

        return view;
    }
}