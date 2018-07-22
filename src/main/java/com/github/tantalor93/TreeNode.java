package com.github.tantalor93;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }

    static TreeNode buildFromInorderAndPreorder(int[] preorder, int[] inorder) {
        return new Solution105().buildTree(preorder, inorder);
    }

    static TreeNode buildFromArray(Integer[] array) {
        if (array.length == 0) return null;
        final List<TreeNode> nodes =
                Arrays.stream(array)
                        .map(e -> {
                            if (e != null) {
                                return new TreeNode(e);
                            }
                            return null;
                        })
                        .collect(Collectors.toList());
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i) != null) {
                if (2 * i + 1 < nodes.size()) {
                    nodes.get(i).left = nodes.get(2 * i + 1);
                }
                if (2 * i + 2 < nodes.size()) {
                    nodes.get(i).right = nodes.get(2 * i + 2);
                }
            }
        }
        return nodes.get(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        toString(this, stringBuilder);
        return stringBuilder.toString().trim();
    }

    void toString(TreeNode treeNode, StringBuilder strb) {
        if (treeNode == null) {
            return;
        }
        toString(treeNode.left, strb);
        strb.append(treeNode.val + " ");
        toString(treeNode.right, strb);

    }
}
