package com.lyk.twosum;

public class BestTimeBuySellStock {
	
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
        int result = 0;
        if(prices.length>=2){
            int buy = 0;     
            while(buy<=prices.length-2){
            	int sell =buy+1;
                while(sell<=prices.length-1){
                   int profit = prices[sell] - prices[buy];
                    result = profit>result?profit: result;
                    sell ++;
                }
                buy++;
            }
        }
        return result;
    }
}
