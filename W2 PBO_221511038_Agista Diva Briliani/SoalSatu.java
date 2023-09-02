/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soalsatu;

/**
 *
 * @author agist
 */

import java.util.Scanner;
        
public class SoalSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            long n;
            System.out.print("Input Nilai:");
            n=input.nextLong();
        
            if (n<127 && n>-128){
            System.out.println(""+n+"byte");
        }
            if (n<= Short.MAX_VALUE && n >= Short.MIN_VALUE){
            System.out.println(""+n+"short");
        }
            if (n<= Long.MAX_VALUE && n >= Long.MIN_VALUE){
            System.out.println(""+n+"long");
        }
            else { 
            System.out.print("error");
        }
    }
}
