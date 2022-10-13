package com.example.crunchburgerhouse.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crunchburgerhouse.R;
import com.example.crunchburgerhouse.adapters.CartAdapter;
import com.example.crunchburgerhouse.models.CartModel;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.chikenbarbkyou,"צ'יקן 1","₪30","4.3"));
        list.add(new CartModel(R.drawable.cocacola,"קוקה קולה","₪8","4.3"));
        list.add(new CartModel(R.drawable.burgerx2,"דאבל בורגר 1","₪90","4.3"));
        list.add(new CartModel(R.drawable.chips,"צ'יפס 1","₪30","4.3"));
        list.add(new CartModel(R.drawable.shawarma,"שווארמה 1 ","₪40","4.3"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}