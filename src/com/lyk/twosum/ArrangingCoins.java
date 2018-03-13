package com.lyk.twosum;

public class ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(6));
	}

	public	static int arrangeCoins(int n) {
		long sum = 0;
		int i =1;
		while (sum < n) {
			sum += i++;
		}
		return sum == n? (i-1) : (i-2);
	}
}
