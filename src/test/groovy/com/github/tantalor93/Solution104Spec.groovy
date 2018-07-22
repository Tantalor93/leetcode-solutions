package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution104Spec extends Specification {

    @Shared
    def instance = new Solution104()

    @Unroll
    def "should find max depth of tree [#tree]"(TreeNode tree, int expected) {

        expect:
        instance.maxDepth(tree) == expected

        where:
        tree                                                                | expected
        TreeNode.buildFromArray([3, 9, 20, null, null, 15, 7] as Integer[]) | 3
        TreeNode.buildFromArray([3, 9, 20] as Integer[])                    | 2
        TreeNode.buildFromArray([3] as Integer[])                           | 1
        TreeNode.buildFromArray([] as Integer[])                            | 0

    }
}
