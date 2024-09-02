package com.github.tantalor93.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

// https://leetcode.com/problems/merge-intervals/description/
public class Solution56 {

	// seradim si intervaly podle jejich startu a pak v linearnim case je projdu a ty prekryvajici se intervaly mergnu
	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, Comparator.comparingInt((int[] interval) -> interval[0]));

		Arrays.sort(intervals);

		LinkedList<int[]> list = new LinkedList<>();
		list.add(intervals[0]);
		for(var i = 1; i< intervals.length; i++) {
			if(intervals[i][0] > list.getLast()[1]) {
				list.add(intervals[i]);
			} else {
				list.getLast()[1] = Math.max(intervals[i][1], list.getLast()[1]);
			}
		}
		return list.toArray(new int[][]{});
	}
}
