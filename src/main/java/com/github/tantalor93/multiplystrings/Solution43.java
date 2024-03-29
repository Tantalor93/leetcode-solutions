package com.github.tantalor93.multiplystrings;

// https://leetcode.com/problems/multiply-strings/
public class Solution43 {
    public String multiply(String num1, String num2) {
        char[] res = new char[num1.length() + num2.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = Character.forDigit(0, 10);
        }

        int skip = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            int n2 = Character.getNumericValue(num2.charAt(i));
            int carry = 0;
            int k = res.length - 1;
            for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
                if (j < 0) {
                    res[k - skip] = Character.forDigit(carry, 10);
                    carry = 0;
                    break;
                }
                int n1 = Character.getNumericValue(num1.charAt(j));
                int n = n2 * n1;
                int newNum = Character.getNumericValue(res[k - skip]) + n + carry;
                res[k - skip] = Character.forDigit(newNum % 10, 10);
                carry = newNum / 10;
                k--;
            }
            skip++;
        }
        String str = new String(res).replaceFirst("^0", "");
        return str.length() == 0 ? "0" : str;

    }
}
