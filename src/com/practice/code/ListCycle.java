package com.practice.code;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ListCycle {

    public boolean solution(ListNode head)
    {

        ListNode slowptr = head;
        ListNode fastptr = head;
        while(slowptr != null && fastptr != null && fastptr.next != null )
        {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr) return true;
        }
        return false;
    }

}

