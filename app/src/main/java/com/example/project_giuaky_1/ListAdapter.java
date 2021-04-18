package com.example.project_giuaky_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    ArrayList<Clothes> arrayList;

    public ListAdapter(Context context, int layout, ArrayList<Clothes> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layout,null);

        Clothes clothes = arrayList.get(position);
        ImageView imageView = convertView.findViewById(R.id.images);
        TextView tvName = convertView.findViewById(R.id.tvNameList);
        TextView tvPrice = convertView.findViewById(R.id.tvPriceList);
        TextView tvSize = convertView.findViewById(R.id.tvSizeList);
        TextView tvSoluong = convertView.findViewById(R.id.tvSoLuong);

        imageView.setImageResource(clothes.getImgCloth());
        tvName.setText(clothes.getNameCloth());
        tvPrice.setText(clothes.getPriceCloth());
        tvSize.setText(clothes.getSize());
        tvSoluong.setText(clothes.getSoLuong());

        return convertView;
    }
}
