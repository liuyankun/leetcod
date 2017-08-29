package com.lyk.twosum;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("AZ"));
	}
	public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int result =0;
		for(int i=0 ; i<length;i++) {
			double weight = Math.pow(26, length -1 -i);
			int value = (int)chars[i] - 64;
			result += value*weight;
		}	
		return result;
        
    }
}
