package com.lyk.twosum;

public class ClimbStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

	public static int climbStairs(int n) {
		int x=0,y= 0 ,k = 0;
		for(;x<=n&&(x+y)<=n;x++){
			for(;y<=n&&(x+y)<=n;y++){
				if((x+2*y)==n){
					k++;
				}
			}
			y=0;
		}	
		return k;
	}
}
