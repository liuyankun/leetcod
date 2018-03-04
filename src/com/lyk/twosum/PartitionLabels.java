package com.lyk.twosum;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(partitionLabels("ababcbacadefegdehijhklij"));
	}
	
	public static  List<Integer> partitionLabels(String S) {
        int[] lastIndex = new int[26];
		for(int i=0;i < S.length();i++){
			lastIndex[S.charAt(i)-'a'] = i;
		}
        List<Integer> list =new ArrayList<>();
        int start = 0,last = 0;
        for(int i = start; i<S.length() ;i++){
        	last = lastIndex[S.charAt(i)-'a']>last?lastIndex[S.charAt(i)-'a']:last;
        	if(i==last){
        		list.add(last-start+1);
        		start = last +1;
        	}
        	
        	
        }
		return list;
    }

}
