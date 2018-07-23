package com.github.tantalor93

import spock.lang.Specification

abstract class SolutionSpecification extends Specification {
    def newTree(def array) {
        TreeNode.buildFromArray(array as Integer[])
    }

    def newList(def array) {
        ListNode.fromArray(array as int[])
    }
}
