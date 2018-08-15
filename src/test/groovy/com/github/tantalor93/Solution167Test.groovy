package com.github.tantalor93

import spock.lang.Unroll

class Solution167Test extends SolutionSpecification {

    @Unroll
    def "should find target sum #target in array #numbers"() {

        expect:
        Solution167.twoSum(numbers as int[], target) == expected as int[]

        where:
        numbers           | target | expected
        [2, 7, 11, 15]    | 9      | [1, 2]
        [2, 3, 9, 10, 23] | 13     | [2, 4]
        [1, 2, 3, 4, 5]   | 25     | null
        []                | 10     | null
    }
}
