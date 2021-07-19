package com.lxs.algorithm.leetcode.algorithm001_050.algorithm24;

import com.lxs.algorithm.leetcode.others.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dumpy=new ListNode(0);
        dumpy=head;
        int temp;
        while(head!=null&&head.next!=null){
            temp=head.val;
            head.val=head.next.val;
            head.next.val=temp;
            head=head.next.next;
        }
        return dumpy;
    }
}
