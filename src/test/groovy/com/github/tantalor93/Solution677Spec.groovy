package com.github.tantalor93

import spock.lang.Shared


class Solution677Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution677.MapSum()

    def "test"() {
        setup:
        instance.insert("apple", 3)
        instance.insert("app", 2)

        expect:
        instance.sum("ap") == 5
    }
}
