package com.example.crunchburgerhouse.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crunchburgerhouse.R;
import com.example.crunchburgerhouse.adapters.FeaturedAdapter;
import com.example.crunchburgerhouse.adapters.FeaturedVerAdapter;
import com.example.crunchburgerhouse.models.FeaturedModel;
import com.example.crunchburgerhouse.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {


    //////////////////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;


    //////////////////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelsList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);



        //////////////////////Featured Hor RecyclerView

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.burgerstek,"המבורגר", "המבורגר של הבית"));
        featuredModelsList.add(new FeaturedModel(R.drawable.shawarma,"שווארמה ", "שווארמה בפיתה או בצלחת"));
        featuredModelsList.add(new FeaturedModel(R.drawable.chikencrispi,"צ'יקן ", "קריספי צ'יקן"));

        featuredAdapter = new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);

        //////////////////////Featured Ver RecyclerView

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelsList = new ArrayList<>();

        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.chips,"ציפס וטבעות בצל ","ציפס וטבעות בצל עם צידר","4.8","10:00-23:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.burgerx2,"המבורגר","דאבל בורגר","4.8","10:00-23:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.chikenbarbkyou,"צ'יקן","צ'יקן ברבקיו","4.8","10:00-23:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelsList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}