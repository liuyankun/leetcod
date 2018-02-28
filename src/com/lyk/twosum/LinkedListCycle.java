package com.lyk.twosum;

import java.util.TreeSet;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasCycle(ListNode head) {
		ListNode current = head;
		ListNode nextNode = head;
		while(current!=null) {
			if(current.next==head) return true;
			nextNode = nextNode.next;
			current.next = head;
			current = nextNode;
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
