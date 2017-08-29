package com.lyk.twosum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
		System.out.println(isomorphicStrings.isIsomorphic("addeeff","eggefe"));
	}
	
	public boolean isIsomorphic(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		Map<Character, List> sMap = getConstructor(sChar);
		Map<Character, List> tMap = getConstructor(tChar);
		if(sMap.size() !=tMap.size()) return false;
		Iterator<Map.Entry<Character, List>> sIterator = sMap.entrySet().iterator();  
		Iterator<Map.Entry<Character, List>> tIterator = tMap.entrySet().iterator(); 
		while(sIterator.hasNext()) {
			 Map.Entry<Character, List> sEntry = sIterator.next();
			 List<Integer> scList = sEntry.getValue();
			 Map.Entry<Character, List> tEntry = tIterator.next();
			 List<Integer> tcList = tEntry.getValue();
			 if(scList.size()!=tcList.size()) return false; 
			 for(int i=0;i<scList.size();i++) {
				 int sp= scList.get(i);
				 int tp =tcList.get(i);
				 if(sp!=tp) {
					 return false;
				 }
			 }
		}
		return true;
	}
	
	private Map<Character, List> getConstructor(char[] sChar){
		Map<Character, List> sMap = new LinkedHashMap<>();
		for(int i = 0; i<sChar.length;i++ ) {
			char current = sChar[i];
			List<Integer> currentList;
			if(sMap.containsKey(current)) {
				currentList =sMap.get(current);	
			}else {
				currentList = new ArrayList<>();
				sMap.put(current, currentList);
			}
			currentList.add(i);
		}
		return sMap;
	}
}
