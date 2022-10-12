package com.github.tantalor93.serializedeserializetree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import com.github.tantalor93.TreeNode;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * Example:
 *
 * You may serialize the following tree:
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * as "[1,2,3,null,null,4,5]"
 * Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 *
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 */
public class Solution297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        final StringBuilder stringBuilder = new StringBuilder();
        while(!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if(poll == null) stringBuilder.append("null").append(" ");
            else {
                stringBuilder.append(poll.val).append(" ");
                queue.offer(poll.left);
                queue.offer(poll.right);
            }
        }

        final String s = stringBuilder.toString();
        final String[] split = s.split(" ");
        int i;
        for(i = split.length -1 ; i >=0 ; i--) {
            if(!split[i].equals("null")) {
                i++;
                break;
            }
        }
        String[] strings = Arrays.copyOfRange(split, 0, i);
        String collect = Arrays.stream(strings).collect(Collectors.joining(" "));
        return collect;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.isEmpty()) return null;
        final String[] split = data.split(" ");
        final Integer[] integerSplit = new Integer[split.length];
        for(int i = 0; i < split.length; i++) {
            if(split[i].equals("null")) integerSplit[i] = null;
            else integerSplit[i] = Integer.parseInt(split[i]);
        }
        if (integerSplit.length == 0) return null;
        final List<TreeNode> nodes =
                Arrays.stream(integerSplit)
                        .map(e -> {
                            if (e != null) {
                                return new TreeNode(e);
                            }
                            return null;
                        })
                        .collect(Collectors.toList());

        boolean[] used = new boolean[integerSplit.length];
        used[0] = true;

        for (int i = 0; i < integerSplit.length; i++) {
            if (nodes.get(i) == null) continue;
            for (int j = 0; j < used.length; j++) {
                if (!used[j]) {
                    nodes.get(i).left = nodes.get(j);
                    used[j] = true;
                    break;
                }
            }
            for (int j = 0; j < used.length; j++) {
                if (!used[j]) {
                    nodes.get(i).right = nodes.get(j);
                    used[j] = true;
                    break;
                }
            }
        }
        return nodes.get(0);
    }
}
