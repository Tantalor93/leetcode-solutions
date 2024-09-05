package com.github.tantalor93;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TraversalTest {

	@Test
	void bfs() {
		TreeNode treeNode = new TreeNode(5);
		treeNode.left = new TreeNode(4);
		treeNode.right = new TreeNode(9);
		treeNode.left.left = new TreeNode(3);
		treeNode.right.right = new TreeNode(10);
		treeNode.right.left = new TreeNode(8);
		Assertions.assertThat(Traversal.bfs(treeNode)).isEqualTo("5,4,9,3,8,10,");
	}

	@Test
	void dfs() {
		TreeNode treeNode = new TreeNode(5);
		treeNode.left = new TreeNode(4);
		treeNode.right = new TreeNode(9);
		treeNode.left.left = new TreeNode(3);
		treeNode.right.right = new TreeNode(10);
		treeNode.right.left = new TreeNode(8);
		Assertions.assertThat(Traversal.dfs(treeNode)).isEqualTo("5,9,10,8,4,3,");
	}
}
