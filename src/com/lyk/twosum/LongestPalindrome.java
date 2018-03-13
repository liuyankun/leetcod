package com.lyk.twosum;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(longestPalindrome("abccccdd"));
	}
	
	public static int longestPalindrome(String s) {
		int[] chars = new int[82];
		for(int i=0;i<s.length();i++){
			++chars[s.charAt(i)-'A'] ;
		}
		int max= 0;
		int sum =0;
		for(int i =0; i<52;i++){
			if(chars[i]%2==0){
				sum +=chars[i];
			}else{
				max = max>chars[i]? max:chars[i];
			}
		}
		
		return sum+max;
    }

}
