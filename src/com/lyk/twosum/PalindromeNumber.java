package com.lyk.twosum;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(isPalindrome(112));
	}

	
	public static boolean isPalindrome(int x) {
		if(x==0) return true;
		if(x%10==0) return false;
		
		int right=0;
		while(x>right) {
			right = right*10 + x%10; 
			x/=10;
		}
		if(right==x||right/10==x) {
			return true;
		}
		
		return false;
    }
}
