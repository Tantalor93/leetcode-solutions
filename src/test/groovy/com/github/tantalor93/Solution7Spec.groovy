package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution7Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution7()

    @Unroll
    def "should reverse digits in integer #n"() {
        expect:
        instance.reverse(n) == expected

        where:
        n    | expected
        123  | 321
        -123 | -321
        120  | 21
        0    | 0
    }
}
