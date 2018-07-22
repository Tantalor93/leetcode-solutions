package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution637Spec extends Specification {

    @Shared
    def instance = new Solution637()

    @Unroll
    def "should calculate average of levels in binary tree [#tree]"(TreeNode tree, def expected) {
        expect:
        instance.averageOfLevels(tree) == expected

        where:
        tree                                                                       | expected
        TreeNode.buildFromArray([3, 9, 20, null, null, 15, 7] as Integer[])        | [3, 14.5, 11]
        TreeNode.buildFromArray([2147483647, 2147483647, 2147483647] as Integer[]) | [2147483647, 2147483647]
        TreeNode.buildFromArray([] as Integer[])                                   | []
        TreeNode.buildFromArray([1] as Integer[])                                  | [1]
    }
}
