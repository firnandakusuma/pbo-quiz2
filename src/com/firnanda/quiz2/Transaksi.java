package com.firnanda.quiz2;

import java.util.ArrayList;

public class Transaksi {
    private final String kode;
    private ArrayList<Item> t = new ArrayList();
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
        for(Item item : this.t){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    public String Pembayaran(){
        setTotal();
        String ob = "";
        ob += "Kode\t\t : " + this.kode + "\n";
        ob += "Daftar Belanja : \n";
        for(Item item : this.t){
            ob += "\t" + item.getNama() + "(" + item.getJumlah() + ") : " + item.getTotal() + "\n";
        }
        ob += "Total\t\t : " + this.total;
        return ob;
    }
}
