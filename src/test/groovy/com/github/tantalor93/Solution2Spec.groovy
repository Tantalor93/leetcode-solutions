package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution2Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution2()

    @Unroll
    def "add #num1 with #num2"(def num1, def num2, def expected) {
        expect:
        instance.addTwoNumbers(num1, num2) == expected

        where:
        num1               | num2               | expected
        newList([2, 4, 3]) | newList([5, 6, 4]) | newList([7, 0, 8])
        newList([1, 8])    | newList([0])       | newList([1, 8])
        newList([5])       | newList([5])       | newList([0, 1])
        newList([9, 8])    | newList([1])       | newList([0, 9])
        newList([])        | newList([])        | newList([])

    }
}
