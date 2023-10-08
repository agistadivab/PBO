/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;
//Agista Diva Briliani 221511038
public class Square extends Rectangle {
    private double side;
	
	public Square() {
		
		super();
	}
	
	public Square(double side) {
		
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		
		super(side, side, color, filled);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side) {
		
		setSide(side);
	}
	
	public void setWidth(double side) {
		
		setSide(side);
	}
	
	@Override
	public String toString() {
		
		return "A Square with side = " + side + " and " + " which is a subclass of " + super.toString();
	}
	
	@Override
	public double getPerimeter() {
		return 4*getSide();
        }
}
