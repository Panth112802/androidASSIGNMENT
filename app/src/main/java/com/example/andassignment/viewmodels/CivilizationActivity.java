package com.example.andassignment.viewmodels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andassignment.R;
import com.example.andassignment.viewmodels.ui.civilization.CivilizationFragment;

public class CivilizationActivity extends AppCompatActivity {
String UU;
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civilization_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CivilizationFragment.newInstance( name, UU))
                    .commitNow();
        }
    }
}
