package com.firnanda.quiz2;

import javax.swing.table.DefaultTableModel;

public class TableTransaksi extends DefaultTableModel{
    private String[] kolom;

    public TableTransaksi() {
        this.kolom = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }

    public String[] getKolom() {
        return kolom;
    }
    
    
}
