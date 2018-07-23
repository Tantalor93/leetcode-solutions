package com.github.tantalor93;

import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
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
