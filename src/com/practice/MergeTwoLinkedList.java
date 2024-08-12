package com.practice;

public class MergeTwoLinkedList {
    public ListNode solution(ListNode list1, ListNode list2) {
        list1 = new ListNode(2,null);
        list2 = new ListNode(1,null);
        if(list1 == null) return list2;
        ListNode head1 = list1;
        ListNode head2 = list2;
        while(head1 != null && head2 != null)
        {
            ListNode temp1 = head1.next;
            ListNode temp2 = head2.next;
            if(head1.val <= head2.val)
            {
                head1.next = head2;
                head2.next = temp1;
                head1 = (head1.val == head2.val) ? temp1 : head2;
            }
            else
            {
                head2.next = head1;
                head1 = head2;
                list1 = head1;
            }
            head2 = temp2;
        }

        return list1;
    }

}

/*class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode next) { this.val = val; this.next = next; }
}*/

