package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution9Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution9()

    @Unroll
    def "should check if number #x is palindrome"(int x, def expected) {
        expect:
        instance.isPalindrome(x) == expected

        where:
        x    | expected
        121  | true
        -121 | false
        10   | false
        1    | true
        0    | true
        -1   | false

    }
}
