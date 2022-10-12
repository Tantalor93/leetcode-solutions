package com.github.tantalor93.validatebinarytree;

import java.util.LinkedList;
import java.util.List;

import com.github.tantalor93.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 *
 * Input:
 *     2
 *    / \
 *   1   3
 * Output: true
 * Example 2:
 *
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * Output: false
 * Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
 *              is 5 but its right child's value is 4.
 */
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
