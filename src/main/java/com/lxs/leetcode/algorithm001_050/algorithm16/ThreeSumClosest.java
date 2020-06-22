package com.lxs.leetcode.algorithm001_050.algorithm16;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length<=2)return 0;
        Arrays.sort(nums);
        //记录下最靠近的值
        int min=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<nums.length-2;i++){
            //防止元素重复
            if (i>0&&nums[i]==nums[i-1])continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<target){
                    if(target-sum<min){
                        min=target-sum;
                        result=sum;
                    }
                    left++;
                }else if(sum>target){
                    if(sum-target<min){
                        min=sum-target;
                        result=sum;
                    }
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return result;
    }
}
