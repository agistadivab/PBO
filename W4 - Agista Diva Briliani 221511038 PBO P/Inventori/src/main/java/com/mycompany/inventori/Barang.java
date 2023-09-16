/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventori;
//Agista Diva Briliani 221511038
public class Barang {
    String kode_barang;
    String nama_barang;
    String barangs;
    private int stok;
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    public void addStok(int stok){
        this.stok += stok;
}
}
