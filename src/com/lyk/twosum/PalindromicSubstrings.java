package com.lyk.twosum;

public class PalindromicSubstrings {
	
	public static void main(String[] args) {
		
		
	}
	
	private int ret = 0;
	public int countSubstrings(String s) {
        
		for(int i = 0; i<s.length();i++) {
			findSubStirng(s, i, i);
			findSubStirng(s, i, i+1);
		}
		return ret;
    }
	public void findSubStirng(String s,int start,int end) {
		while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)) {
			start--;
			end++;
			ret++;
		}		
	}

}
