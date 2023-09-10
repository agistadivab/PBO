/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soalio;

//Agista Diva Briliani 221511038
import java.util.Scanner;
import java.io.*;

public class SoalIO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        scan.close();
        
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
        
            for (String str : strings)
                System.out.println(str);
        }
    }
}
