package com.lyk.twosum;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,1,2,2,2,3,3,3,3,3,3};
		System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int[] nums) {
        Map<Integer,Integer> counter = new HashMap<>();
        int max = 0;
        int maxValue = 0;
        for(int i = 0; i<nums.length;i++) {
        	int temp = nums[i];
        	counter.compute(temp, (k, v) -> (v == null) ? 1 : ++v);
        	int tempSum = counter.get(temp);
        	if(tempSum >max) {
        		max = tempSum;
        		maxValue = temp;
        	} 
        }
		return maxValue;
    }
}
