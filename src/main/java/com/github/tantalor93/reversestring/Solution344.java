package com.github.tantalor93.reversestring;

// https://leetcode.com/problems/reverse-string/
public class Solution344 {

    public String reverseString(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

}
