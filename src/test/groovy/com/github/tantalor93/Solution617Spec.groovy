package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution617Spec extends Specification {

    @Shared
    def instance = new Solution617()

    @Unroll
    def "should merge tree #t1 with tree #t2"(def t1, def t2, def expected) {
        expect:
        instance.mergeTrees(t1, t2) == expected

        where:
        t1                                                 | t2                                                                | expected
        TreeNode.buildFromArray([1, 3, 2, 5] as Integer[]) | TreeNode.buildFromArray([2, 1, 3, null, 4, null, 7] as Integer[]) | TreeNode.buildFromArray([3, 4, 5, 5, 4, null, 7] as Integer[])
        TreeNode.buildFromArray([] as Integer[])           | TreeNode.buildFromArray([] as Integer[])                          | TreeNode.buildFromArray([] as Integer[])
        TreeNode.buildFromArray([1] as Integer[])          | TreeNode.buildFromArray([] as Integer[])                          | TreeNode.buildFromArray([1] as Integer[])
        TreeNode.buildFromArray([1, 3, 2] as Integer[])    | TreeNode.buildFromArray([1] as Integer[])                         | TreeNode.buildFromArray([2, 3, 2] as Integer[])
    }

}
