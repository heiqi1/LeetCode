package com.lxs.leetcode.algorithm001_050.algorithm05;

public class LongestPalindromicSubstring1 {
    String maxLen="";
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            longestPalindrome(s,i,0);
            longestPalindrome(s,i,1);
        }
        return maxLen;
    }
    public void longestPalindrome(String s,int index,int offset){
        int left=index;
        int right=index+offset;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        String cur=s.substring(left+1,right);
        maxLen=maxLen.length()>cur.length()?maxLen:cur;
    }
}
