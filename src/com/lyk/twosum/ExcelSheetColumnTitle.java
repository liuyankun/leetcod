package com.lyk.twosum;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(convertToTitle(52));
		
		ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
		
	}

	public static String convertToTitle(int n) {
		int result = n;
		StringBuilder sb = new StringBuilder();
		
		while(result>0) {
			if(result <=26) {
				sb.append((char)(result+64));
				
			}else {
				int i = result%26;
				sb.append((char)(i==0? 26:i +64));
			}
			
			result = result/26;
		}
		return sb.reverse().toString();
	}
	
	//asdfasdf
}
