package com.github.tantalor93;

import java.util.List;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * Note:
 * <p>
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 * Example 1:
 * <p>
 * Input: s = "leetcode", wordDict = ["leet", "code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 * <p>
 * Input: s = "applepenapple", wordDict = ["apple", "pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 * Example 3:
 * <p>
 * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * Output: false
 */
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
