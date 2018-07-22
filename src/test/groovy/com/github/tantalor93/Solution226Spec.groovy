package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution226Spec extends Specification {

    @Shared
    def instance = new Solution226()

    @Unroll
    def "should invert tree #treeArray"(Integer[] treeArray, Integer[] expected) {
        given:
        def tree = TreeNode.buildFromArray(treeArray)
        def expectedTree = TreeNode.buildFromArray(expected)

        expect:
        instance.invertTree(tree) == expectedTree

        where:
        treeArray             | expected
        [4, 2, 7, 1, 3, 6, 9] | [4, 7, 2, 9, 6, 3, 1]
        []                    | []
        [1]                   | [1]
        [1, 3]                | [1, null, 3]

    }
}
