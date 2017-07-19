package com.lyk.twosum;

public class ImplementStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("aaaa", "aaa"));
	}
	//"mississippi"
	//"sippia"
	
    public static int strStr(String haystack, String needle) {
    	if("".equals(needle)){
    		return 0;
    	}
    	if(haystack==null || needle ==null || ("".equals(needle)^"".equals(haystack))||haystack.length()<needle.length()){
    		return -1;
    	}
    	
    	char[] needleChars = needle.toCharArray();
     	char[] haystackChars = haystack.toCharArray();
     	int i = 0;
     	int head = -1;
     	
     	labe11:
		for(int j =0; j<haystackChars.length ;j++){
			if(needleChars[0] == haystackChars[j]){
				if (j+needle.length() > haystackChars.length) {
					break;
				}
				
				head = j;
				for(int k = j;k<=j+needle.length()-1 && k< haystackChars.length&&i < needleChars.length;k++){			
						if(needleChars[i]==haystackChars[k]){				
							if(i == needleChars.length -1){
								break labe11;
							}else if(i<needleChars.length -1){
								i++;
							}
							
						}else{
							i =0;
							break;
						}
				}
				
			}
		}
	    if(i!=  needleChars.length -1){
	    	return -1;
	    }
    	return head;
    }
}
