package com.example.apnagharashram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.apnagharashram.Fragments.AboutUsFragment;
import com.example.apnagharashram.Fragments.DonationFragment;
import com.example.apnagharashram.Fragments.FeedTopDonaterFragment;
import com.example.apnagharashram.Fragments.HomeFragment;
import com.example.apnagharashram.Fragments.MyProfileFragment;
import com.example.apnagharashram.databinding.ActivityMainBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {

//    Creating the Binding Method
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        Finding & Placing Up the Toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        To load the Fragment Initially By Default Home
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.FragmentView,new HomeFragment());
        binding.toolbar.setVisibility(View.GONE);
        transaction.commit();

//        Calling Out The Binding Funtion
        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

//                Using Switch & Case To change the fragments
                switch (i) {
                    case 0:
                        transaction.replace(R.id.FragmentView,new HomeFragment());
                        binding.toolbar.setVisibility(View.GONE);
                        break;
                    case 1:
                        transaction.replace(R.id.FragmentView,new FeedFragment());
                        binding.toolbar.setVisibility(View.GONE);
                        break;
                    case 2:
                        transaction.replace(R.id.FragmentView,new DonationFragment());
                        binding.toolbar.setVisibility(View.GONE);
                        break;
                    case 3:
                        transaction.replace(R.id.FragmentView,new AboutUsFragment());
                        binding.toolbar.setVisibility(View.GONE);
                        break;
                    case 4:
                        transaction.replace(R.id.FragmentView,new MyProfileFragment());
                        binding.toolbar.setVisibility(View.GONE);
                        break;
                }
                transaction.commit();
            }
        });
    }
}