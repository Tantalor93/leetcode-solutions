package com.github.tantalor93.checkparenthesis;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(0);
            }
            else if(s.charAt(i) == '{') {
                stack.push(1);
            }
            else if(s.charAt(i) == '[') {
                stack.push(2);
            }
            else if(stack.isEmpty()) return false;
            else if(s.charAt(i) == ')') {
                if(stack.pop() != 0) {
                    return false;
                }
            }
            else if(s.charAt(i) == '}') {
                if(stack.pop() != 1) {
                    return false;
                }
            }
            else if(s.charAt(i) == ']') {
                if(stack.pop() != 2) {
                    return false;
                }
            }
        }

        if(!stack.empty()) {
            return false;
        }
        return true;
    }
}
