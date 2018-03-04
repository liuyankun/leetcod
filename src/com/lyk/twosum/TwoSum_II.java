package com.lyk.twosum;

public class TwoSum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5,7,8,10};
		
		System.err.println(twoSum(numbers, 6));
	}

	public static int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length-1;
		while (true) {
			int sum = numbers[head]+numbers[tail];
			if(sum==target) break;
			if(sum <target){
				head++;				
			}else {
				tail--;
			}	
		}
		int[] result = new int[2];
		result[0] =head;
		result[1] =tail;
		return result;
    }
}
