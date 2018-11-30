package com.firnanda.quiz2;

import java.util.ArrayList;

public class Transaksi {
    private final String kode;
    private ArrayList<Item> items = new ArrayList();
    private float total;

    public Transaksi(String kode) {
        this.kode = kode;
    }

    public Transaksi(String kode, float total) {
        this.kode = kode;
        this.total = total;
    }
    
    public void setTotal(){
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    public String Pembayaran(){
        setTotal();
        String obt = "";
        obt += "Kode\t\t : " + this.kode + "\n";
        obt += "Daftar Belanja : \n";
        for(Item item : this.items){
            obt += "\t" + item.getNama() + "(" + item.getJumlah() + ") : " + item.getTotal() + "\n";
        }
        obt += "Total\t\t : " + this.total;
        return obt;
    }
}
