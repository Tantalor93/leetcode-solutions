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
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^(31),  2^(31 − 1)]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class Solution7 {

    // funguje to tak ze vezmu kladnou hodnotu X a budu postupne pocitat res = res * 10 + (val%10) a zmensim val/10, dale musim kontrolovat ze mi
    // operace res = res * 10 + (val%10) nepretece a to dokazu jednoduchym porovnanim jeste pred danou operaci res > Integer.MAX_VALUE/10
    public int reverse(int x) {
        var val = Math.abs(x);
        var isnegative = x < 0;
        var res = 0;
        while(val > 0) {
            if(res > Integer.MAX_VALUE/10) {
                return 0;
            }
            var tmp = val%10;
            res =res * 10 + tmp;
            val /=10;
        }
        return isnegative? -res : res;
    }

}
