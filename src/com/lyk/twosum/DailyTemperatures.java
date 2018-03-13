package com.lyk.twosum;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
	 
	public static void main(String[] args) {
		int[] temperatures= {73, 74, 75, 71, 69, 72, 76, 73};
		Arrays.asList(dailyTemperatures(temperatures)).stream().forEach(System.out::println);
		//System.err.println(dailyTemperatures(temperatures));
	}
	
	public static int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[temperatures.length];
		for(int i = 0; i<temperatures.length;i++){
			if(!stack.isEmpty()) {
				while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]) {
					int temp = stack.pop();
					result[temp] = i - temp;
				}
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			result[stack.pop()] = 0;
		}
	    return result;
	}
}

