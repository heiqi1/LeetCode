package com.lxs.leetcode.algorithm151_200.algorithm169;

import java.util.Arrays;

public class MajorityElement1 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
