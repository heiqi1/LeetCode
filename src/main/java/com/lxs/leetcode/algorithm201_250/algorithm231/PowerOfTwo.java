package com.lxs.leetcode.algorithm201_250.algorithm231;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return ((n & (n-1))==0 && n>0);
    }
}
