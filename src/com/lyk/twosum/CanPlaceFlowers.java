package com.lyk.twosum;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] flowerbed = {1,0,0,0,1,0,0};
		System.err.println(canPlaceFlowers(flowerbed, 2));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int sum = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				if((i==0 || flowerbed[i-1]==0)&&(i==(flowerbed.length-1)||flowerbed[i+1]==0))  {
					
					flowerbed[i] =1;
					sum++;
				}
			}
		}

		return sum>=n;
	}

}
