package com.lyk.twosum;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] is= {1,2,3,5};
		int[] s = {1,2,1,6,3};
		System.out.println(findContentChildren(is, s));
	}
	
	
	public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j< s.length) {
        	if(g[i]<=s[j]) {
        		i++;
        	}
			j++;
			
        }
        return i;
    }
}
