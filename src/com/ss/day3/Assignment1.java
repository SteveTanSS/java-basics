package com.ss.day3;

import java.io.File;

public class Assignment1 {
	
	//hardcoded a file path;
	static String filePath = "C:\\\\users\\\\steve\\\\oneDrive\\documents\\Programming";
	
	public static void main(String a[]) {
		//create a file object at the filepath
		File file = new File (filePath);
		
		try {
		displayFileNames(file);
		
		} catch (Exception NullPointerException) {
			System.out.println("The filepath was not valid");
		}		
	}

	//recursively opens all the list of files
	public static void displayFileNames(File dir) {
		//store a list of files
		File fileList[] = dir.listFiles();
		
		//for each item on the list do a if else statement
		for(File file : fileList){
			
			//if the item in the array is a file then display its name
			if (file.isFile()) {
				System.out.println(file.getName());				
			}
			
			//otherwise call the function recursively since it is a folder.
			else
				displayFileNames(file);

		}
		
	}
	
}
