package com.lyk.twosum;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"aa","a"};
		System.out.println(longestCommonPrefix(strs));
	}

    public static String longestCommonPrefix(String[] strs) {
    	if(strs.length <=0){
    		return "";
    	}
    	String firstStr = strs[0];
    	String prefix = "";
    	label1:
    	for(int i = firstStr.length(); i >0 ; i--){
    		String tempPrefix = firstStr.substring(0, i);
    		for(int j =0; j<strs.length; j++){
    			if(strs[j].length() < i ){
    				break;
    			}
    			if(!strs[j].substring(0, i).equals(tempPrefix)){
    				break;
    			} else {
    				if(j==strs.length-1){
    					prefix = tempPrefix;
    					break label1;
    				}
    			}
    		}
    	}
    	
        return prefix;
    }
}
