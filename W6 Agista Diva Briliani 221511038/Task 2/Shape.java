/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;
//Agista Diva Briliani 221511038
public class Shape {
    private String color;
	private boolean filled;
	
	public Shape() {
		
		this.setColor("red");
		this.setFilled(true);
	}
	
	public Shape(String color, boolean filled) {
		
		this.setColor(color);
		this.setFilled(filled);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		
		return "A shape with color of " + color + "and " + (filled ? "Filled" : "Not Filled");
	}
}
