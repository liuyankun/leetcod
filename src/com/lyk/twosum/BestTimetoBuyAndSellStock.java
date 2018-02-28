package com.lyk.twosum;

public class BestTimetoBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2};
		System.out.println(maxProfit(a));
	}

	public static int maxProfit(int[] prices) {
       
		int profit = 0;
		for(int i = 0; i<prices.length-1;i++){
			if(prices.length>1){
				for(int j=i+1; j<prices.length;j++){
					if(prices[j]>prices[i]&&profit<(prices[j]-prices[i])){
						profit = prices[j]-prices[i];
					}
				}
			}
		}
		
		return profit;
    }
}
