package com.lxs.leetcode.algorithm051_100.algorithm078;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 循环枚举:逐个枚举，空集的幂集只有空集，每增加一个元素，让之前幂集中的每个集合，追加这个元素，就是新增的子集。
 */
public class Subsets2 {
    public static List<List<Integer>> subsets2_1(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for (Integer num:nums){
            int len=result.size();
            for (int i=0;i<len;i++){
                List<Integer> temp=new ArrayList<>(result.get(i));
                temp.add(num);
                result.add(temp);
            }
        }
        return result;
    }
    public static List<List<Integer>> subsets2_2(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        recursion(nums,0,result);
        return result;
    }
    public static void recursion(int[] nums,int i,List<List<Integer>> res){
        if (i>=nums.length){
            return;
        }
        int len=res.size();
        for (int j=0;j<len;j++){
            List<Integer> temp=new ArrayList<>(res.get(j));
            temp.add(nums[i]);
            res.add(temp);
        }
        recursion(nums,i+1,res);
    }
    public static void main(String[] args){
        int[] nums={1,2,3};
        System.out.println(subsets2_1(nums));
        System.out.println(subsets2_2(nums));
    }

}
