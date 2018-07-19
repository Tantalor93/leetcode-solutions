package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification

class Solution226Spec extends Specification {

    @Shared
    def instance = new Solution226()

    def "should invert tree"() {
        setup:
        def node = new TreeNode(4)
        def node1 = new TreeNode(2)
        def node2 = new TreeNode(7)
        def node3 = new TreeNode(1)
        def node4 = new TreeNode(3)
        def node5 = new TreeNode(6)
        def node6 = new TreeNode(9)

        node.left = node1
        node.right = node2
        node.left.left = node3
        node.left.right = node4
        node.right.left = node5
        node.right.right = node6

        expect:
        def tree = instance.invertTree(node)
        tree == node
        tree.left == node2
        tree.right == node1
        tree.left.left == node6
        tree.left.right == node5
        tree.right.left == node4
        tree.right.right == node3

    }
}
