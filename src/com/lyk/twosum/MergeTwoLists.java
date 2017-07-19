package com.lyk.twosum;

public class MergeTwoLists {

	
	public static void main(String[] args){
		
	}
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        	 
		 ListNode l1Current = l1;
		 ListNode l2Current = l2;
		 ListNode headNode = new ListNode(0);
		 ListNode newCurrent = headNode;
		 while(true){
			 
			 if(l1Current==null){
				 newCurrent.next = l2Current;
				 break;
			 }else if(l2Current==null){
				 newCurrent.next = l1Current;
				 break;
			 }
			 
			 if(l1Current.val <= l2Current.val){
				 newCurrent.next = l1Current;
				 newCurrent = l1Current;
				 l1Current = l1Current.next;
			 }else {
				 newCurrent.next = l2Current;
				 newCurrent = l2Current;
				 l2Current = l2Current.next;
			 }		 
		 }
		 return headNode.next;
	 }
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
}
