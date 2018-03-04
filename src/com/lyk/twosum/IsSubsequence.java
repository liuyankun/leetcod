package com.lyk.twosum;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("abc", "eadghbkic"));
	}
	
	public static boolean isSubsequence(String s, String t) {
		if(s.length()<=0){
			return true;
		}
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		int j =0;
		for(int i = 0; i<tChars.length;i++){
			if(sChars[j] == tChars[i]){
				if(j == sChars.length-1){
					return true;
				}
				j++;
			}
		}	
		return false;
    }

}
