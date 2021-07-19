package com.lxs.algorithm.leetcode.algorithm300_.algorithm342;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(num<=0)return false;
        while(num%4==0){
            num/=4;
        }
        return num==1;
    }
}
