package com.lyk.twosum;

public class SumOfSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(judgeSquareSum(1000000));
	}
	public	static boolean judgeSquareSum(int c) {
        int head = 0;
        int tail =(int) Math.sqrt(c);
        while(head<=tail){
        	int a = head*head+tail*tail;
        	if(a == c) return true;
        	if(a<c){
        		head++;
        	}else {
				tail--;
			}
        }
        return false;
    }
}
