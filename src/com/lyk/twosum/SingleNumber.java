package com.lyk.twosum;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sums = {1,2,3,4,5,4,2,3,1};
		System.out.println(singleNumber(sums));
	}
	
	public static int singleNumber(int[] nums) {
		int single = 0;
		for(int i=0;i<nums.length;i++){
			single = nums[i]^single;
		}
		return single;
        
    }

}
