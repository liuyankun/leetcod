package com.lyk.twosum;

public class ValidPalindrome_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(validPalindrome("abbaba"));
	}

	public static boolean validPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		StringBuilder sb = new StringBuilder(s);
		while (start < end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return isValidPalindrome(s, start+1, end) ||isValidPalindrome(s, start, end-1);
			}	 
			start++;
			end--;
		}
		return true;
	}
	
	public static boolean isValidPalindrome(String s,int start,int end) {		
		while (start < end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}	 
			start++;
			end--;
		}
		return true;
	}
}
