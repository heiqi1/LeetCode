package com.lxs.leetcode.algorithm051_100.algorithm078;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 回溯法
 */
public class Subsets1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>  temp=new LinkedList<>();
        subsets(nums,0,temp,result);

        return result;
    }
    public void subsets(int[] nums,int index,List<Integer> temp,List<List<Integer>> result){
        result.add(new LinkedList<>(temp));
        for (int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            subsets(nums,i+1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}
