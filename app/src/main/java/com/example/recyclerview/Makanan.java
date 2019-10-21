package com.example.recyclerview;

public class Makanan {
    private String namaMakanan,hargaMakanan;

    public Makanan(String namaMakanan, String hargaMakanan){
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMakanan(){
        return namaMakanan;
    }

    public String getHargaMakanan(){
        return hargaMakanan;
    }
}
