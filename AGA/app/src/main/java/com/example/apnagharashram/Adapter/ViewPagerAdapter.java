package com.example.apnagharashram.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.apnagharashram.Fragments.FeedLifeMemFragment;
import com.example.apnagharashram.Fragments.FeedTopDonaterFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new FeedTopDonaterFragment();
            case 1:return new FeedLifeMemFragment();
            default:return new FeedTopDonaterFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        if (position == 0){
            title = "TOP DONATER";
        }
        else if (position == 1){
         title = "AJEEVAN SADASYATA";
        }

        return title;
    }
}
