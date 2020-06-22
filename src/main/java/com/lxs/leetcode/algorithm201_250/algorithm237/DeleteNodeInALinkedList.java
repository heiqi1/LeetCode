package com.lxs.leetcode.algorithm201_250.algorithm237;

import com.lxs.leetcode.others.ListNode;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
