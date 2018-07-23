package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution14Spec extends SolutionSpecification {
    @Shared
    def instance = new Solution14()

    @Unroll
    def "should find longest common prefix of #strings"(String[] strings, String expected) {
        expect:
        instance.longestCommonPrefix(strings) == expected

        where:
        strings                      | expected
        ["flower", "flow", "flight"] | "fl"
        ["dog", "racecar", "car"]    | ""
        []                           | ""
    }
}
