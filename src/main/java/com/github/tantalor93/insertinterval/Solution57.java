package com.github.tantalor93.insertinterval;

import java.util.LinkedList;

public class Solution57 {

	public static int[][] insert(int[][] intervals, int[] newInterval) {
		if (intervals.length == 0) {
			return new int[][] { newInterval };
		}
		var list = new LinkedList<int[]>();
		var inserted = false;
		var i = 0;
		if (intervals[0][0] < newInterval[0]) {
			list.add(intervals[0]);
			i++;
		} else {
			list.add(newInterval);
			inserted = true;
		}

		while (i < intervals.length) {
			if (intervals[i][0] < newInterval[0] || inserted) {
				var prev = list.getLast();
				var current = intervals[i];
				if (prev[1] >= current[0]) {
					prev[1] = Math.max(prev[1], current[1]);
				} else {
					list.add(current);
				}
				i++;
			} else if (!inserted) {
				inserted = true;
				var prev = list.getLast();
				var current = newInterval;
				if (prev[1] >= current[0]) {
					prev[1] = Math.max(prev[1], current[1]);
				} else {
					list.add(current);
				}
			}
		}
		if (!inserted) {
			var prev = list.getLast();
			var current = newInterval;
			if (prev[1] >= current[0]) {
				prev[1] = Math.max(prev[1], current[1]);
			} else {
				list.add(current);
			}
		}

		return list.toArray(new int[list.size()][]);
	}
}
