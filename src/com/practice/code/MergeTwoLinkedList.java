package com.practice.code;

public class MergeTwoLinkedList {
    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;
        while(l1 != null && l2!= null)
        {
            if(l1.val < l2.val)
            {
                current_node.next = l1;
                l1 = l1.next;
            }
            else
            {
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }
        if(l1 != null)
        {
            current_node.next = l1;
            l1 = l1.next;
        }
        if(l2 != null)
        {
            current_node.next = l2;
            l2 = l2.next;
        }

        return temp_node.next;

    }

}

/*class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode next) { this.val = val; this.next = next; }
}*/

