package com.github.tantalor93.divideintegers;

public class Solution29 {
	public int divide(int dividend, int divisor) {
		var res = 0;
		var absdivisor = Math.abs(divisor);
		for(var i = Math.abs(dividend); i > 0; i = i - absdivisor) {
			if(i >= absdivisor) {
				res++;
			}
		}
		if(dividend < 0 && divisor < 0) {
			return res > 2147483647 ? 2147483647 : res;
		} else if(dividend < 0 || divisor < 0) {
			return -res < -2147483647 ? -2147483647 : -res;
		}
		return res > 2147483647 ? 2147483647 : res;
	}
}
