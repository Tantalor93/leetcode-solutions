package com.github.tantalor93

import spock.lang.Unroll

class Solution658Spec extends SolutionSpecification {

    @Unroll
    def "should find k=#k closest elements in array #arr for x=#x"() {
        expect:
        Solution658.findClosestElements(arr as int[], k, x) == expected

        where:
        arr                            | k | x  | expected
        [0, 0, 1, 2, 3, 3, 4, 7, 7, 8] | 3 | 5  | [3, 3, 4]
        [1, 2, 3, 4, 5]                | 4 | 3  | [1, 2, 3, 4]
        [1, 2, 3, 4, 5]                | 4 | 6  | [2, 3, 4, 5]
        [1, 2, 3, 4, 5]                | 4 | -1 | [1, 2, 3, 4]
        [1, 2, 3, 4, 5]                | 4 | 1  | [1, 2, 3, 4]
    }
}
