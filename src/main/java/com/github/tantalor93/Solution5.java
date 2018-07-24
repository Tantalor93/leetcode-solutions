package com.github.tantalor93;

public class Solution5 {

    public String longestPalindrome(String s) {
        if(s.length() == 1) {
            return s;
        }
        if(s.length() == 2){
            return (s.charAt(0) == s.charAt(1))? s : "";
        }

        int length = 0;
        String res = "";
        for (int i = 1; i <= s.length() - 2; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int size = i - j;
                if (i + size >= s.length()) {
                    break;
                }
                if (s.charAt(i + size) == s.charAt(j)) {
                    if (2*size +1 > length) {
                        length = 2*size + 1;
                        res = s.substring(i-size, i+size+1);
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = 1; i <= s.length() - 1; i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                if(2 > length) {
                    length = 2;
                    res = s.charAt(i-1) + "" + s.charAt(i);
                }
                for(int j = i - 2; j >= 0; j--) {
                    int size = i-1-j;
                    if (i + size >= s.length()) {
                        break;
                    }
                    if(s.charAt(j) == s.charAt(i+size)) {
                        if (2*size + 2 > length) {
                            length = 2*size +2 ;
                            res = s.substring(j, i+size+1);
                        }
                    }
                    else {
                        break;
                    }
                }
            }
        }

        if(length == 0 && s.length() != 0) {
            return String.valueOf(s.charAt(0));
        }

        return res;
    }

}
