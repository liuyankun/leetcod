package com.lyk.twosum;

public class NonDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,4,2,3};
		System.err.println(checkPossibility(nums));
	}
	
	public static boolean checkPossibility(int[] nums) {
        int sum = 0;
        if(nums.length < 3){
        	return true;
        }
		for(int i = 1; i<nums.length;i++){
			if(nums[i]<nums[i-1]){
				sum ++;
				if((i-2)>=0&&nums[i-2]>nums[i]){
					nums[i] = nums [i-1];
				}else{
					nums[i-1] = nums[i];
				}
			}
			if(sum >1){
				return false;
			}
		}
		return true;
    }

}
