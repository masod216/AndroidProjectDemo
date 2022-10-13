package com.example.crunchburgerhouse.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crunchburgerhouse.R;
import com.example.crunchburgerhouse.adapters.HomeHorAdapter;
import com.example.crunchburgerhouse.adapters.HomeVerAdapter;
import com.example.crunchburgerhouse.adapters.UpdaterVerticalRec;
import com.example.crunchburgerhouse.models.HomeHorModel;
import com.example.crunchburgerhouse.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdaterVerticalRec {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    //////Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        /////////////////////////Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.chickenlogo,"צ'יקן"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"המבורגר"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes,"נשנושים"));
        homeHorModelList.add(new HomeHorModel(R.drawable.shawarmalogo,"שווארמה"));
        homeHorModelList.add(new HomeHorModel(R.drawable.drinkinglogo,"שתיה"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        /////////////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(), list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }
}