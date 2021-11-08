package com.ss.day5;

import static org.junit.Assert.*;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class LambdaTest {

    private static String[] strings = {
            "h23456",
            "f1",
            "a234",
            "b2345",
            "e23",
    };
    

    private static String[] sortedString = {
            "f1",
            "e23",
            "a234",
            "b2345",
            "h23456"
    };
    
    private static String[] reverseString = {
            "h23456",
            "b2345",
            "a234",
            "e23",
            "f1"
    };
    
    private static String[] alphaString = {
    		"a234",
    		"b2345",
    		"e23",
    		"f1",
            "h23456"
    };
    
    private static String[] eString = {
    		"e23",
    		"h23456",
    		"b2345",
    		"a234", 
            "f1",      
    };
    

    
	@Test
	public void sortLengthTest() {
		assertArrayEquals(Lambdas.sortLength(strings), sortedString);
	}
	
	@Test
	public void sortLengthReverseTest() {
		assertArrayEquals(Lambdas.sortLengthReversed(strings), reverseString);
	}
	@Test	
	public void sortLengthAlphabeticallyTest() {
		assertArrayEquals(Lambdas.sortAlphabetically(strings), alphaString);
		
	}
	@Test	
	public void eFirstStringTest() {
		assertArrayEquals(Lambdas.containsEFirst(strings), eString);
	}
	
	@Test	
	public void string3lettersStartWithATest() {
		List<String> listWithRule = Stream.of("car", "dog").collect(Collectors.toList());
		List<String> str = Stream.of("car", "dog", "doggy", "card").collect(Collectors.toList());
	 
		Assert.assertEquals(listWithRule, Lambdas.filterA3(str));
	}
	
}
