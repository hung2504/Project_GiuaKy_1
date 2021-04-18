package com.example.project_giuaky_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<Clothes> clothesList;
    private AdapterClothes mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clothesList = new ArrayList<>();
        clothesList.add(new Clothes(R.drawable.computer_engineer,"Galaxy","14$"));
        clothesList.add(new Clothes(R.drawable.download,"GoogleB","14$"));
        clothesList.add(new Clothes(R.drawable.google,"Google","14$"));
        clothesList.add(new Clothes(R.drawable.images,"Galaxy","14$"));
        clothesList.add(new Clothes(R.drawable.worlds_best_developer,"Galaxy","14$"));
        clothesList.add(new Clothes(R.drawable.yellow_google,"Galaxy","14$"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new AdapterClothes(clothesList);
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter.setOnClickListener(new AdapterClothes.OnClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, MainActivityB.class);
                intent.putExtra("clothes",clothesList.get(position));
                startActivity(intent);
            }
        });
    }
}