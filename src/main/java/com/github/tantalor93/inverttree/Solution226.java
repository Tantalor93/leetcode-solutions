package com.github.tantalor93.inverttree;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/invert-binary-tree/
public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
