package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution297Spec extends SolutionSpecification {
    @Shared
    def instance = new Solution297()

    @Unroll
    def "should serialize binary tree [#tree]"(def tree, def expected) {
        expect:
        instance.serialize(tree) == expected

        /*
            1
           /                                                              1
          2                                                             /   \
         /                                                              2   3
        3                                                                   / \
       /                    0 1 2    3 4    5  6   7 8                      4  5
                                                                    0 1 2 3    4    5 6
       4                    1,2,null,3,null,4,null,5,6              1,2,3,null,null,4,5
       / \
       5  6
         */
        where:
        tree                                                     | expected
        TreeNode.buildFromArray(1, 2, 3, null, null, 4, 5)       | "1 2 3 null null 4 5"
        TreeNode.buildFromArray(1, 2, null, 3, null, 4, null, 5) | "1 2 null 3 null 4 null 5"
        null                                                     | ""
        TreeNode.buildFromArray(1)                               | "1"
        TreeNode.buildFromArray(1, null, 3)                      | "1 null 3"
    }

    @Unroll
    def "should deserialize string '#data' into tree"(def data, def expected) {
        expect:
        instance.deserialize(data) == expected

        where:
        data                  | expected
        "1 2 3 null null 4 5" | TreeNode.buildFromArray(1, 2, 3, null, null, 4, 5)
        ""                    | null
        "1"                   | TreeNode.buildFromArray(1)
        "1 null 3"            | TreeNode.buildFromArray(1, null, 3)
    }
}
