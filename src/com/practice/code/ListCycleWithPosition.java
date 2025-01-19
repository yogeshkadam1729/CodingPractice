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
}
