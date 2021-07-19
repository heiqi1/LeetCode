package com.lxs.algorithm.leetcode.algorithm001_050.algorithm09;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        int a=x,r=0;
        while (a>0){
            r=r*10+a%10;
            a/=10;
        }
        return r==x;
    }
}
