package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution35Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution35()

    @Unroll
    def "should find insert position for #num in array #array"() {
        expect:
        instance.searchInsert(array as int[], num) == expected

        where:
        array        | num | expected
        [1, 3, 5, 6] | 5   | 2
        [1, 3, 5, 6] | 2   | 1
        [1, 3, 5, 6] | 7   | 4
        [1, 3, 5, 6] | 0   | 0
        []           | 1   | 0

    }
}
