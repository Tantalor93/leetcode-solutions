package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution224Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution224()

    @Unroll
    def "should parse string #string and calculate result #expected"() {
        expect:
        instance.calculate(string) == expected

        where:
        string                | expected
        "1 + 1"               | 2
        " 2-1 + 2 "           | 3
        "(1+(4+5+2)-3)+(6+8)" | 23
    }
}
