package com.lyk.twosum;

public class BestTimeToBuyAndSellStock2 {

	public static void main(String[] args) {
		int[] ss = {};
		System.err.println(maxProfit(ss));
	}

	
    public static int maxProfit(int[] prices) {
    	int today=0;
    	int tomorrow = today+1;
    	int profit = 0;
    	while (tomorrow<prices.length) {
			if(prices[today]<prices[tomorrow]){
				profit = profit + prices[tomorrow]-prices[today];
			}			
			today++;
			tomorrow++;
		}    	
        return profit;
    }
}
