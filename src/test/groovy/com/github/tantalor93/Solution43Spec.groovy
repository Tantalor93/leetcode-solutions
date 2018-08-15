package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution43Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution43()

    @Unroll
    def "should multiply #num1 and #num2"() {

        expect:
        instance.multiply(num1, num2) == expected

        where:
        num1    | num2  | expected
        "2"     | "3"   | "6"
        "123"   | "456" | "56088"
        '0'     | "0"   | "0"
        "12345" | "1"   | "12345"
    }
}
