package com.example.apnagharashram.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apnagharashram.Adapter.Recently_donated_rv_adapter;
import com.example.apnagharashram.Model.Recently_donated_rv_model;
import com.example.apnagharashram.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recently_don_rv;
    ArrayList<Recently_donated_rv_model> list;


    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        recently_don_rv = view.findViewById(R.id.recently_donated_rv);

        list = new ArrayList<>();
        list.add(new Recently_donated_rv_model(R.drawable.userimage,"Food","Mr. Tushar","25/02/2022"));
        list.add(new Recently_donated_rv_model(R.drawable.userimage,"money","Mr. rk gupta","25/02/2022"));
        list.add(new Recently_donated_rv_model(R.drawable.userimage,"Food","Mr. dinanath","25/02/2022"));
        list.add(new Recently_donated_rv_model(R.drawable.userimage,"daily item","dr himani","25/02/2022"));
        list.add(new Recently_donated_rv_model(R.drawable.userimage,"Food","Mr. harsh","25/02/2022"));
        list.add(new Recently_donated_rv_model(R.drawable.userimage,"money","Mr. Tushar","25/02/2022"));
        list.add(new Recently_donated_rv_model(R.drawable.userimage,"Food","Mr. vinod","25/02/2022"));



        Recently_donated_rv_adapter rec_don_adapter = new Recently_donated_rv_adapter(list,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recently_don_rv.setLayoutManager(linearLayoutManager);
        recently_don_rv.setNestedScrollingEnabled(false);
        recently_don_rv.setAdapter(rec_don_adapter);
        return view;
    }
}