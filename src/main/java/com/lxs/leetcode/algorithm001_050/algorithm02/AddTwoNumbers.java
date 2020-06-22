package com.lxs.leetcode.algorithm001_050.algorithm02;

import com.lxs.leetcode.others.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null)return l2;
        if (l2==null)return l1;
        ListNode dumpy=new ListNode(0);
        ListNode node=dumpy;
        int sum=0;
        while (l1 !=null || l2 != null){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            node.next=new ListNode(sum%10);
            node=node.next;
            sum/=10;
        }
        if(sum!=0) node.next=new ListNode(sum);
        return dumpy.next;
    }
}
