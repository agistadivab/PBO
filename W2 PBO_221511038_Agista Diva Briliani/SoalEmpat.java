/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soalempat;

/**
 *
 * @author agist
 */
public class SoalEmpat {
    
    static short methodOne(long f)
    {    
        int i = (int) 10;
        return (short)i;
    }
    
    public static void main(String[] args) {
        
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
