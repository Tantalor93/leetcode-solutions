package com.github.tantalor93.sametree;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/same-tree/
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }
}
