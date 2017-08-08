package com.lyk.twosum;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		System.out.println(validParentheses("{}{}[)"));
	}

	public static boolean validParentheses(String str){
		char[] chars = str.toCharArray();
		Map<Character,Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		
		Stack stack =new Stack();
		for(int i = 0; i<chars.length; i++){
			if(chars[i] == '{' ||chars[i] == '(' ||chars[i] == '[' ){
				stack.push(chars[i]);
			}else if(chars[i] == '}' ||chars[i] == ')' ||chars[i] == ']'){
				if(stack.empty()) {
					return false;
				}
				char preChar = (char)stack.pop();
				char rightChar = map.get(chars[i]);
				if(preChar != rightChar){
					return false;
				}
			}
		}
		
		return stack.empty();
	}
}
