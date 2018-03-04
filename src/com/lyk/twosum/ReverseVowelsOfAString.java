package com.lyk.twosum;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(reverseVowels(".,;"));
	}

	public static String reverseVowels(String s) {
		int head = 0;
		int tail = s.length()-1;
		char[] result = s.toCharArray();
		while (head<tail) {
			while(!isVowels(s.charAt(head))&&head<s.length()-1) head++;
			while(!isVowels(s.charAt(tail))&&tail>0) tail--;
			if(head<tail){
				char temp = result[head];
				result[head] = result [tail];
				result[tail] =temp;
				head++;
				tail--;				
			}
		}
		return new String(result);
	}
	public static boolean isVowels(char c){
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
				||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
	}
}
