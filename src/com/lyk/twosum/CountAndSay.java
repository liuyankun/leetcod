package com.lyk.twosum;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}

	public static String countAndSay(int n) {
		String result = "1";
		for (int i = 1; i <= n - 1; i++) {
			result = count(result);
		}
		return result;
	}

	public static String count(String preNumber) {
		int count = 0;
		char preChar = preNumber.charAt(0);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < preNumber.length(); i++) {
			if(preNumber.charAt(i) == preChar){
				count ++;
			}else{
				result.append(count).append(preChar);
				preChar=preNumber.charAt(i);
				count =1;
			}
		}
        result.append(count).append(preChar);
		return result.toString();
	}
}
