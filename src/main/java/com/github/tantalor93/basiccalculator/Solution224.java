package com.github.tantalor93.basiccalculator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.BinaryOperator;

// https://leetcode.com/problems/basic-calculator/
//Implement a basic calculator to evaluate a simple expression string.
//
//The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
public class Solution224 {

    public int calculate(String s) {
        Deque<String> stack = new ArrayDeque<>();

        s = "(" + s + ")";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') continue;
            else if (s.charAt(i) == '(') stack.addFirst("" + s.charAt(i));
            else if (s.charAt(i) == ')') {
                Deque<String> queue = new ArrayDeque<String>();
                String c;
                do {
                    c = stack.removeFirst();
                    queue.addFirst(c);
                } while (!c.equals("("));
                queue.removeFirst();

                int left = Integer.parseInt(queue.removeFirst());
                BinaryOperator<Integer> op = (n1, n2) -> n1 + n2;
                for (String x : queue) {
                    if (x.equals("+")) op = (n1, n2) -> n1 + n2;
                    else if (x.equals("-")) op = (n1, n2) -> n1 - n2;
                    else {
                        left = op.apply(left, Integer.parseInt(x));
                    }
                }
                stack.addFirst("" + new Integer(left).toString());

            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') stack.addFirst("" + s.charAt(i));
            else {

                StringBuilder strb = new StringBuilder();
                for (; i < s.length(); i++) {
                    if (s.charAt(i) == ' ' || s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-')
                        break;
                    strb.append(s.charAt(i));
                }
                i--;
                stack.addFirst(strb.toString());
            }
        }
        return Integer.parseInt(stack.removeFirst());
    }

}
