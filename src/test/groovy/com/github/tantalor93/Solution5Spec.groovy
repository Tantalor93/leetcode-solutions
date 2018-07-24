package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution5Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution5()

    @Unroll
    def "longest palindromic substring in string #s"(def s, def expected) {
        expect:
        instance.longestPalindrome(s) == expected

        where:
        s       | expected
        "babad" | "bab"
        "cbbd"  | "bb"
        "aaaa"  | "aaaa"
        "abb"   | "bb"
        "abcda" | "a"
    }
}
