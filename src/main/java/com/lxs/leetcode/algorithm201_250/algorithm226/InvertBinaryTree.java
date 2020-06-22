package com.lxs.leetcode.algorithm201_250.algorithm226;

import com.lxs.leetcode.others.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null)queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            TreeNode temp=cur.right;
            cur.right=cur.left;
            cur.left=temp;
            if(cur.left!=null)queue.offer(cur.left);
            if(cur.right!=null)queue.offer(cur.right);
        }
        return root;
    }
}
