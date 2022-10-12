package com.github.tantalor93.allpathsum;

import java.util.ArrayList;
import java.util.List;

import com.github.tantalor93.TreeNode;

public class Solution113 {
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> res = new ArrayList<>();
		traverse(root, targetSum, 0, new ArrayList<>(), res);
		return res;
	}

	private void traverse(TreeNode node, int targetSum, int currentSum, List<Integer> acc, List<List<Integer>> res) {
		if(node == null) {
			return;
		}
		//leaf node
		if(node.left == null && node.right == null) {
			if(targetSum == currentSum + node.val) {
				acc.add(node.val);
				res.add(new ArrayList<>(acc));
				acc.remove(acc.size()-1);
			}
			return;
		}
		//other node
		acc.add(node.val);
		traverse(node.left, targetSum, currentSum+node.val, acc, res);
		traverse(node.right, targetSum, currentSum+node.val, acc, res);
		acc.remove(acc.size()-1);

	}
}
