package com.practice.code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestCode {
    public static void main(String args[]) throws IOException {

        int[] arr = new int[]{3,2,0,-4};
        int pos = 1;
        ListNode head = createLinkedListWithCycle(arr,pos);
        ListCycleWithPosition listCycleWithPosition = new ListCycleWithPosition();
        listCycleWithPosition.detectCycle(head);
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
