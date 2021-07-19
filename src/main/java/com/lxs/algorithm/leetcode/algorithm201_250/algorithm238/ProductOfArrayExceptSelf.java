package com.lxs.leetcode.algorithm201_250.algorithm238;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int len=nums.length;
        int[] result=new int[len];
        int left=1;
        for(int i=0;i<len;i++){
            result[i]=left;
            left*=nums[i];
        }
        int right=1;
        for(int i=len-1;i>=0;i--){
            result[i]*=right;
            right*=nums[i];
        }
        return result;
    }
}
