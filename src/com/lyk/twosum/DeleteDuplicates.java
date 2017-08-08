package com.lyk.twosum;

public class DeleteDuplicates {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		if(head!=null) {
			ListNode next = head.next;
			while(next!=null) {
				if(current.val != next.val){
					current.next = next;
					current = next;
				}
				next = next.next;	
			}
		}
		current.next = null;
		return head;
	}

	public static void main(String[] args) {

	}

}
