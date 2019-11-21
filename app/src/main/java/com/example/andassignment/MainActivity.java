package com.example.andassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andassignment.R;

RecyclerView CivilizationActivity ;
        RecyclerView.Adapter CivilizationsAdapter;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    mPokemonList = findViewById(R.id.rv);
       mPokemonList.hasFixedSize();
       mPokemonList.setLayoutManager(new LinearLayoutManager(this));

    mPokemonAdapter = new PokemonAdapter();
       mPokemonList.setAdapter(mPokemonAdapter);
}
