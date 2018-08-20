package com.github.tantalor93;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * For example, given
 *
 * inorder = [9,3,15,20,7]
 * postorder = [9,15,7,20,3]
 * Return the following binary tree:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class Solution106 {


    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode treeNode = recBuild(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
        return treeNode;
    }

    private static TreeNode recBuild(int[] inorder,int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if(inEnd-inStart+1 <= 0) return null;
        if(postEnd-postStart+1 <= 0) return null;
        TreeNode node = new TreeNode(postorder[postEnd]);
        int i  = inStart;
        for (; i <= inEnd; i++) {
            if (inorder[i] == node.val) break;
        }
        if(i > inEnd) return  null;

        node.left = recBuild(inorder, postorder, inStart, i-1, postStart, postStart+(i-1-inStart+1)-1);

        if (i <= inEnd) {
            node.right = recBuild(inorder, postorder, i+1, inEnd,postStart+(i-1-inStart+1), postEnd-1);
        }
        return node;
    }
}
