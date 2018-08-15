package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution191Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution191()

    @Unroll
    def "should count hamming weight of #n"() {
        expect:
        instance.hammingWeight(n) == expected

        where:
        n   | expected
        11  | 3
        128 | 1
        0   | 0
    }
}
