package com.github.tantalor93

import spock.lang.Unroll

class Solution106Spec extends SolutionSpecification {

    @Unroll
    def "should construct valid tree #tree from inorder #inorder and postorder #postorder"() {
        expect:
        Solution106.buildTree(inorder as int[], postorder as int[]) == expected

        where:
        inorder         | postorder       | expected
        [1, 2, 3, 4, 5] | [1, 4, 5, 3, 2] | getExpected()
    }

    def getExpected() {
        def node = new TreeNode(2)
        node.left = new TreeNode(1)
        node.right = new TreeNode(3)
        node.right.right = new TreeNode(5)
        node.right.right.left = new TreeNode(4)
        return node
    }
}
