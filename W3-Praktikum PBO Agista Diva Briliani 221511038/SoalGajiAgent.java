/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soalgajiagent;

/**
 *
 * @author agist
 */

import java.io.*;
import java.util.Scanner;

public class SoalGajiAgent {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPenjualan = scan.nextInt(); 
        int gajiPokok = 500000;
        int hargaItem = 50000;
        int bonusPenjualan = totalPenjualan * (hargaItem * 10/100);
        int bonus = 0;
        
        if (totalPenjualan > 80) {
            bonus = totalPenjualan * (hargaItem * 10/100);
        } else if (totalPenjualan >= 40 && totalPenjualan < 80){
            bonus = totalPenjualan * (hargaItem * 25/100);
        } else if (totalPenjualan < 15){
            bonus = (totalPenjualan - 15) * (hargaItem * 15/100);
            bonusPenjualan = 0;
        }
        
        int totalGaji = gajiPokok + bonusPenjualan + bonus;
        System.out.println(totalGaji);
    }
}

