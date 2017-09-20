package com.lyk.twosum;

public class NumberComplement {

	public static void main(String[] args) {
		NumberComplement numberComplement = new NumberComplement();
		System.out.println(numberComplement.findComplement(5));
	}
	public int findComplement(int num) {
		String bytes = Integer.toBinaryString(num);
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<bytes.length();i++) {
			stringBuilder.append(bytes.charAt(i) == '0'?1:0);
		}
		return Integer.parseInt(stringBuilder.toString(), 2);
    }

}
