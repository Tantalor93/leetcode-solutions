package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification

class Solution112Spec extends Specification {
    
    @Shared
    def instance = new Solution112()

    def "test path sum"() {
        setup:
        def root = new TreeNode(5)
        def node4 = new TreeNode(4)
        def node11 = new TreeNode(11)
        def node7 = new TreeNode(7)
        def node2 = new TreeNode(2)
        def node8 = new TreeNode(8)
        def node13 = new TreeNode(13)
        def node4r = new TreeNode(4)
        def node1 = new TreeNode(1)

        root.left = node4
        root.right = node8
        node4.left = node11
        node8.left = node13
        node8.right = node4r
        node11.left = node7
        node11.right = node2
        node4r.right = node1

        expect:
        instance.hasPathSum(root, 22) == true
    }
}
