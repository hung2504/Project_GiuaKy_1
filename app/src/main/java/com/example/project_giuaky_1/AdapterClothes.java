package com.example.project_giuaky_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClothes extends RecyclerView.Adapter<AdapterClothes.ClothesViewHolder> {
    private ArrayList<Clothes> clothesList;
    private OnClickListener mListener;

    public interface OnClickListener {
        void onItemClick(int position);
    }

    public void setOnClickListener(OnClickListener mListener) {
        this.mListener = mListener;
    }

    public AdapterClothes(ArrayList<Clothes> list){
        clothesList = list;
    }

    @NonNull
    @Override
    public ClothesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        ClothesViewHolder cvh = new ClothesViewHolder(v,mListener);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ClothesViewHolder holder, int position) {
        Clothes clothes = clothesList.get(position);

        holder.imgCloth.setImageResource(clothes.getImgCloth());
        holder.tvName.setText(clothes.getNameCloth());
        holder.tvPrice.setText(clothes.getPriceCloth());

    }

    @Override
    public int getItemCount() {
        return clothesList.size();
    }

    public static class ClothesViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCloth;
        private TextView tvName;
        private TextView tvPrice;

        public ClothesViewHolder(@NonNull View itemView, OnClickListener listener) {
            super(itemView);
            imgCloth = itemView.findViewById(R.id.imgCloth);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
