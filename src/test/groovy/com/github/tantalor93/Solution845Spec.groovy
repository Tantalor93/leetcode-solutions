package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution845Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution845()

    @Unroll
    def "should find longest mountain for input"() {
        expect:
        instance.longestMountain(input as int[]) == expected

        where:
        input                             | expected
        [0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0] | 11
        []                                | 0
        [0, 1, 2, 3, 0, 1, 2, 1]          | 5
        [5, 4, 3, 4, 5]                   | 0
        null                              | 0
    }
}
