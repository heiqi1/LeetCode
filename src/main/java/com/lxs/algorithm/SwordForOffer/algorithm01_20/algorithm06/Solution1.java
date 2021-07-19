package com.lxs.algorithm.SwordForOffer.algorithm01_20.algorithm06;

import com.lxs.algorithm.leetcode.others.ListNode;

import java.util.ArrayList;
import java.util.Stack;

//不修改链表，使用辅助栈
public class Solution1 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while (!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}
