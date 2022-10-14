package com.github.tantalor93.reversestrings;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class Solution557 {

	public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
		String[] splits = s.split(" ");
		return Arrays.stream(splits)
				.map(e -> new StringBuilder(e).reverse().toString())
				.collect(Collectors.joining(" "));
	}
}
