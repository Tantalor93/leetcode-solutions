package com.github.tantalor93;

/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
* */
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
