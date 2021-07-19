package com.lxs.algorithm.leetcode.algorithm001_050.algorithm26;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){
        if (nums.length==0)
            return 0;
        int length=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1])
                nums[length++]=nums[i];
        }
        return length;
    }
}
