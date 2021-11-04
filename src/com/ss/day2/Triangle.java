package com.ss.day2;

public class Triangle implements Shape {
	
	private double width;
	private double length;
	@Override
	public double calculateArea() {
		return width * length / 2;
	}
	
	@Override
	public void display() {
		System.out.println("I am a Triangle");
	}

}
