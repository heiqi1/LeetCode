package com.lxs.algorithm.leetcode.algorithm051_100.algorithm080;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0)
            return 0;
        int index=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[index-2]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
