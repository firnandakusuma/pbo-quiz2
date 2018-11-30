package com.firnanda.quiz2;

import java.util.ArrayList;
import java.util.HashMap;

public class NewBarang {
    private HashMap<String, Float> items = new HashMap<>();
    
    public NewBarang(){
        this.items.put("Gula", new Float(20000));
        this.items.put("Kopi", new Float(5000));
        this.items.put("Susu", new Float(15000));
    }
    
    public ArrayList<String> getJenisNama(){
        ArrayList<String> str = new ArrayList<>();
        for(String item : this.items.keySet()){
            str.add(item);
        }
        return str;
    }
    
    public ArrayList<Float> getHargaBarang(){
        ArrayList<Float> flt = new ArrayList<>();
        for(Float item : this.items.values()){
            flt.add(item);
        }
        return flt;
    }
    
    public void addItem(String nama, float harga){
        this.items.put(nama, harga);
    }
}
