package com.github.tantalor93.wordbreak;

import java.util.List;

// https://leetcode.com/problems/word-break/
public class Solution139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        return go(s, 0, new Boolean[s.length()], wordDict); //dynamic programming solution
    }

    // mem[start] is true if s[start..s.length()-1] can be segmented into word dict
    private boolean go(String s, int start, Boolean[] mem, List<String> wordDict) {
        if (start == s.length()) return true;
        if (mem[start] != null) return mem[start];

        for (int i = 0; i < wordDict.size(); i++) {
            final String word = wordDict.get(i);
            if (s.substring(start).startsWith(word)) {
                boolean go = go(s, start + word.length(), mem, wordDict);
                if (go) return mem[start] = true;
            }   
        }
        return mem[start] = false;
    }
}
