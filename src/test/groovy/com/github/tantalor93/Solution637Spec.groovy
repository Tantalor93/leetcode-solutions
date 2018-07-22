package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification

class Solution637Spec extends Specification {
    
    @Shared
    def instance = new Solution637()

    def "should calculate average of levels in binary tree"() {
        setup:
        TreeNode root = new TreeNode(3)
        TreeNode node9 = new TreeNode(9)
        TreeNode node20 = new TreeNode(20)
        TreeNode node15 = new TreeNode(15)
        TreeNode node7 = new TreeNode(7)

        root.left = node9
        root.right = node20
        node20.left = node15
        node20.right = node7

        expect:
        instance.averageOfLevels(root) == [3, 14.5, 11]
    }

    def "should calculate average of levels in binary tree - overflow"() {
        setup:
        TreeNode root = new TreeNode(2147483647)
        TreeNode node1 = new TreeNode(2147483647)
        TreeNode node2 = new TreeNode(2147483647)


        root.left = node1
        root.right = node2

        expect:
        instance.averageOfLevels(root) == [2147483647.0,2147483647.0]
    }
}
