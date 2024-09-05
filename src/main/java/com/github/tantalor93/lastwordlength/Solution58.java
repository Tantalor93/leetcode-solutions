package com.github.tantalor93.lastwordlength;

public class Solution58 {
	public static int lengthOfLastWord(String s) {
		var lastWordLength = 0;
		var currentWordSize = 0;
		for(var i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				currentWordSize++;
			} else {
				if(currentWordSize != 0) {
					lastWordLength = currentWordSize;
					currentWordSize = 0;
				}
			}
		}
		if(currentWordSize != 0) {
			lastWordLength = currentWordSize;
			currentWordSize = 0;
		}
		return lastWordLength;
	}
}
