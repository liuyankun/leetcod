package com.lyk.twosum;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sums= {1,2,3,4,5,6,7,8,9};
		System.out.println(sums.hashCode());
		rotate(sums, 3);
		System.out.println(Arrays.toString(sums));
	}

	 public static void rotate(int[] nums, int k) {
		 k%=nums.length;
		 int[] head= Arrays.copyOf(nums, nums.length-k);
		 int[] tail= Arrays.copyOfRange(nums, nums.length-k, nums.length);
		 System.arraycopy(tail, 0, nums, 0, tail.length);  
		 System.arraycopy(head, 0, nums, tail.length, head.length);
		 
	 }
}
