package com.example.recyclerview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class detailMakanan extends AppCompatActivity {
    TextView NameMakanan, HargaMakanan;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.foto_makanan);
        NameMakanan = findViewById(R.id.namaDetail);
        HargaMakanan = findViewById(R.id.hargaDetail);

        NameMakanan.setText(getIntent().getStringExtra("nama"));
        HargaMakanan.setText(getIntent().getStringExtra("harga"));
    }
}
