package com.dsa;

public class D10_StockBuyAndSellMaxOneTransactionAllowed {

	public static void main(String[] args) {
		
		int arr [] = {7, 10, 1, 3, 6, 9, 2};

		int maxProfit = new D10_StockBuyAndSellMaxOneTransactionAllowed().maximumProfit(arr);
		
		System.out.println(maxProfit);
		
	}

	public int maximumProfit(int prices[]) {
		
		int minPrice = prices[0];
		
		int profit = 0;
		
		for (int i = 1; i < prices.length; i++) {
			
			if (minPrice > prices[i]) {
				minPrice = prices[i];
			}
			
			profit = Math.max(profit, (prices[i] - minPrice));
			
		}
		
		return profit;
		
	}

}
