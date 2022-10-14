package com.github.tantalor93.averageoflevels;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.github.tantalor93.TreeNode;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class Solution637 {

    static class Tuple {
        double n;
        double sum;

        Tuple(int n, int sum) {
            this.n = n;
            this.sum = sum;
        }

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Tuple> list = new ArrayList<>();
        goAvg(root, 0, list);
        return list.stream().map(e -> e.sum / e.n).collect(Collectors.toList());
    }

    private void goAvg(TreeNode node, int level, List<Tuple> list) {
        if(node == null) return;
        if(list.size() < level+1) {
            list.add(new Tuple(0,0));
        }
        Tuple tuple = list.get(level);

        tuple.n = tuple.n + 1;
        tuple.sum = tuple.sum + node.val;

        goAvg(node.left, level+1, list);
        goAvg(node.right, level+1, list);

    }
}
