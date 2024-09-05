package com.github.tantalor93;

import java.util.LinkedList;
import java.util.Stack;

public class Traversal {

	static String bfs(TreeNode root) {
		var queue = new LinkedList<TreeNode>();
		queue.add(root);
		StringBuilder strb = new StringBuilder();
		while (!queue.isEmpty()) {
			TreeNode head = queue.poll();
			if(head == null) {
				continue;
			}
			strb.append(head.val).append(",");
			queue.add(head.left);
			queue.add(head.right);
		}
		return strb.toString();
	}

	static String dfs(TreeNode root) {
		var stack = new Stack<TreeNode>();
		stack.add(root);
		StringBuilder strb = new StringBuilder();
		while (!stack.isEmpty()) {
			TreeNode head = stack.pop();
			if(head == null) {
				continue;
			}
			strb.append(head.val).append(",");
			stack.push(head.left);
			stack.push(head.right);
		}
		return strb.toString();
	}
}
