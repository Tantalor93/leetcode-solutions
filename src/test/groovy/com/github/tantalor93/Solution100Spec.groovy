package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution100Spec extends Specification {

    @Shared
    def instance = new Solution100()

    @Unroll
    def "is same tree"(int[] preorderLeft, int[] inorderLeft, int[] preorderRight, int[] inorderRight, def expected) {
        given:
        def leftTree = TreeNode.buildFromInorderAndPreorder(preorderLeft, inorderLeft)
        def rightTree = TreeNode.buildFromInorderAndPreorder(preorderRight, inorderRight)

        expect:
        instance.isSameTree(leftTree, rightTree) == expected

        where:
        preorderLeft     | inorderLeft      | preorderRight    | inorderRight     | expected
        [1, 2, 3]        | [2, 1, 3]        | [1, 2, 3]        | [2, 1, 3]        | true
        [1, 2]           | [2, 1]           | [1, 2]           | [1, 2]           | false
        []               | []               | []               | []               | true
        [6, 4, 1, 10, 7] | [1, 4, 6, 7, 10] | [6, 4, 1, 10, 7] | [6, 4, 1, 10, 7] | false


    }
}
