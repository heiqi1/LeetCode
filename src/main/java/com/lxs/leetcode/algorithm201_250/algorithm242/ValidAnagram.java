package com.lxs.leetcode.algorithm201_250.algorithm242;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] word1=s.toCharArray();
        char[] word2=t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return String.valueOf(word1).equals(String.valueOf(word2));
    }
}
