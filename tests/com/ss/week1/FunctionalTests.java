package com.ss.week1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FunctionalTests {

    @Test
    public void rightmostDigitTest() {
    	List<Integer> rightMostNums = Arrays.asList(1, 2, 3);
    	List<Integer> list = Arrays.asList(21, 62, 93);
        assertEquals(Functional.rightmostDigit(list), rightMostNums);
    }

    @Test
    public void multiplyBy2Test() {
    	List<Integer> doubledList = Arrays.asList(42, 124, 186);
    	List<Integer> list = Arrays.asList(21, 62, 93);
        assertEquals(Functional.multiplyBy2(list), doubledList);
    }

    @Test
    public void removeXTest() {
    	List<String> list = Arrays.asList("Nax", "Saxophone", "xfactor");
    	List<String> listWithNoX = Arrays.asList("Na", "Saophone", "factor");
    	assertEquals(Functional.removeX(list), listWithNoX);
    }
    
    public void recursionTest() {
    	
    	int[] arr = {2, 4, 8};
    	assertEquals(Functional.groupSumClump(0, arr , 10), true);
    	
    	int[] arr2 = {1, 2, 4,8,1};
    	assertEquals(Functional.groupSumClump(0, arr2 , 14), true);
    	
    	int[] arr3 = {2, 4, 4,8};
    	assertEquals(Functional.groupSumClump(0, arr3 , 14), false);    	
    }
}
