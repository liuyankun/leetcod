package com.lyk.twosum;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllDuplicatesInAnArray inAnArray = new FindAllDuplicatesInAnArray();
		int[] nums = {4,3,2,7,8,2,3,1};
		inAnArray.findDuplicates(nums);
	}

	public List<Integer> findDuplicates(int[] nums) {
		for(int i = 0;i <nums.length; i++) {
			while(nums[i]!=i+1 && nums[nums[i]-1]!=nums[i]) {
				swap(nums, i, nums[i]-1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <nums.length; i++) {
			if(nums[i]!=i+1) {
				list.add(nums[i]);
			}
		}	
		return list;
	}
	
	private void swap(int[] nums,int start, int tail) {
		int temp = nums[tail];
		nums[tail] = nums[start];
		nums[start] = temp;
	}
}
