package com.example.apnagharashram.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.apnagharashram.Adapter.Top_donater_rv_adapter;
import com.example.apnagharashram.Model.Top_donater_rv_model;
import com.example.apnagharashram.R;
import com.example.apnagharashram.databinding.ActivityMainBinding;
import com.example.apnagharashram.databinding.FragmentFeedTopDonaterBinding;

import java.util.ArrayList;

public class FeedTopDonaterFragment extends Fragment {

//    FragmentFeedTopDonaterBinding binding;
    RecyclerView rvtopdonater;
    ArrayList<Top_donater_rv_model> top_donater_rv_model_list;

    public FeedTopDonaterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //On click Button
//        binding = FragmentFeedTopDonaterBinding.inflate(inflater,container,false);
//        binding.lmbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FeedLifeMemFragment feedLifeMemFragment = new FeedLifeMemFragment();
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.feedframeLayout,feedLifeMemFragment);
//                transaction.commit();
//            }
//        }
//        ); return binding.getRoot();

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_feed_top_donater, container, false);

        rvtopdonater = view.findViewById(R.id.rvtopdonater);
        top_donater_rv_model_list = new ArrayList<>();

        top_donater_rv_model_list.add(new Top_donater_rv_model(R.drawable.userimage," Gupta","10000"));
        top_donater_rv_model_list.add(new Top_donater_rv_model(R.drawable.userimage,"Ram Kumar Gupta","10000"));
        top_donater_rv_model_list.add(new Top_donater_rv_model(R.drawable.userimage," Gupta","10000"));
        top_donater_rv_model_list.add(new Top_donater_rv_model(R.drawable.userimage,"Ram Kumar Gupta","10000"));
        top_donater_rv_model_list.add(new Top_donater_rv_model(R.drawable.userimage," Gupta","10000"));
        top_donater_rv_model_list.add(new Top_donater_rv_model(R.drawable.userimage,"Ram Kumar Gupta","10000"));
        top_donater_rv_model_list.add(new Top_donater_rv_model(R.drawable.userimage,"Ram Kumar Gupta","10000"));

        Top_donater_rv_adapter Top_donater_rv_adapter = new Top_donater_rv_adapter(top_donater_rv_model_list,getContext());
        
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rvtopdonater.setLayoutManager(layoutManager);
        rvtopdonater.setNestedScrollingEnabled(false);
        rvtopdonater.setAdapter(Top_donater_rv_adapter);

        return view;

    }



}

