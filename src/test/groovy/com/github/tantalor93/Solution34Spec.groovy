package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution34Spec extends SolutionSpecification {

    @Shared
    def instace = new Solution34()

    @Unroll
    def "should find first and last position of element #num in array #array"() {

        expect:
        instace.searchRange(array as int[], num) == expected as int[]

        where:
        array               | num | expected
        [5, 7, 7, 8, 8, 10] | 8   | [3, 4]
        [5, 7, 7, 8, 8, 10] | 6   | [-1, -1]
        [1, 4]              | 4   | [1, 1]
    }
}
