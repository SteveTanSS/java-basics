package com.ss.day2;
import java.lang.Math.*;

public class Circle implements Shape {

	private double radius;
	@Override
	public double calculateArea() {
		
		return radius * radius * Math.PI;
	}

	@Override
	public void display() {
		System.out.println("I am a circle");
	}

}
