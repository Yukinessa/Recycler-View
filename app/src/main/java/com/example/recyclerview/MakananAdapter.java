package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {
    List<Makanan> makanansData = new ArrayList<>();
    Context context;

    public MakananAdapter(Context context ){
        this.context = context;
    }
    public void setMakanansData(List<Makanan>makanansData){
        this.makanansData=makanansData;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int Layout = R.layout.makananinformation;
        View v = LayoutInflater.from(parent.getContext()).inflate(Layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Makanan makanan = makanansData.get(position);
        holder.makananDetail(makanan);
    }

    @Override
    public int getItemCount() {
        return makanansData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView makananName,makananHarga;
        View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            makananName = itemView.findViewById(R.id.makananName);
            makananHarga = itemView.findViewById(R.id.makananHarga);
            view = itemView;
        }

        public void makananDetail(Makanan makanan){
            String makananNama = makanan.getNamaMakanan();
            String makananPrice = makanan.getHargaMakanan();
            makananName.setText(makananNama);
            makananHarga.setText(makananPrice);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(context, detailMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("nama", makananName.getText().toString());
                    bundle.putString("harga", makananHarga.getText().toString());
                    it.putExtras(bundle);
                    context.startActivity(it);
                }
            });
        }
    }
}
