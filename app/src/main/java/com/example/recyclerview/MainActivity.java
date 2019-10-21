package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Makanan>makananList;
    MakananAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        init();
    }

    private void init() {
        makananList = new ArrayList<Makanan>();
        adapter = new MakananAdapter(MainActivity.this);
        recyclerView.setAdapter(adapter);
        makananList.add(new Makanan("Pecel","Rp.15000"));
        makananList.add(new Makanan("Geprek","Rp.16000"));
        makananList.add(new Makanan("Ayam","Rp.17000"));
        adapter.setMakanansData(makananList);
        adapter.notifyDataSetChanged();
    }
}
