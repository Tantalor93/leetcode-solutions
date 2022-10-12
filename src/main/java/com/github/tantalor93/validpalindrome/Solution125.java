package com.github.tantalor93.validpalindrome;

public class Solution125 {

	public boolean isPalindrome(String s) {
		var arr = s.toLowerCase().toCharArray();
		var lo = 0;
		var hi = s.length()-1;
		while(lo <= hi) {
			if(!Character.isLetterOrDigit(arr[lo])) {
				lo++;
			} else if(!Character.isLetterOrDigit(arr[hi])) {
				hi--;
			} else if(arr[lo] != arr[hi]){
				return false;
			} else {
				lo++;
				hi--;
			}
		}
		return true;
	}
}
