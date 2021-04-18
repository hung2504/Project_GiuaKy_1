package com.example.project_giuaky_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityC extends AppCompatActivity {
    private ListView lvClothes;
    private ArrayList<Clothes> listClothes;
    private ListAdapter adapterList;
    private Button btnCheckout;
    private Clothes c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c);

        listClothes = new ArrayList<>();
        btnCheckout = findViewById(R.id.btnCheck);

        if (savedInstanceState != null) {
//            c = (Clothes) savedInstanceState.getSerializable("list");
            Log.e("llll",savedInstanceState.getString("list"));
        }

        Intent intent = getIntent();
        Clothes cloth = (Clothes) intent.getSerializableExtra("cloth");
        cloth.setSoLuong(intent.getStringExtra("sl"));
        cloth.setSize(intent.getStringExtra("size"));


        listClothes.add(cloth);
//        listClothes.add(c);
        adapterList = new ListAdapter(MainActivityC.this,R.layout.listview_item,listClothes);
        lvClothes = findViewById(R.id.lvCart);
        lvClothes.setAdapter(adapterList);

        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivityC.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("loi","OK");
        outState.putString("list", "Ok");
    }

}