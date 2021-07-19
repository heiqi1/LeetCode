package com.lxs.algorithm.leetcode.algorithm001_050.algorithm28;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(haystack==null)return -1;
        if(needle==null)return -1;
        if(haystack.length()<needle.length())return -1;
        int len=haystack.length()-needle.length();
        for(int i=0;i<=len;i++){
            int j;
            for(j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j==needle.length())return i;//找到匹配
        }
        return -1;
    }
}
