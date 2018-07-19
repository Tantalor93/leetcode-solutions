package com.github.tantalor93

import spock.lang.Specification

class TreeNodeSpec extends Specification {

    def "toString inorder"() {

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
        node.toString() == "1 2 3 4 6 7 9"

    }
}
