package com.practice.code;

public class LinkedListImpl {
    ListNode node;
    ListNode tail;

    public void add(int [] array) {
        for (int element : array) {
            if (node == null) {
                node = new ListNode(element);
                tail = node;
            } else {
                ListNode newNode = new ListNode(element);
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public void delete(int element) {
        ListNode first = node;
        ListNode current = node;
        ListNode previous = node;
        while(current != null) {
            if(element == current.val)
            {
                if(first == current) {
                    node = current.next;
                }
                else {
                    previous.next = current.next;
                }

            }
            else
            {
                previous = current;
            }
            current =  current.next;
        }
    }

    public static void main(String args[]) {
        LinkedListImpl impl = new LinkedListImpl();
        int [] array = new int [] {1,2,3,4};
        impl.add(array);
        impl.delete(1);
        System.out.println(impl.node);

    }
}
