package com.lxs.leetcode.algorithm051_100.algorithm078;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合中每个元素的选和不选，构成了一个满二叉状态树，
 * 比如，左子树是不选，右子树是选，从根节点、到叶子节点的所有路径，构成了所有子集。
 * 可以有前序、中序、后序的不同写法，结果的顺序不一样。本质上，其实是比较完整的中序遍历。。
 */
public class Subsets3 {
    public static List<List<Integer>> subsets3_1(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        preOrder(nums,0,new ArrayList<>(),result);
        return result;
    }
    public static void preOrder(int[] nums,int i,List<Integer> temp,List<List<Integer>> res){
        if (i>=nums.length){
            return;
        }
        temp=new ArrayList<>(temp);
        res.add(temp);
        preOrder(nums,i+1,temp,res);
        temp.add(nums[i]);
        preOrder(nums,i+1,temp,res);
    }
    public static void main(String[] args){
        int[] nums={1,2,3};
        System.out.println(subsets3_1(nums));

    }

}
