package com.ss.day1;
import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
        int counter = 0;
        int random = 1 + (int)(Math.random()*100);
        Scanner myScan = new Scanner(System.in);
        //while loop to keep track of number of guesses
        while (counter < 5){

            System.out.println("Please type in a number between 1 and 100");
            int guess = myScan.nextInt();

            //break statement if number is within range
            if (guess >= random - 10 && guess <= random +10){
                System.out.println(random);
                break;
            }
            counter++;
        }
        //only output if we broke the loop naturally and not with a break statement
        if (counter == 5){
            System.out.println("Sorry answer was " + random );
        }
        myScan.close();
    }
}
