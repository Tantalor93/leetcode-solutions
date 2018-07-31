package com.github.tantalor93;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }


    /**
     * builds tree nodes from Integer array
     * @param array of ints and nulls
     * @return {@link TreeNode} representation of array
     */
    static TreeNode buildFromArray(final Integer[] array) {
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

        boolean[] used = new boolean[array.length];
        used[0] = true;

        for (int i = 0; i < array.length; i++) {
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
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
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
}
