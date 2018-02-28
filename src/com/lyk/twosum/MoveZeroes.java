package com.lyk.twosum;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] a={0};
		moveZeroes(a);
		System.err.println(Arrays.toString(a));
	}
	
	public static void moveZeroes(int[] nums) {
	    int tail = nums.length-1;
	    int i = 0;
	    while(tail>=0&&nums[tail]==0){
	    	tail--;
	    }
	    while(i<tail){
	    	if(nums[i]==0){
	    		for(int j=i;j<tail;j++){
	    			nums[j] = nums[j+1];
	    		}
	    		nums[tail] = 0;
	    		tail--;
	    	}else{
	    		i++;
	    	}
	    	
	    }
	}

}
