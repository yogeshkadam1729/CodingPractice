package com.practice.code;

public class ListCycleWithPosition {
    public ListNode detectCycle(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        while(slowptr != null && fastptr != null  && fastptr.next != null )
        {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr) {
                while(head != slowptr) {
                    head = head.next;
                    slowptr = slowptr.next;
                }
                return slowptr;
            }
        }
        return null;
    }

    public static ListNode createLinkedListWithCycle(int[] values, int pos) {
        if (values == null || values.length == 0) {
            return null; // Return null for empty input
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleStart = null;

        for (int i = 1; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);
            current.next = newNode;
            current = newNode;

            // Save the reference to the node at index `pos`
            if (i == pos) {
                cycleStart = newNode;
            }
        }

        // Create the cycle if pos >= 0
        if (pos >= 0) {
            current.next = (pos == 0) ? head : cycleStart;
        }

        return head;
    }
}
