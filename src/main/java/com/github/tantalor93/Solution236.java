package com.github.tantalor93;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution236 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		List<TreeNode> ppath = new ArrayList<>();
		List<TreeNode> qpath = new ArrayList<>();

		getPath(root,p, ppath);
		getPath(root,q, qpath);

		Set<TreeNode> set = new HashSet<>(ppath);
		for(var i = qpath.size()-1; i >= 0; i--) {
			if(set.contains(qpath.get(i))) {
				return qpath.get(i);
			}
		}
		return null;
	}

	private boolean getPath(TreeNode node, TreeNode target, List<TreeNode> acc) {
		if(node == null) {
			return false;
		}
		acc.add(node);
		if(node == target) {
			return true;
		}
		if(getPath(node.left, target, acc)) {
			return true;
		}
		if(getPath(node.right, target, acc)) {
			return true;
		}
		acc.remove(acc.size()-1);
		return false;
	}
}
