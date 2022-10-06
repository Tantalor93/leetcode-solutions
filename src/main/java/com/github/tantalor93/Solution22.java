package com.github.tantalor93;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
	public static List<String> generateParenthesis(int n) {
		var l = new ArrayList<String>();
		backtracking(n, 0, "", l);
		return l;
	}

	private static void backtracking(int n, int toClose, String tmp, List<String> res) {
		if (n == 0 && toClose == 0) {
			res.add(tmp);
		}

		if (toClose > 0) {
			backtracking(n, toClose - 1, tmp + ")", res);
		}
		if (n > 0) {
			backtracking(n - 1, toClose + 1, tmp + "(", res);
		}
	}
}
