package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution20Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution20()

    @Unroll
    def "is valid parentheses in #string"() {
        expect:
        instance.isValid(string) == expected

        where:
        string   | expected
        "()"     | true
        "()[]{}" | true
        "(]"     | false
        "([)]"   | false
        "{[]}"   | true
        "{[]}"   | true
    }
}
