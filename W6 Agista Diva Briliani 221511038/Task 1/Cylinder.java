/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testcylinder;
//Agista Diva Briliani 221511038
public class Cylinder extends Circle {
    private double height;
	 
	public Cylinder() {
		super();
		height = 1.0; 
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	 
		public double getHeight() {
			return height; 
	}
	 
	public double getVolume() {
		return getArea()*height; 
	}
	
        //override
	public double getArea() {
		return (2 * Math.PI * getRadius() * getHeight()) + (2 * super.getArea());
	}
	
	@Override
	public String toString( ) {
		return "Cylinder: subclass of " + super.toString() + " Height= " + height;
	}
}
