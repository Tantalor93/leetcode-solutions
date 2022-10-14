package com.github.tantalor93.maximumdepthbinarytree;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Solution104 {

    public int maxDepth(TreeNode root) {
        return go(root, 0);
    }

    private int go(TreeNode node, int depth) {
        if(node == null) return depth;
        depth++;
        return Math.max(go(node.left, depth),go(node.right, depth));
    }
}
