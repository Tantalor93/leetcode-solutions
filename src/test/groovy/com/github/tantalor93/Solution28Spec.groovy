package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution28Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution28()

    @Unroll
    def "should try to find #needle in #haystack"(def needle, def haystack, def expected) {
        expect:
        instance.strStr(haystack, needle) == expected

        where:
        needle | haystack | expected
        "ll"   | "hello"  | 2
        "bba"  | "aaaaa"  | -1
        "a"    | "aaa"    | 0

    }
}
