package com.github.tantalor93;

import java.util.Stack;

public class Solution155 {
	static class MinStack {

		private Stack<Integer> stack;
		private Stack<Integer> minstack;

		public MinStack() {
			this.stack = new Stack<>();
			this.minstack = new Stack<>();
		}

		public void push(int val) {
			if(this.stack.isEmpty()) {
				this.stack.add(val);
				this.minstack.add(val);
				return;
			}

			this.stack.add(val);
			if(this.stack.peek() < this.minstack.peek()) {
				this.minstack.add(this.stack.peek());
			} else {
				this.minstack.add(this.minstack.peek());
			}

		}

		public void pop() {
			this.stack.pop();
			this.minstack.pop();
		}

		public int top() {
			return this.stack.peek();

		}

		public int getMin() {
			return this.minstack.peek();
		}
	}
}
