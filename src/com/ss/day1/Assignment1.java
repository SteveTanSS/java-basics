/*
Steve Tan
11/02/2021

Print out the following patterns using loops

1)
*
**
***
****
.........
2)
..........
****
***
**
*
3)
     *
    ***
   *****
  *******
...........
4)
............
  *******
   *****
    ***
     *

*/
package com.ss.day1;

public class Assignment1 {

	public static void main(String[] args) {
        System.out.println("1)");
        printStarsAscending(4);
        System.out.println("2)");
        printStarsDecsending(4);
        System.out.println("3)");
        printStarsPyramidAscending(4);
        System.out.println("4)");
        printStarsPyramidDescending(4);
    }
	
	//Method to print stars in ascending order
    static void printStarsAscending(int n){
        
        //two loops one for number of columns and one for number of stars
        for (int i = 0; i < n ; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println(".........");
    }
    
    //Method to print stars in descending order
    static void printStarsDecsending(int n){
        System.out.println(".........");

        //i is number of columns
        for (int i = 0; i < n; i++){
            //j is number of stars
            for (int j = n -1; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printStarsPyramidAscending(int n){

        int midpoint = 3;
        //i is the columns
        for (int i = 0; i < n ; i++){

            //j is the rows
            for (int j = 0; j < 7; j++){

                //if J is between the midpoint + or - i then print a * else print a space
                if (j >= midpoint-i && j <= midpoint + i) {
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(".........");
    }

    static void printStarsPyramidDescending(int n){
        System.out.println(".........");

        int midpoint = 3;
        //i is the columns
        for (int i = n - 1; i >= 0 ; i--){

            //j is the rows
            for (int j = 0; j < 7; j++){

                //if J is between the midpoint + or - i then print a * else print a space
                if (j >= midpoint-i && j <= midpoint + i) {
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
