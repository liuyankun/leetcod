package com.lyk.twosum;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("world"));
	}
	public static int lengthOfLastWord(String s){
		
		
		String[] strings = s.split(" ");
		if(strings.length >0){
			String lastWord = strings[strings.length-1];		
			return lastWord.length();
		}else {
			return 0;
		}
		
	}

}
