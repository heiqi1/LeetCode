package com.lxs.leetcode.algorithm300_.algorithm377;

import java.util.Arrays;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] dp=new int[target+1];
        for(int i=1;i<dp.length;i++){
            for(int num:nums){
                if (num == i) dp[i]++;
                else if (num < i) dp[i] += dp[i-num];
                else break;
            }
        }
        return dp[target];
    }
}
