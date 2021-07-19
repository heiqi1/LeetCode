package com.lxs.algorithm.leetcode.algorithm001_050.algorithm05;

public class LongestPalindromicSubstring3 {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int start = 0, end = 0;
        //i表示字符串长度
        for (int i = 0; i < len; i++) {
            //j表示字符串起始位置
            for (int j = 0; j <= i; j++) {
                //i-j<=2表示i和j之间只有一个元素
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                    //更新子串长度
                    if (end - start < i - j ) {
                        start = j;
                        end = i;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}
