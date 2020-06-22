package com.lxs.leetcode.algorithm001_050.algorithm19;

import com.lxs.leetcode.others.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumpy=new ListNode(0);
        dumpy.next=head;
        ListNode node=dumpy;
        while(n-->0)head=head.next;
        while(head!=null){
            head=head.next;
            node=node.next;
        }
        node.next=node.next.next;
        return dumpy.next;
    }
}
