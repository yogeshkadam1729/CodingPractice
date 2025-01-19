package com.practice.code;

import java.math.BigInteger;

public class ListAddNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = null;
        ListNode tail = null;
        int accumulator = 0;
        while(l1 != null || l2 != null) {
            int n1 = 0;
            int n2 = 0;
            if(l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }
            int sum = n1+n2+accumulator;
            accumulator = sum/10;
            sum = sum%10;
            if (node == null) {
                node = new ListNode(sum);
                tail = node;
            } else {
                ListNode newNode = new ListNode(sum);
                tail.next = newNode;
                tail = newNode;
            }

        }
        if(accumulator > 0){
            tail.next = new ListNode(accumulator);
        }
        return node;
    }
}
