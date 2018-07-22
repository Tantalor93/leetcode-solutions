package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution637Spec extends Specification {

    @Shared
    def instance = new Solution637()

    @Unroll
    def "should calculate average of levels in binary tree #treeArray"(Integer[] treeArray, def expected) {
        given:
        TreeNode node = TreeNode.buildFromArray(treeArray)

        expect:
        instance.averageOfLevels(node) == expected

        where:
        treeArray                            | expected
        [3, 9, 20, null, null, 15, 7]        | [3, 14.5, 11]
        [2147483647, 2147483647, 2147483647] | [2147483647, 2147483647]
        []                                   | []
        [1]                                  | [1]
    }
}
