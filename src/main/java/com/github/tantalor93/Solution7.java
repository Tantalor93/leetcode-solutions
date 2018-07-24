package com.github.tantalor93;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class Solution7 {

    public int reverse(int x) {
        Integer obj = x;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            obj = (-1) * obj;
        }
        String reverseDigits = new StringBuilder(obj.toString()).reverse().toString();
        int reversedAsInt = 0;
        try {
            reversedAsInt = Integer.valueOf(((isNegative) ? "-" : "") + reverseDigits);
        } catch (NumberFormatException ex) {
            return 0;
        }
        return reversedAsInt;
    }

}
