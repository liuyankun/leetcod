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
	
	private int minimun = Integer.MAX_VALUE;
	private Stack<Integer> stack ;

	public MinStack() {
		stack= new Stack<Integer>();
	}

	public void push(int x) {
		
		if(x<=minimun) {
			stack.push(minimun);
			minimun =x;
		}
		stack.push(x);
	}

	public void pop() {
		if(stack.peek()==minimun) {
			stack.pop();
			minimun = stack.pop();
		}else {
			stack.pop();
		}
		
	}

	public int top() {
		return (int)stack.peek();
	}

	public int getMin() {
		return minimun;
	}

}
