package com.ss.day2;

public class Assignment2 {

	static int mdArrTest[][] = {
	        {1,4,5,9},
	        {2,7,11,16},
	        {4,2,3,1},
	        {9,3,4,1},
	        {6,1,7,12},
	        {2,3,4,5},
	        {1,3,10,8}
	};

	public static void main(String[] args) {
		
		findLargest(mdArrTest);
		
	}
	
	static void findLargest(int[][] a){
		int posX = 0;
		int posY = 0;
	    int currentHighest = a[0][0];
	        
	    for (int i = 0; i < a.length; i++ ) {
	    	for (int j = 0; j < a[i].length; j++) {
	    		
	    		//if the current index value is higher than the current highest log the indexes
	    		if (a[i][j] > currentHighest) {
	    			posX = i;
	    			posY = j;
	    			currentHighest = a[i][j];	
	    		}
	    	}  	
	    }
	   //print out location and highest number
	  System.out.println("The Max Number is " + currentHighest + ", Its indicies are " + posX + "," + posY);
	}
}
