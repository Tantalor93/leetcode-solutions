package com.github.tantalor93.calendar;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/my-calendar-i/
public class Solution729 {

    static class MyCalendar {

        static class Tuple {
            int left;
            int right;

            Tuple(int left, int right) {
                this.left = left;
                this.right = right;
            }
        }

        List<Tuple> list;

        public MyCalendar() {
            list = new LinkedList<>();
        }

        public boolean book(int start, int end) {
            for (Tuple t : list) {
                if (t.left <= start && start < t.right) return false;
                if (t.left < end && end <= t.right) return false;
                if (t.left >= start && t.left < end && t.right >= start && t.right < end) return false;
            }
            list.add(new Tuple(start, end));
            return true;
        }
    }
}
