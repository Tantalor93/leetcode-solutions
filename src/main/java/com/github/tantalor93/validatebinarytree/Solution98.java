package com.github.tantalor93.validatebinarytree;

import java.util.LinkedList;
import java.util.List;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/validate-binary-search-tree/
public class Solution98 {
    public static boolean isValidBST(TreeNode root) {
        final List<Integer> list = new LinkedList();
        go(root, list);
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static void go(TreeNode root, List<Integer> list) {
        if(root == null) return;
        go(root.left, list);
        list.add(root.val);
        go(root.right, list);
    }

}
