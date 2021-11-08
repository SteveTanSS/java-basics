package com.ss.day5;
import static org.junit.Assert.*;

import org.junit.Test;

public class CommasTest {

	
	@Test
	public void testCommas() {
		int[] arr = {2,3};
		Lambdas.getCommaSeperatedString(arr);
		assertEquals(Lambdas.getCommaSeperatedString(arr),"e2,o3");
		
		arr[1] = 44;
		assertEquals(Lambdas.getCommaSeperatedString(arr),"e2,e44");
	}

}
