package com.lxs.leetcode.algorithm001_050.algorithm01;

public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        return result;
    }
}
