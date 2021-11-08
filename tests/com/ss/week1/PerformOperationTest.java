package com.ss.week1;
import static com.ss.week1.PerformOperations.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class PerformOperationTest {

	@Test
	public void isOddTest() {
        assertEquals("odd", applyMethod(isOdd(), 1));
        assertEquals("odd", applyMethod(isOdd(), 9));
        assertEquals("even", applyMethod(isOdd(), 2));
		
	}
	@Test
	public void isPrimeTest() {
        assertEquals("composite", applyMethod(isPrime(), 16));
        assertEquals("prime", applyMethod(isPrime(), 3));
        assertEquals("prime", applyMethod(isPrime(), 7));

		
	}	
	@Test
	public void isPalindromeTest() {
        assertEquals("palindrome", applyMethod(isPalindrome(), 121));
        assertEquals("not palindrome", applyMethod(isPalindrome(), 112));
        assertEquals("palindrome", applyMethod(isPalindrome(), 98889));

	}	

}
