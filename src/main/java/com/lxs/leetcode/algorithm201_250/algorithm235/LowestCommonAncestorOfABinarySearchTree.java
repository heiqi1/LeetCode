package com.lxs.leetcode.algorithm201_250.algorithm235;

import com.lxs.leetcode.others.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        while(true){
            if(root.val>p.val&&root.val>q.val){
                root=root.left;
            }else if(root.val<p.val&&root.val<q.val){
                root=root.right;
            }else{
                break;
            }
        }
        return root;
    }
}
