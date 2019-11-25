package com.example.andassignment;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

import com.example.andassignment.models.Civilization;


public class MainActivity extends AppCompatActivity implements CivilizationsAdapter.OnListItemClickListener{

    RecyclerView mCivilizationsList;
    RecyclerView.Adapter mCivilizationsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Civilization> civilization = new ArrayList<>();


        mCivilizationsList = findViewById(R.id.rv);
        mCivilizationsList.hasFixedSize();
        mCivilizationsList.setLayoutManager(new LinearLayoutManager(this));
        mCivilizationsAdapter = new CivilizationsAdapter(civilization,this);
                mCivilizationsList.setAdapter(mCivilizationsAdapter);

    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        int civilizationNumber= clickedItemIndex + 1;
        Toast.makeText(this, "Civilization Number: " + civilizationNumber, Toast.LENGTH_SHORT).show();
    }


}
