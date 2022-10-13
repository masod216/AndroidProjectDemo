package com.example.crunchburgerhouse.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crunchburgerhouse.R;
import com.example.crunchburgerhouse.models.HomeHorModel;
import com.example.crunchburgerhouse.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdaterVerticalRec updaterVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdaterVerticalRec updaterVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updaterVerticalRec = updaterVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizonal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position ) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.crunchchiken, "קריספי ציקן בשבילך", "10:00 -23:00", "4.9", "min - 35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.chikencrispi, "כנפיים עם רוטב ברבקיו", "10:00 -23:00", "4.9", "min - 35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.chikenbarbkyou, "כרעיים עם רוטב ברבקיו", "10:00 -23:00", "4.9", "min - 35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.chikenchider, "chicken 4", "10:00 -23:00", "4.9", "min - 35$"));

            updaterVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();


                    if(position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.crunchchiken, "קריספי ציקן בשבילך", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chikencrispi, "כנפיים עם רוטב ברבקיו", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chikenbarbkyou, "כרעיים עם רוטב ברבקיו", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chikenchider, "צלחת קריספית", "10:00 -23:00", "4.9", "min - 35$"));

                        updaterVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger01, "המבורגר עסיסי של הבית", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burgervegetables, "המבורגר עם יקרות על הפלאנצ'ה", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burgerhotdog, "המברוגר עם נקניה", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.doubleburgerchikder, "צ'יזבורגר", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burgerstek, "בורגר עם סטייק מעל", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.eegburger, "בורגר ביצת עין", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.eegburger, "בורגר שווארמה", "10:00 -23:00", "4.9", "min - 35$"));

                        updaterVerticalRec.callBack(position,homeVerModels);

                    }
                    else if(position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.chips, "ציפס וטבעות בצל", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.salat01, "סלט הבית", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "צ'יפס", "10:00 -23:00", "4.9", "min - 35$"));

                        updaterVerticalRec.callBack(position,homeVerModels);

                    }
                    else if(position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.shawarma, "מגשי שווארמה", "10:00 -23:00", "4.9", "min - 35$"));

                        updaterVerticalRec.callBack(position,homeVerModels);

                    }
                    else if(position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.water, "מים", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sprite, "ספריט", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sprzero, "ספריט זירו", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cocacola, "קוקה קולה", "10:00 -23:00", "4.9", "min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.zaro, "קולה זירו", "10:00 -23:00", "4.9", "min - 35$"));

                        updaterVerticalRec.callBack(position,homeVerModels);

                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else{
                if(row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);

                }
            }
        }

    @Override
    public int getItemCount() { return list.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
