package com.lyk.twosum;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private Queue<Integer> queue;
	Integer tail = 0;
    public MyStack() {
        queue = new LinkedList<>(); 
    }
    
    public void push(int x) {
        queue.add(x);
        tail = x;
    }
    
    
    
    public int top() {
        return 0;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
