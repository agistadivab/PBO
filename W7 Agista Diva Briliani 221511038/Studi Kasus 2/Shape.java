/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintthings;

/**
 *
 * @author agist
 */
abstract class Shape {
	
	private String shapeName;
	
	public Shape(String shapeName) {
		
		super();
		this.shapeName = shapeName;
	}
	
	public abstract double area();
	
	public String toString() {
		
		return "Shape Name : " + shapeName;
	}
}