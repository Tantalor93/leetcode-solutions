package com.github.tantalor93;

public class Solution121 {

	public int maxProfit(int[] prices) {
		var minprice = 10000;
		var maxProfit = 0;
		for (var i = 0; i < prices.length; i++) {
			if (prices[i] < minprice) {
				minprice = prices[i];
			} else if (prices[i] - minprice > maxProfit) {
				maxProfit = prices[i] - minprice;
			}
		}
		return maxProfit;
	}

}
