package com.lyk.twosum;

public class BestTimeToBuyAndSellStock_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] prices= {2,1,3,2,5};
		System.err.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {     
        if(prices.length<2){
        	return 0;
        }
        int profit = 0;
        int i = 0, j= 1;
        while(j<prices.length){
        	if(prices[j]>prices[i]){
        		profit += prices[j]-prices[i];
        	}
        	i++;
        	j++;
        }
        
        return profit;
    }
}
