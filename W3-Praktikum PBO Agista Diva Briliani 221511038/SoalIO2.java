/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soalio2;

//Agista Diva Briliani 221511038
import java.util.Scanner;

public class SoalIO2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("==============================");
        
        for(int i=0; i<3; i++){
            String n = s.next();
            int x = s.nextInt();
            System.out.printf("%-15s%03d%n", n, x);
        }
        
        System.out.println("==============================");
    }
}
