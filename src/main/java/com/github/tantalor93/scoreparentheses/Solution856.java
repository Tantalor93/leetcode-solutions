package com.github.tantalor93.scoreparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/score-of-parentheses/
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
