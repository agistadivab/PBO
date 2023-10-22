/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weeklysales;

/**
 *
 * @author agist
 */
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		Comparable[] intList;
		int size;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many word do you want to sort? ");
		size = scan.nextInt();
		intList = new Comparable[size];
		
		System.out.println("\nEnter the word...");
		for (int i =0; i < size; i++)
			intList[i] = scan.nextLine();
		Sorting.selectionSort(intList);
		System.out.println("Your word in sorted order...");
		for ( int i = 0; i < size; i++)
			System.out.println(intList[i] + " ");
		System.out.println();
	}

}