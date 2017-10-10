package com.lyk.twosum;

import java.util.TreeSet;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasCycle(ListNode head) {
		if(head == null) return false;
		ListNode nextNode = head.next;
		while(nextNode!=null) {
			if(nextNode==head) return true;
			nextNode = nextNode.next;
		}
		return false;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
