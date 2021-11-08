package com.ss.day5;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;
import java.util.StringJoiner;

public class Lambdas {

    private static String[] strings = {
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
            "It has survived not only five centuries",
            "but also the leap into electronic typesetting, remaining essentially unchanged",
            " It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages.",
    };

    /**
     * @param  strings array  
     * @return Sorted strings
     */   
    public static String[] sortLength(String[] s) {
        // you can sort by user defined criteria using Comparator, in this case length of each string
        Arrays.sort(s, Comparator.comparingInt(String::length));
        return s;
    }

    /**
     * @param  strings array
     * @return reverse ordered strings
     */
    public static String[] sortLengthReversed(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
        return strings;
    }

    
    //Sorts strings alphabetically
    public static String[] sortAlphabetically(String[] strings) {
        Arrays.sort(strings, (a, b) -> a.charAt(0) - b.charAt(0));
        return strings;
    }

    
    
    //sorts strings that contain e first
    public static String[] containsEFirst(String[] strings) {
        Arrays.sort(strings, (a, b) -> {
            if (a.toLowerCase().contains("e") && !b.toLowerCase().contains("e")) return -1;
            return 0;
        });
            return strings;
    }
    
    //static helper method
    public static String[] helperE(String[] strings) {
        Arrays.sort(strings, (a, b) -> Lambdas.sortLogic(a,b));
        return strings;
    }

    public static int sortLogic(String a, String b) {
        if (a.toLowerCase().contains("e") && !b.toLowerCase().contains("e")) return -1;
            return 0;
            }
    /* 2. Using Java 8 features write a method that returns a comma separated string based on a given list of integers.
     *    Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' 
     *    if the number is odd. For example, if the input list is (3,44), the output should be 'o3,e44'.
     */
    
    public static String getCommaSeperatedString(int[] input) {
    	
    	
    	 int[] numbers = input;

         ArrayList<String> stringNumbers = new ArrayList<String>();

         Arrays.stream(numbers).forEach(num -> {

             if(num % 2 == 0) stringNumbers.add("e" + num);
             else stringNumbers.add("o" + num);

         });
    	
    	 String comboString = String.join(",", stringNumbers);
    	 return comboString;
    }
    
    

    
    /* 3.  Given a list of Strings, write a method that returns a list of all
     *     strings that start with the letter 'a' (lower case) and have exactly 3 letters
     * 
     */
    public static List<String> filterA3(List<String> strings) {
        return strings.stream().filter(s -> (s.charAt(0) == 'a' && s.length() == 3)).collect(Collectors.toList());
    }
    
    // Main test function
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortLength(strings)));
        System.out.println(Arrays.toString(sortLengthReversed(strings)));
        System.out.println(Arrays.toString(containsEFirst(strings)));
        System.out.println(Arrays.toString(sortAlphabetically(strings)));
        
        int[] arr = {2,3};
        System.out.println(getCommaSeperatedString(arr));
    }
}
