package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution22Spec extends SolutionSpecification {


    @Unroll
    def "generate parenthesis for #n"() {
        expect:
        Solution22.generateParenthesis(n) == expected

        where:
        n              | expected
        3              | ["()()()","()(())","(())()","(()())","((()))"]
        1              | ["()"]
    }
}
