package com.ss.week1;

import java.util.function.Function;

public class PerformOperations {

	/* Params: int
	 * Return: odd or even
	 */
    public static Function<Integer, String> isOdd() {
        return num -> { if (num % 2 == 1) 
        	{ return "odd"; } 
        else 
        	{ return "even"; } };
    }
	
	/* Params: int
	 * Return: is prime or composite
	 */
    public static Function<Integer, String> isPrime() {
    	return num -> { if (num <= 1) 
    		{ return "composite"; }
    	else { for (int i = 2; i <= num / 2; ++i) {
    			if (num % i == 0) return "composite"; }
    	return "prime"; } };
    }
		

    

    
    
	/* Params: String
	 * Return: is a Palindrome or not
	 */
    public static Function<Integer, String> isPalindrome() {
    	
        // for loop reverses the int and sets it to reverse;
        // if/else then compares reverse to original number
        return num -> { int reverse = 0; int remainder; int originalNum = num;
                    for (; num != 0; num /= 10) {
                    	remainder = num % 10; reverse = reverse * 10 + remainder; 
                    }
                    if (reverse == originalNum) { 
                    	return "palindrome";
                    } 
                    else { 
                    	return "not palindrome"; 
                    } 
                    }; 
    }
    
    // functional interface method
    public static String applyMethod(Function<Integer, String> isMethod, int num) {
        return isMethod.apply(num);
    }
    
    public static void testFunction(int[] input) {
    	
    	//First input is the number of cases
    	int numTestCases = input[0];
       
        for(int i=0; i < numTestCases; i++) {
           
             // Switch so every odd numbered index in input (1, 3, 5) denotes which test
             switch (input[i * 2 + 1]) {
                 case 1:
                     // every even number in input (2, 4, 6) denotes which number to apply method to
                     System.out.println(PerformOperations.applyMethod(PerformOperations.isOdd(), input[i * 2 + 2]));
                     break;
                 case 2:
                     System.out.println(PerformOperations.applyMethod(PerformOperations.isPrime(), input[i * 2 + 2]));
                     break;
                 case 3:
                     System.out.println(PerformOperations.applyMethod(PerformOperations.isPalindrome(), input[i * 2 + 2]));
                     break;
             }
         }
    }
    
    public static void main(String[] args) {
        int[] input = {5, 1, 4, 2, 5, 3, 898, 1, 3, 2, 12};
        testFunction(input);
    }
    
    
}
