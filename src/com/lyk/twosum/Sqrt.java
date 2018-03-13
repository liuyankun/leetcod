package com.lyk.twosum;

import javax.print.attribute.standard.RequestingUserName;

public class Sqrt {
	public static void main(String[] args) {
		System.out.println(mySqrt(8));
	}
	
	public static int mySqrt(int x) {
        if (x< 1) return x;
		int l = 1;
        int h = x;
		while(l<=h) {
			int mid = l+(h-l)/2;
			int sqrt = x /mid;
			if(mid == x/mid) { return mid;}
			if(mid < sqrt) { l = mid+1;}
			else{ h = mid -1;}
		}		
		return h;
    }
}
