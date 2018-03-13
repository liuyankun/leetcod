package com.lyk.twosum;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2,2,5,2,3,7};
		System.err.println(findLHS(nums));
	}

	public static int findLHS(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i :nums) {
			if(map.containsKey(i)) {
				map.replace(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		int max = 0;
		for(int i : map.keySet()) {
				
			
			int sum1 =0;
			int sum2 =0;			
			if(map.containsKey(i-1)) {
				sum1 =map.get(i)+ map.get(i-1);
			}
			if(map.containsKey(i+1)) {
				sum2 =map.get(i+1) +map.get(i);
			}
			sum1 = sum1>sum2? sum1: sum2;
			max = max >sum1 ? max:sum1;
			
		}
		return max;
	}

}
