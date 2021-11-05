package com.ss.day4;

public class Line {

	public Line() {
		
	}

	
	public double getSlope(double x, double y) {
		
		return y/x;
		
	}

	//gets the distance between two points using the square root function
	public double getDistance(double x1, double y1, double x2, double y2) {
		
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
	
	/* Parallel to checks based on the two slopes I use absolute value
	to make sure the difference is positive then compare with delta to determine if they are equal
	*/
	public boolean parrallelTo(double x1, double y1, double x2, double y2) {
		
		if (y1/x1 == y2/x2)
			return true;
		else
			return false;
		
	}
	
	
	}
