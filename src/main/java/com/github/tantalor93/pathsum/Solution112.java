package com.github.tantalor93.pathsum;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/path-sum/
public class Solution112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return go(root,sum,0);
    }

    private boolean go(TreeNode node, int sum, int acc) {
        if(node == null) return false;
        if(node.left == null && node.right == null) return sum == acc + node.val;
        return go(node.left, sum, acc + node.val) || go(node.right, sum, acc + node.val);
    }
}
