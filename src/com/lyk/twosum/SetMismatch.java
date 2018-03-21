package com.lyk.twosum;

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] findErrorNums(int[] nums) {
		int[] rets = new int[2];
		int[] ss = new int[nums.length];
		for(int i = 0; i<nums.length; i++) {
			ss[nums[i]-1]++; 
		}
		for(int i=0; i<ss.length; i++) {
			if(ss[i]==0) {
				rets[1] = i+1; 
			}
			if(ss[i]==2) {
				rets[0] =i+1;
			}
		}
		return rets;
	}

}
