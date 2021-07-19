package com.lxs.algorithm.leetcode.algorithm300_.algorithm326;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}
