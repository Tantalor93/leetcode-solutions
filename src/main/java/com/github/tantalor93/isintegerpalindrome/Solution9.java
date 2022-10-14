package com.github.tantalor93.isintegerpalindrome;

// https://leetcode.com/problems/palindrome-number/
public class Solution9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int palindrome = x;
        int reverse = 0;
        while(palindrome  != 0) {
            int rem = palindrome % 10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome / 10;
        }

        return x == reverse;
    }
}
