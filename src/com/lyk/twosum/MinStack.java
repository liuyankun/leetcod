package com.lyk.twosum;

import java.awt.print.Printable;
import java.util.LinkedList;
import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack stack =  new MinStack();
		stack.push(2147483646);
		stack.push(2147483646);
		stack.push(2147483647);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		stack.push(2147483647);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
	}
	
	private int minimun = 2147483647;
	private Stack<Integer> stack ;

	public MinStack() {
		stack= new Stack<Integer>();
	}

	public void push(int x) {
		stack.push(x);
		if(x<minimun) minimun =x;
	}

	public void pop() {
		stack.pop();
		if(stack.isEmpty()) return;
		minimun = stack.peek();
		for(int i=0;i<stack.size();i++) {
			int current = stack.get(i);
			if(current<minimun) minimun =current;
		}
	}

	public int top() {
		return (int)stack.peek();
	}

	public int getMin() {
		return minimun;
	}

}
