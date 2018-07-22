package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification

class Solution667Spec extends Specification {

    @Shared
    def instance = new Solution667.MapSum()

    def "test"() {
        setup:
        instance.insert("apple", 3)
        instance.insert("app", 2)

        expect:
        instance.sum("ap") == 5
    }
}
