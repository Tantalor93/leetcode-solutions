package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution856Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution856()

    @Unroll
    def "should calculate score of #s"() {
        expect:
        instance.scoreOfParentheses(s) == expected

        where:
        s          | expected
        "()"       | 1
        "(())"     | 2
        "()()"     | 2
        "(()(()))" | 6
    }
}
