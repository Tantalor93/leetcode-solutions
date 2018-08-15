package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution105Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution105()

    def "should build tree from inorder and preorder traversals"() {
        when:
        TreeNode result = instance.buildTree((int[]) [3, 9, 20, 15, 7], (int[]) [9, 3, 15, 20, 7])

        then:
        result == getExpected()
    }


    @Unroll
    def "should not be able to build tree from inorder and preorder traversals"() {
        when:
        instance.buildTree(preorder as int[], inorder as int[])

        then:
        thrown(IllegalArgumentException)

        where:
        preorder          | inorder
        [3, 9, 20, 15]    | [9, 3, 15, 20, 7]
        [9, 3, 15, 20, 7] | [9, 3, 15, 20, 6]

    }

    def getExpected() {
        def node = new TreeNode(3)
        node.left = new TreeNode(9)
        node.right = new TreeNode(20)
        node.right.left = new TreeNode(15)
        node.right.right = new TreeNode(7)
        return node
    }
}
