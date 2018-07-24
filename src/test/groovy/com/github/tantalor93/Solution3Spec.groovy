package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution3Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution3()

    @Unroll
    def "length of longest substring of string #s without repeating characters"(def s, def expected) {
        expect:
        instance.lengthOfLongestSubstring(s) == expected

        where:
        s          | expected
        "abcabcbb" | 3
        "bbbbb"    | 1
        "pwwkew"   | 3
        ""         | 0
        "c"        | 1

    }
}
