package com.github.tantalor93.allunique4sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/4sum/
public class Solution18 {
    // rozsirene reseni pro 3sum, pridame jeden cyklus
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < nums.length-3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length-2; j++) {
                if (j != i+1 && nums[j] == nums[j - 1]) continue;
                int low = j + 1;
                int high = nums.length-1;
                int sum = target - nums[i] - nums[j];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;

                        low++;
                        high--;
                    }
                    else if (nums[low] + nums[high] < sum) {
                        low++;
                    } else if (nums[low] + nums[high] > sum) {
                        high--;
                    }
                }
            }
        }
        return list;
    }
}
