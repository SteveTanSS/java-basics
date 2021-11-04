package com.ss.day2;

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	//Calculate the area with length * width
	@Override
	public double calculateArea() {
		
		return length * width;
	}

	@Override
	public void display() {
		System.out.println("I am a rectangle");

	}

}
