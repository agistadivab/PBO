/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soalbignumber;

/**
 *
 * @author agist
 */

import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;

public class SoalBigNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String a, b;
        a = scan.nextLine();
        b = scan.nextLine();
        scan.close();
        
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    }
}
