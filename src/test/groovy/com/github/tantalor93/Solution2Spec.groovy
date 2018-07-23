package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution2Spec extends Specification {

    @Shared
    def instance = new Solution2()

    @Unroll
    def "add #num1 with #num2"(def num1, def num2, def expected) {
        expect:
        instance.addTwoNumbers(num1, num2) == expected

        where:
        num1                                   | num2                                   | expected
        ListNode.fromArray([2, 4, 3] as int[]) | ListNode.fromArray([5, 6, 4] as int[]) | ListNode.fromArray([7, 0, 8] as int[])
        ListNode.fromArray([1, 8] as int[])    | ListNode.fromArray([0] as int[])       | ListNode.fromArray([1, 8] as int[])
        ListNode.fromArray([5] as int[])       | ListNode.fromArray([5] as int[])       | ListNode.fromArray([0, 1] as int[])
        ListNode.fromArray([9, 8] as int[])    | ListNode.fromArray([1] as int[])       | ListNode.fromArray([0, 9] as int[])
        ListNode.fromArray([] as int[])        | ListNode.fromArray([] as int[])        | ListNode.fromArray([] as int[])

    }
}
