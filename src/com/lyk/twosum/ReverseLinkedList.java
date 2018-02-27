package com.lyk.twosum;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.omg.CORBA.portable.ValueBase;

public class ReverseLinkedList {

	
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.reverseList(node1);
		
	}
	
	
	 public ListNode reverseList(ListNode head) {
	    ListNode newhead =null;
	    ListNode oldhead;
	    if(head!=null){
	    	ListNode currentNode = head.next;
	    	oldhead = currentNode;
	    	newhead =head;
	    	while(currentNode !=null){
	    		oldhead = oldhead.next;
	    		currentNode.next = newhead;
	    		newhead = currentNode;
	    		currentNode = oldhead;
	    	}
	    }
	    return newhead;
	 }
	
	public static class ListNode {
		int val;
		ListNode next;
	    ListNode(int x) { val = x; }
	 }
}
