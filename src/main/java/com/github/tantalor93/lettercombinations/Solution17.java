package com.github.tantalor93.lettercombinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class Solution17 {
	Map<Character,String> dict = Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");

	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();
		backtrack(digits, 0, new StringBuilder(), res);
		return res;
	}

	private void backtrack(String digits, int start, StringBuilder tmp, List<String> res) {
		if(start >= digits.length()) {
			if(tmp.length() == 0) {
				return;
			}
			res.add(tmp.toString());
			return;
		}
		var values = dict.get(digits.charAt(start));
		for(var i = 0; i < values.length(); i++) {
			tmp.append(values.charAt(i));
			backtrack(digits, start+1, tmp, res);
			tmp.deleteCharAt(tmp.length()-1);
		}
	}
}
