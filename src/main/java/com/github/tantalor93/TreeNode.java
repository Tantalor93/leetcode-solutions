package com.github.tantalor93;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        toString(this, stringBuilder);
        return stringBuilder.toString().trim();
    }

    void toString(TreeNode treeNode, StringBuilder strb) {
        if(treeNode == null) {
            return;
        }
        toString(treeNode.left, strb);
        strb.append(treeNode.val + " ");
        toString(treeNode.right, strb);

    }
}
