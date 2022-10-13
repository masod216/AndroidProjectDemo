package com.example.crunchburgerhouse.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.crunchburgerhouse.R;
import com.example.crunchburgerhouse.adapters.DetailedDailyAdapter;
import com.example.crunchburgerhouse.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter ;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type !=null && type.equalsIgnoreCase("chicken")){

            imageView.setImageResource(R.drawable.chiken1);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chiken1,"chicken","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chiken02,"chicken","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chiken03,"chicken","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chikenbarbkyou,"chicken","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.crunchchiken,"chicken","description","4.4","80$","10am to 22pm"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type !=null && type.equalsIgnoreCase("hamburger")){

            imageView.setImageResource(R.drawable.burgerx2);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burgerx2,"burger","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burgervegetables,"Hamburger","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burger01,"burger","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burger2,"burger","description","4.4","80$","10am to 22pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burgerhotdog,"burger","description","4.4","80$","10am to 22pm"));
            dailyAdapter.notifyDataSetChanged();
        }

    }
}