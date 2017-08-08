package com.lyk.twosum;

public class DivideInteger {

	public static void main(String[] args){
		
	}
    public static int divide(int dividend, int divisor) {
        int result = 0;
        while(dividend >= divisor){
        	dividend -=divisor;
        	result++;
        }
    	return result;
    }
}
