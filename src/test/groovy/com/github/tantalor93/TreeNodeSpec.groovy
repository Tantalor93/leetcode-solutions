package com.github.tantalor93


import spock.lang.Unroll

class TreeNodeSpec extends SolutionSpecification {

    @Unroll
    def "toString inorder [#tree]"(def tree, def expected) {
        expect:
        tree.toString() == expected

        where:
        tree            | expected
        node()          | "3 5 null"
        node2()         | "6 4 10 1 null 7 null"
        node3()         | "5 4 6 3 null null 7"
        node4()         | "1 2 null 3 null 4 null 5 null"
        node5()         | "4 2 7 1 3 6 9"
        new TreeNode(0) | "0"
    }

    @Unroll
    def "build from array #array"(Integer[] array, TreeNode expected) {
        expect:
        newTree(array) == expected

        where:
        array                             | expected
        [1, 2, null, 3, null, 4, null, 5] | node4()
        [3, 5]                            | node()
        [6, 4, 10, 1, null, 7]            | node2()
        [5, 4, 6, 3, null, null, 7]       | node3()
        []                                | null
        [1]                               | new TreeNode(1)
        [4, 2, 7, 1, 3, 6, 9]             | node5()
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

    def node4() {
        def node = new TreeNode(1)
        node.left = new TreeNode(2)
        node.left.left = new TreeNode(3)
        node.left.left.left = new TreeNode(4)
        node.left.left.left.left = new TreeNode(5)
        return node
    }

    def node5() {
        def node = new TreeNode(4)
        node.left = new TreeNode(2)
        node.right = new TreeNode(7)
        node.left.left = new TreeNode(1)
        node.left.right = new TreeNode(3)
        node.right.left = new TreeNode(6)
        node.right.right = new TreeNode(9)
        return node
    }
}
