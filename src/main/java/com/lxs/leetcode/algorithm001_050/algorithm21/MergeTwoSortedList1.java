package com.lxs.leetcode.algorithm001_050.algorithm21;

import com.lxs.leetcode.others.ListNode;

public class MergeTwoSortedList1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode curr=l3;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }else {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if (l1==null){
            curr.next=l2;
        }else if (l2==null){
            curr.next=l1;
        }
        return l3.next;
    }
}