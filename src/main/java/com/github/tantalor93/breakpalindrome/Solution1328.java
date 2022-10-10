package com.github.tantalor93.breakpalindrome;

public class Solution1328 {

	// budu iterovat zleva a najdu prvni pismeno, ktere neni 'a', pokud takove nenexistuje tak jako posledni pismeno dam 'b'
	public String breakPalindrome(String palindrome) {
		var chars = palindrome.toCharArray();
		var j = palindrome.length()-1;
		for(var i = 0; i < chars.length; i++) {
			if(j < i) break;
			if(chars[i] > 'a' && i != j) {
				chars[i] = 'a';
				return new String(chars);
			}
			j--;
		}

		if(chars[chars.length-1] == 'a' && chars.length >= 2) {
			chars[chars.length-1] = 'b';
			return new String(chars);
		}

		return "";

	}
}
