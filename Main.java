package com.ty.man;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static int[] twoSum(int[] numbers) {
	    List<Integer> list = new ArrayList<>();
	    boolean found = twoSum(numbers, 0, 0, list);
	    if (found) {
	        return list.stream().mapToInt(Integer::intValue).toArray();
	    }
	    return null;
	}

	public static boolean twoSum(int[] numbers, int from, int target,
	        List<Integer> list) {
	    for (int i = from; i < numbers.length; i++) {
	        int current = numbers[i];
	        list.add(current);
	        int newTarget = target-current;
	        if (newTarget == 0) {
	            return true;
	        }
	        boolean found = twoSum(numbers, i+1, newTarget, list);
	        if (found) {
	            return true;
	        }
	        list.remove(list.size()-1);
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {-4,-2,-1,6};
		
		int[] output=twoSum(arr);
	
		if(output==null) {
			
			System.out.println("No Elements found");
		}
		else {
			System.out.println(Arrays.toString(output));
		}
		
		
		
	}
}
