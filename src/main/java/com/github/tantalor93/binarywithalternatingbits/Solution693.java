package com.github.tantalor93.binarywithalternatingbits;

// https://leetcode.com/problems/binary-number-with-alternating-bits/
public class Solution693 {

    public static boolean hasAlternatingBits(int n) {

        int previousBit = n & 1;
        n >>= 1;

        while(n > 0 ) {
            int i = n & 1;
            if(i == previousBit) return false;
            previousBit = i;
            n>>=1;
        }

        return true;
    }
}
