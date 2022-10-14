package com.github.tantalor93.serializedeserializetree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
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
