/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantmain;

/**
 *
 * @author agist
 */
class Makanan {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public Makanan() {
		nama_makanan = "";
		harga_makanan = 0;
		stok = 0;
		
	}
		
	public String getNama_makanan ( ) {
		return nama_makanan;
	}
		
	public void setNama_makanan (String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	
	public double getHarga_makanan() {
		return harga_makanan;
	}
	
	public void setHarga_makanan (double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	
	public int getStok() {
		return stok;
	}
	
	public void setStok (int stok) {
		this.stok = stok;
	}
}