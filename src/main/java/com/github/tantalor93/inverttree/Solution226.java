package com.github.tantalor93.inverttree;

import com.github.tantalor93.TreeNode;

//Invert a binary tree.
//
//        Example:
//
//        Input:
//
//        4
//        /   \
//        2     7
//        / \   / \
//        1   3 6   9
//        Output:
//
//        4
//        /   \
//        7     2
//        / \   / \
//        9   6 3   1
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
