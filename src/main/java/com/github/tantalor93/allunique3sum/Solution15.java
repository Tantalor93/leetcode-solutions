package com.github.tantalor93.allunique3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/
public class Solution15 {
    // pouzijeme postup ze si prvni setridime cisla v poli a pak muzeme postupne fixovat prvni cislo z trojice a na posledni
    // dve cisla z trojice muzeme zjistit pomoci techniky dvou pointeru (zepredu a zezadu)
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] < sum) {
                    low++;
                }
                else if (nums[low] + nums[high] > sum) {
                    high--;
                }
                else if (nums[low] + nums[high] == sum) {
                    list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low+1]) low++;
                    while (low < high && nums[high] == nums[high-1]) high--;

                    low++;
                    high--;
                }
            }
        }
        return list;
    }
}
