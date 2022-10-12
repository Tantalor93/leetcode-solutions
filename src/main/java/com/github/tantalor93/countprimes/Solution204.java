package com.github.tantalor93.countprimes;


/**
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class Solution204 {

    public static int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        boolean[] sieve = new boolean[n];
        sieve[0] = true;
        sieve[1] = true;

        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) continue;
            int j = 2;
            while (j * i < n) {
                sieve[j * i] = true;
                j++;
            }
        }

        int count = 0;
        for (int i = 0; i < sieve.length; i++) {
            if (!sieve[i]) count++;
        }

        return count;
    }

}
