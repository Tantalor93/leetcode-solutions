package com.github.tantalor93.besttimetobuyandsellstock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Solution121 {

	// technika dvou promennych, budu si pamatovat minimalni buy a budu si pamatovat maxprofit
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
