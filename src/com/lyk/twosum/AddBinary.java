package com.lyk.twosum;

public class AddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("100", "110010"));
	}
	public static String addBinary(String a,String b){
		return addBinarys(a, b).reverse().toString();
	}
	public static StringBuilder addBinarys(String a, String b) {
        if("0".equals(a)){
        	return new StringBuilder(b).reverse();
        }else if ("0".equals(b)) {
			return new StringBuilder(a).reverse();
		}
		
		StringBuilder result = new StringBuilder();
        
		int al = a.length()-1;
        int bl = b.length()-1;
        int pre = 0;
        while(true){
        	if(al<0 &&bl<0 ){
        		if(pre !=0){
        			result.append(pre);
        		}
        		break;
        	}
        	if(al<0){
        		result.append(addBinarys(b.substring(0, bl+1), String.valueOf(pre)));
        		break;
        	}else if(bl<0){
        		result.append(addBinarys(a.substring(0, al+1), String.valueOf(pre)));
        		break;
        	}else{
        		int sum = Character.getNumericValue(a.charAt(al))+ Character.getNumericValue(b.charAt(bl))+pre;
        		switch (sum) {
				case 0:
					result.append(0);
					pre = 0;
					break;
				case 1:
					result.append(1);
					pre = 0;
					break;
				case 2:
					result.append(0);
					pre = 1;
					break;
				case 3:
					result.append(1);
					pre = 1;
					break;
				default:
					break;
				}
        		
        		al--;
        		bl--;
        	}
        }
		return result;
    }

}
