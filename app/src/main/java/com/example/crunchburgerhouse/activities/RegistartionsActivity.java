package com.example.crunchburgerhouse.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.crunchburgerhouse.MainActivity;
import com.example.crunchburgerhouse.R;

public class RegistartionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartions);
    }

    public void login(View view) {
        startActivity(new Intent(RegistartionsActivity.this, LoginActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(RegistartionsActivity.this, MainActivity.class));

    }
}