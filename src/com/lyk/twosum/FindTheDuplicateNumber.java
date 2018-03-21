package com.lyk.twosum;

import java.util.ArrayList;
import java.util.List;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findDuplicates(int[] nums) {
		for(int i = 0;i <nums.length; i++) {
			while(nums[i]!=i+1 && nums[nums[i]-1]!=nums[i]) {
				swap(nums, i, nums[i]-1);
			}
		}
		return nums[nums.length-1];
	}
	
	private void swap(int[] nums,int start, int tail) {
		int temp = nums[tail];
		nums[tail] = nums[start];
		nums[start] = temp;
	}

}
