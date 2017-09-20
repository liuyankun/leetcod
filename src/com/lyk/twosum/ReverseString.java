package com.lyk.twosum;

public class ReverseString {

	public static void main(String[] args) {
		String s = "abcdefg";
		
		System.out.println(reverseString(s));
	}
	 public static String reverseString(String s) {
	       char[] chars = s.toCharArray();
			int head = 0;
			int tail = chars.length -1;
			char temp ;
			while (head<tail) {
			   	temp = chars[head]; 
				chars[head]  = chars[tail];
				chars[tail] = temp;
				head++;
				tail--;
			}
			return new String(chars);
	  }
	
}
