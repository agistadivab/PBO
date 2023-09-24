/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.restaurantmain;
//Agista Diva Briliani 221511038
import java.util.Scanner;
public class RestaurantMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String nama_makananBeli;
		int jumlah;
		
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		System.out.println("MENU");
		menu.tampilMenuMakanan();
		
		System.out.println(" ");
		System.out.print("Makanan: ");
		nama_makananBeli = scan.nextLine();
		
		System.out.print("jumlah: ");
		jumlah = scan.nextInt();
		
		System.out.println(" ");
		System.out.println("Makanan yang dibeli: ");
		menu.transaksi(nama_makananBeli, jumlah);
		
		System.out.println(" ");
		System.out.println("STOK TERSISA");
		menu.tampilMenuMakanan();
	}

}