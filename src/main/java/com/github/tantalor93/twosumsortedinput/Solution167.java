package com.github.tantalor93.twosumsortedinput;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Solution167 {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        while(j >= i) {
            if(numbers[i] + numbers[j] == target) return new int[]{++i,++j};
            else if(numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        return null;
    }
}
