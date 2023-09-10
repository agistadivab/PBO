/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soalarray;

/**
 *
 * @author agist
 */
import java.util.Arrays;

public class SoalArray {

    public static void main(String[] args) {
        //One DImensional
        int[] firstArray = {2,5,3};
        int[] secondArray = {9,5,3};
        int[] thirdArray = {2,4,9};
        int[] fourthArray = {10,11,12};
        int[] fifthArray = {13,14, 15};
        int[] sixthArray = {16,17,18};
        int[] seventhArray = {19, 20, 21};
        int[] eightArray = {22, 23, 24};
        int[] ninthArray = {25,26,27};
        
        //Two Dimensional
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eightArray, ninthArray};
        
        //Three Dimensional
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
        
        for(int a=0; a<3; a++) {
            System.out.print(" {");
            
            for(int b=0; b<3; b++){
                System.out.print(" {");
                
                for(int c=0; c<3; c++) {
                    System.out.print(threeDimensionalArray[a][b][c] + " ");
                }
                System.out.print("}");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
