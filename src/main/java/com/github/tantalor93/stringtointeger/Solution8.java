package com.github.tantalor93.stringtointeger;

public class Solution8 {
	public int myAtoi(String s) {
		var res = 0;
		var it = 0;
		var isNegative = false;
		for(it = 0; it < s.length(); it++) {
			if(s.charAt(it) != ' ') {
				break;
			}
		}

		if(it < s.length() && s.charAt(it) == '-') {
			isNegative = true;
			it++;
		} else if(it < s.length() && s.charAt(it) == '+') {
			it++;
		}

		for(; it < s.length(); it++) {
			if(s.charAt(it) != '0') {
				break;
			}
		}

		var end = it;
		for(; end < s.length();end++) {
			if(!Character.isDigit(s.charAt(end))) {
				break;
			}
		}


		for(; it < end; it++) {

			int digit = s.charAt(it) - '0';

			// to avoid integer overflow
			if (res > (Integer.MAX_VALUE / 10) || (res == (Integer.MAX_VALUE / 10) && digit > 7)){
				return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			res = 10*res + digit;
		}

		return isNegative? -res : res;
	}
}
