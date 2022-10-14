package com.github.tantalor93.reversedigits;

// https://leetcode.com/problems/reverse-integer/
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
