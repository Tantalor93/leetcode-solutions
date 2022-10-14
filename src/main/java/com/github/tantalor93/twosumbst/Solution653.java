package com.github.tantalor93.twosumbst;

import java.util.HashSet;
import java.util.Set;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
public class Solution653 {
	public boolean findTarget(TreeNode root, int k) {
		Set<Integer> set = new HashSet<>();
		return find(root, k, set);
	}

	private boolean find(TreeNode node, int k, Set<Integer> acc) {
		if(node == null) {
			return false;
		}
		if(acc.contains(k - node.val)) {
			return true;
		}
		acc.add(node.val);
		return find(node.left, k, acc) || find(node.right, k, acc);
	}
}
