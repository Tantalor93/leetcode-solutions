package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution104Spec extends Specification {

    @Shared
    def instance = new Solution104()

    @Unroll
    def "should find max depth #expected of tree"(int[] preorder, int[] inorder, int expected) {
        given:
        def tree = TreeNode.buildFromInorderAndPreorder(preorder, inorder)

        expect:
        instance.maxDepth(tree) == expected

        where:
        preorder          | inorder           | expected
        [3, 9, 20, 15, 7] | [9, 3, 15, 20, 7] | 3
        [9, 3, 20]        | [3, 9, 20]        | 2
        [3]               | [3]               | 1
        []                | []                | 0

    }
}
