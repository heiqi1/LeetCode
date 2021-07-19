package com.lxs.algorithm.leetcode.algorithm201_250.algorithm222;

import com.lxs.algorithm.leetcode.others.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return countNodes(root,-1,-1);
    }
    public int countNodes(TreeNode root,int left,int right){
         // 如果没有上轮计算好的左子树深度，计算其深度
        if(left==-1){
            TreeNode cur=root;
            left=0;
            while(cur!=null){
                left++;
                cur=cur.left;
            }
        }
        // 如果没有上轮计算好的右子树深度，计算其深度
        if(right==-1){
            TreeNode cur=root;
            right=0;
            while(cur!=null){
                right++;
                cur=cur.right;
            }
        }
        // 如果两个深度一样，返回2^h-1
        if(left==right) return (1<<left)-1;
         // 否则返回左子树右子树节点和加1
        return 1+countNodes(root.left,left-1,-1)+countNodes(root.right,-1,right-1);
    }
}
