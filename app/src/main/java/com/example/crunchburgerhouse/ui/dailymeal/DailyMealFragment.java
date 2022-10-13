package com.example.crunchburgerhouse.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crunchburgerhouse.R;
import com.example.crunchburgerhouse.adapters.DailyMealAdapter;
import com.example.crunchburgerhouse.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView ;
    List<DailyMealModel> dailyMealModels ;
    DailyMealAdapter dailyMealAdapter ;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container,false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.chikenbarbkyou,"קריספי ציקן","20% off","Description Description", "chicken"));
        dailyMealModels.add(new DailyMealModel(R.drawable.burgerx2,"המבורגר","20% off","Description Description","hamburger"));
        dailyMealModels.add(new DailyMealModel(R.drawable.shawarma,"שווארמה","20% off","Description Description","shawarma"));
        dailyMealModels.add(new DailyMealModel(R.drawable.salat01,"סלטים","20% off","Description Description","salats"));
        dailyMealModels.add(new DailyMealModel(R.drawable.chips,"נשנוש","20% off","Description Description","dinner"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }
}