/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintthings;

/**
 *
 * @author agist
 */
public class Cylinder extends Shape {

	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	
	public double area() {
		
		return Math.PI*(Math.pow(radius, 2))*height;
	}
	
	public String toString() {
		
		return super.toString() + " of radius " + radius + " and height " +height;
	}
}
