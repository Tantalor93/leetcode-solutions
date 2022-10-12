package com.github.tantalor93.scoreparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given a balanced parentheses string S, compute the score of the string based on the following rule:

() has score 1
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.


Example 1:
Input: "()"
Output: 1

Example 2:
Input: "(())"
Output: 2

Example 3:
Input: "()()"
Output: 2

Example 4:
Input: "(()(()))"
Output: 6


Note:

S is a balanced parentheses string, containing only ( and ).
2 <= S.length <= 50

 */
public class Solution856 {
    public int scoreOfParentheses(String S) {
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push("(");
            }
            if (S.charAt(i) == ')') {
                int num = 0;
                String pop = stack.pop();
                while(!pop.equals("(")) {
                    final Integer integer = Integer.valueOf(pop);
                    num += integer;
                    pop = stack.pop();
                }
                stack.push(num == 0 ? "1" : "" + 2*num);

            }
        }
        int cum = 0;
        while(!stack.isEmpty()) {
            cum += Integer.valueOf(stack.pop());
        }
        return cum;
    }
}
