/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soallima;

/**
 *
 * @author agist
 */
import java.util. *;

public class SoalLima {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A1 = scn.nextLine();
        String A2 = scn.nextLine();
        String Upper1 = A1.substring(0,1);
        Upper1 = Upper1.toUpperCase();
        String Remain1 = A1.substring(1, A1.length());
        String Final1 = Upper1 + Remain1;
        String Upper2 = A2.substring(0,1);
        Upper2= Upper2.toUpperCase();
        String Remain2 = A2.substring(1,A2.length());
        String Final2 = Upper2 + Remain2;
        
        System.out.println(Final1.length() + Final2.length());
        System.out.println(Final1.compareTo(Final2)>0?"Yes":"No");
        System.out.println(Final1 + " " + Final2);
    }
}
