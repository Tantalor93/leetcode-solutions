package com.github.tantalor93.combinationsum;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		var res = new ArrayList<List<Integer>>();
		generate(candidates,0, target, new ArrayList<>(), res);
		return res;
	}

	private static void generate(int[] candidates, int start,  int target, List<Integer> tmp, List<List<Integer>> res) {
		if(target == 0) {
			res.add(new ArrayList<>(tmp));
			return;
		}
		if(target < 0) {
			return;
		}
		for(var i = start; i < candidates.length; i++) {
			tmp.add(candidates[i]);
			generate(candidates, i, target-candidates[i], tmp, res);
			tmp.remove(tmp.size()-1);
		}
	}
}
