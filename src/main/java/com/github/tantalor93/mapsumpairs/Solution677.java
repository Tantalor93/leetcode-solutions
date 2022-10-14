package com.github.tantalor93.mapsumpairs;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/map-sum-pairs/
public class Solution677 {

    class MapSum {

        Map<String,Integer> map;

        /** Initialize your data structure here. */
        public MapSum() {
            map = new HashMap<>();
        }

        public void insert(String key, int val) {
            map.put(key,val);
        }

        public int sum(String prefix) {
            int sum = 0;
            for(Map.Entry<String,Integer> entry : map.entrySet()) {
                if(entry.getKey().startsWith(prefix)) sum += entry.getValue();
            }
            return sum;
        }
    }
}
