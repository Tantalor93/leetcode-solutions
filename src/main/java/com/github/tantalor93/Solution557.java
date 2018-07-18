package com.github.tantalor93;


// Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//        Example 1:
//        Input: "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
//        Note: In the string, each word is separated by single space and there will not be any extra space in the string.
//

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution557 {

    public String reverseWords(String s) {
        if (s == null) return null;
        String[] splits = s.split(" ");
        return Arrays.stream(splits)
                .map(e -> new StringBuilder(e).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
