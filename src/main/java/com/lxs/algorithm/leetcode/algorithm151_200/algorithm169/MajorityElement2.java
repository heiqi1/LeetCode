package com.lxs.algorithm.leetcode.algorithm151_200.algorithm169;

public class MajorityElement2 {
    public int majorityElement(int[] nums) {
        int elem=0;
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (count==0){
                elem=nums[i];
                count=1;
            }else {
                if (elem==nums[i])
                    count++;
                else
                    count--;
            }
        }
        return elem;
    }
}
