package com.practice.code;

public class MergeTwoSortedList {

	public static void main(String[] args) {
	
		ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4, null)));
		ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4, null)));
		mergeTwoLists(list1,list2);
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = new ListNode();
		ListNode pointer = null;
		result.next = pointer;
		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				if(result == null) {
					result = new ListNode(); 
					result.val = list1.val;	
				}else {
					ListNode temp = new ListNode();
					temp.val = list1.val;
					result.next = temp;
					pointer = result.next;
				}	
				list1 = list1.next;
			
			} else {
				if(result == null) {
					result = new ListNode(); 
					result.val = list2.val;	
				}else {
					ListNode temp = new ListNode();
					temp.val = list2.val;
					result.next = temp;
				}	
				list2 = list2.next;
			}
		}
		while(list1.next != null){
			result.next = list1;
			list1 = list1.next;
		}
		while(list2.next != null){
			result.next = list2;
			list2 = list2.next;
		}
		return result;
        
    }

}



  
  
 
