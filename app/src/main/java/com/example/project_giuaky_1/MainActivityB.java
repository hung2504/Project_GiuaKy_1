package com.example.project_giuaky_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityB extends AppCompatActivity {
    private ImageView imgCloth;
    private TextView tvName;
    private  TextView tvPrice;
    private ImageButton imgButS;
    private String size = "";
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        imgCloth = findViewById(R.id.imgCloth1);
        tvName = findViewById(R.id.tvname1);
        tvPrice = findViewById(R.id.tvPrice1);

        imgButS = findViewById(R.id.imgButtonS);
        btnAdd = findViewById(R.id.btnAdd);

        Intent intent = getIntent();
        Clothes clothes = (Clothes) intent.getSerializableExtra("clothes");
        imgCloth.setImageResource(clothes.getImgCloth());
        tvName.setText(clothes.getNameCloth());
        tvPrice.setText(clothes.getPriceCloth());

        imgButS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size = "S";
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivityB.this,MainActivityC.class);
                intent1.putExtra("cloth",clothes);
                intent1.putExtra("size","X");
                intent1.putExtra("sl","1");
                startActivity(intent1);
            }
        });
    }
}