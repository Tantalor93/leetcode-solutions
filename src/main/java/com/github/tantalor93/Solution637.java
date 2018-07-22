package com.github.tantalor93;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.*/
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
