package com.ss.week1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Functional {

	/* Given a list of non-negative integers,
	 * return an integer list of the rightmost digits. (Note: use %)
	 */
	public static List<Integer> rightmostDigit(List<Integer> list) {
		//create a map and map each of the integers based on their last number
        return list.stream().map(num -> (num % 10)).collect(Collectors.toList());
    }
	/* Given a list of integers, 
	 * return a list where each integer is multiplied by 2.
	 */
	
    public static List<Integer> multiplyBy2(List<Integer> list) {
    	
    	//create a map and map each of the integers after doubling them
        return list.stream().map(num -> (num * 2)).collect(Collectors.toList());
    }
    
    // Given a list of strings, return a list where each string has all its "x" removed.
    public static List<String> removeX(List<String> list) {
    	
    	//create a map and map each of the items replacing x with null
        return list.stream().map(num -> (num.replaceAll("x", ""))).collect(Collectors.toList());
    }
    
    
/*    Given an array of ints, is it possible to choose a group of some of the ints, 
 *    such that the group sums to the given target, with this additional constraint: 
 *    if there are numbers in the array that are adjacent and the identical value, they must either all be chosen,
 *    or none of them chosen.
 *    For example, with the array {1, 2, 2, 2, 5, 2}, 
 *    either all three 2's in the middle must be chosen or not, all as a group.
 *    (one loop can be used to find the extent of the identical values).
 */   
    	
    public static boolean groupSumClump(int startingPoint, int[] nums, int endingPoint) {
    	
    	//base case to end recursion
    	if (startingPoint >= nums.length){
    		return endingPoint == 0;
    	}
    	
    	int i = startingPoint;
    	int sum = 0;
    	
    	//add up all the previous numbers
    	while(i < nums.length && nums[startingPoint] == nums[i]) {
    		sum += nums[i];
    		i++;
    	}
    	
    	//recursively call with the ending point minus the current sum
    	if(groupSumClump(i, nums, endingPoint - sum)){
    		return true;
    	}
    	if(groupSumClump(i, nums, endingPoint)){
    		return true;
    	}
    	
    	return false;
    	
    }
    
    public static void main(String[] args){
  
        int[] testInput = { 1, 2, 2, 2, 5, 2 };
        System.out.println(groupSumClump(0, testInput, 12));
    }
    
    
    
	
}
