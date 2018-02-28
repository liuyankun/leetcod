package com.lyk.twosum;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int hammingDistance(int x, int y) {
	     int xor= x^y,count=0;   
		 while(xor!=0) {
			 xor &= (xor-1);
			 count++;
		 }
		 return count;
	 }
}

