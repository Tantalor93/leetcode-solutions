package com.github.tantalor93.constructbinaryfrompreorderandinorder;

import java.util.Arrays;

import com.github.tantalor93.TreeNode;

/*
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
* */
public class Solution105 {
    static class MutableInt {
        int val;

        MutableInt() {
            val = 0;
        }

        void increment() {
            val++;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length) {
            throw new IllegalArgumentException("preorder and inorder arrays must match in size");
        }
        for(int i = 0 ; i < preorder.length; i++) {
            final int finalI = i;
            if(!Arrays.stream(inorder).anyMatch(e -> preorder[finalI] == e)) {
                throw new IllegalArgumentException("preorder and inorder arrays must match in elements");
            }
        }
        return recBuild(preorder, inorder, 0, inorder.length - 1, new MutableInt());
    }

    private TreeNode recBuild(int[] preorder, int[] inorder, int inLeftBound, int inRightBound, MutableInt preStart) {
        if (inLeftBound > inRightBound) return null;
        int val = preorder[preStart.val];
        preStart.increment();
        TreeNode node = new TreeNode(val);

        int i = inLeftBound;
        for (; i <= inRightBound; i++) {
            if (inorder[i] == val) {
                break;
            }
        }
        if (i > inRightBound) return null;

        node.left = recBuild(preorder, inorder, inLeftBound, i - 1, preStart);
        node.right = recBuild(preorder, inorder, i + 1, inRightBound, preStart);

        return node;
    }
}
