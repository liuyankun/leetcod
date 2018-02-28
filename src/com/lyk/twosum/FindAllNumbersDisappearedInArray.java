package com.lyk.twosum;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sums= {1,1};
		System.out.println(findDisappearedNumbers(sums));
	}
	
	public	static List<Integer> findDisappearedNumbers(int[] nums) {
		int length = nums.length;
		for(int i = 0; i<length ;i++) {
    	   nums[(nums[i]-1)%length] += length; 
       }
		List<Integer> list = new ArrayList();
		for(int i = 0; i<length; i++) {
			if(nums[i]<=length) {
				list.add(i+1);
			}
		}
		
		return list;
    }

}
