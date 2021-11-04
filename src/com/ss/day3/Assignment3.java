package com.ss.day3;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Assignment3 {

	static String filePath = "C:\\\\users\\\\steve\\\\oneDrive\\documents\\Programming\\append.txt";
	
	//main method first we try to assign the users input to a char that we can pass to helper function
	
	public static void main(String args[]) throws IOException {
		
		try { 
			char userLetter = args[0].charAt(0);
			countLetters(filePath, userLetter);
			
			
        } catch (Exception e) {
        	System.out.println("Invalid argument");
        }

	}
	
	
	//helper function. Takes a file path as a string and the char to check.
	public static void countLetters(String fp, char l) {
		char userLetter = l;
		int count = 0;
		
		
		//start scanner object as null so we can close it later in a finally tag
		Scanner sc = null;
		
		//tries to scan the files for each line
		try {
			File file = new File(filePath);
			sc = new Scanner(file);
			
			
			//loops through the line and counts the number of times the letter appears in the line
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == userLetter) {
						count++;
					}
				}		
			}
			
		}catch (Exception e) {
			System.out.println("An error has occured");
			e.printStackTrace();
		}finally {
			if (sc != null) {
		        sc.close();
		    }
		}
		
		//outputs the number of times the letter repeats
		System.out.println("The letter you typed: " + userLetter + " Appeared " + count + " times" );
			
	}
}
	
