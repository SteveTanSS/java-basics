package com.ss.day3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment2 {
	static String filePath = "C:\\\\users\\\\steve\\\\oneDrive\\documents\\Programming\\append.txt";
	
	public static void main(String a[]) throws IOException {
		
		//create a fire writer object using the file path given
		FileWriter fw = null;
		try {
			
			//write hello world to the file
		      fw = new FileWriter(filePath, true);
		      fw.write("hello world");
		      fw.close();
		      
		      //output if successful
		      System.out.println("Successfully appended");
			
		//catch exception with file path
		} catch(Exception e) {
			System.out.println("The filepath was not valid");
			
		} finally {
			if (fw != null) {
		        fw.close();
		    }
		}
		
	}
	
}
