package com.lyk.twosum;

import com.lyk.twosum.ReverseLinkedList.ListNode;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
		ListNode aNext = headA;
		ListNode aCurrent = headA;
		while(aCurrent !=null){	
        	aNext = aNext.next;
        	aCurrent.next = headB;
        	aCurrent = aNext;
        }
		
		ListNode bCurrent = headB;
		while(bCurrent != null){
			if(bCurrent.next==headB) return bCurrent;
			bCurrent = bCurrent.next;
		}		
		
		return null;
    }
}
