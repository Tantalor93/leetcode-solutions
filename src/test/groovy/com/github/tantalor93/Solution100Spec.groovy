package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution100Spec extends Specification {

    @Shared
    def instance = new Solution100()

    @Unroll
    def "is same tree left=[#left] right=[#right]"(TreeNode left, TreeNode right, def expected) {

        expect:
        instance.isSameTree(left, right) == expected

        where:
        left                                                | right                                                              | expected
        TreeNode.buildFromArray([1, 2, 3] as Integer[])     | TreeNode.buildFromArray([1, 2, 3] as Integer[])                    | true
        TreeNode.buildFromArray([1, 2] as Integer[])        | TreeNode.buildFromArray([1, null, 2] as Integer[])                 | false
        TreeNode.buildFromArray([] as Integer[])            | TreeNode.buildFromArray([] as Integer[])                           | true
        TreeNode.buildFromArray([6, 4, 10, 1] as Integer[]) | TreeNode.buildFromArray([6, 4, 10, 1, null, null, 7] as Integer[]) | false

    }
}
