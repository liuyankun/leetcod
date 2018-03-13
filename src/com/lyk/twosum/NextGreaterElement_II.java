package com.lyk.twosum;

import java.util.Stack;

public class NextGreaterElement_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
		System.err.println(nextGreaterElements(nums));
	}
	
	public static int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int[] b = new int[nums.length];
		for(int i=0; i<nums.length; i ++){					
			while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
				b[stack.pop()] = nums[i];
			}
			stack.push(i);	
		}
		
		for(int i = 0 ;!stack.isEmpty()&&i<stack.lastElement();i++){
			while(nums[stack.peek()]<nums[i]){
				b[stack.pop()] = nums[i];
			}
		}
		while(!stack.isEmpty()){
			b[stack.pop()] = -1;
		}
		
		return b;
    }

}
