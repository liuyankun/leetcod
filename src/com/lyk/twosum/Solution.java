package com.lyk.twosum;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;

		int[] result = new int[2];
		for (int i = 0; i < length; i++) {
			int first = nums[i];
			for (int j = i+1; j < length; j++) {
				int second = nums[j];
				if (i != j && target == (first + second)) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
    }
}
