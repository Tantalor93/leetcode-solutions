package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution226Spec extends Specification {

    @Shared
    def instance = new Solution226()

    @Unroll
    def "should invert tree [#tree]"(TreeNode tree, TreeNode expected) {
        expect:
        instance.invertTree(tree) == expected

        where:
        tree                                                        | expected
        TreeNode.buildFromArray([4, 2, 7, 1, 3, 6, 9] as Integer[]) | TreeNode.buildFromArray([4, 7, 2, 9, 6, 3, 1] as Integer[])
        TreeNode.buildFromArray([] as Integer[])                    | TreeNode.buildFromArray([] as Integer[])
        TreeNode.buildFromArray([1] as Integer[])                   | TreeNode.buildFromArray([1] as Integer[])
        TreeNode.buildFromArray([1, 3] as Integer[])                | TreeNode.buildFromArray([1, null, 3] as Integer[])

    }
}
