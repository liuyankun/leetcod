package com.lyk.twosum;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CountBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println();
	}
	
	private int ret = 0;
	public int countBinarySubstrings(String s) {
        
		for(int i =0; i<s.length();i++) {
			findBinarySubString(s, i, i+1);
		}
		
		return ret;
    }
	private void findBinarySubString(String s,int start,int end) {
		
		if(start>=0&&end<s.length()) {
			int left = s.charAt(start);
			int right = s.charAt(end);
			if(left == right) return; 
			while(start>=0&&end<s.length()&&s.charAt(start)==left &&s.charAt(end)==right) {
				start--;
				end++;
				ret++;
			}	
		}
			
	}
	
}
