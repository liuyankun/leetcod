package com.lyk.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("bab","ba","ab","a","b"); 
		System.err.println(findLongestWord("abpcplea", list));
	}
	
	public static String findLongestWord(String s, List<String> d) {
        Collections.sort(d,(String a,String b) -> {
        	if(b.length()==a.length()) {
        		return a.compareTo(b);
        	}
        	return b.length()-a.length();
        });
		for(String e:d) {
			if(isTheWord(s, e)) {
				return e;
			}
		}
		return "";
    }
	
	public static boolean isTheWord(String s, String d){
		if(d == null || "".equals(d)) {
			return true;
		}
		int i =0,j = 0;
		while(i<s.length()) {		
			if(d.charAt(j)==s.charAt(i)) {
				j++;
				if(j==d.length()) {
					return true;
				}
			}
			i++;
		}
		return false;
	}
}
