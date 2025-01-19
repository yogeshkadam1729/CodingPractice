package com.practice.code;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        ListNode rHead = null;
        while(head != null) {
            if(node == null){
                node = new ListNode(head.val);
                rHead = node;
            }
            else {
                node = new ListNode(head.val);
                node.next = rHead;
                rHead = node;
            }
            head = head.next;
        }

        return rHead;
    }
}
