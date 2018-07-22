package com.github.tantalor93

import spock.lang.Specification
import spock.lang.Unroll

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

    @Unroll
    def "build from array"(Integer[] array, TreeNode expected) {
        expect:
        TreeNode.buildFromArray(array) == expected

        where:
        array                       | expected
        [3, 5]                      | node()
        [6, 4, 10, 1, null, 7]      | node2()
        [5, 4, 6, 3, null, null, 7] | node3()
        []                          | null
        [1]                         | new TreeNode(1)
    }

    def node() {
        def node = new TreeNode(3)
        node.left = new TreeNode(5)
        return node
    }

    def node2() {
        def node = new TreeNode(6)
        node.left = new TreeNode(4)
        node.right = new TreeNode(10)
        node.left.left = new TreeNode(1)
        node.right.left = new TreeNode(7)
        return node
    }

    def node3() {
        def node = new TreeNode(5)
        node.left = new TreeNode(4)
        node.left.left = new TreeNode(3)
        node.right = new TreeNode(6)
        node.right.right = new TreeNode(7)
        return node
    }
}
