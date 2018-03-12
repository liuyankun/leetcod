package com.lyk.twosum;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(isAnagram("aabbccee", "eecbcbaa"));
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s==null||t==null){
			return s==t;
		}
		if(s.length()!=t.length()){
			return false;
		}
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
        	char c=s.charAt(i);
        	if(map.containsKey(c)){
        		map.replace(c,map.get(c)+1);
        	}else {
				map.put(c, 1);
			}
        }
        for(int i = 0; i<t.length();i++){
        	char c = t.charAt(i);
        	if(map.containsKey(c)){
        		if(map.get(c)>1){
        			map.replace(c,map.get(c)-1);
        		}else{
        			map.remove(c);
        		}
        		
        	}else {
				return false;
			}
        }
        
		return map.size()==0?true:false;
    }

}
