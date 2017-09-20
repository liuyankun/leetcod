package com.lyk.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyboardRow keyboardRow = new KeyboardRow();
		String[] words = {"","qwerc","xcvz","cwef"};
		System.out.println(keyboardRow.findWords(words));
	}

	public String[] findWords(String[] words) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('A', 2);
		map.put('S', 2);
		map.put('F', 2);
		map.put('G', 2);
		map.put('H', 2);
		map.put('J', 2);
		map.put('K', 2);
		map.put('L', 2);
		map.put('Q', 2);
		map.put('W', 1);
		map.put('E', 1);
		map.put('R', 1);
		map.put('T', 1);
		map.put('Y', 1);
		map.put('U', 1);
		map.put('I', 1);
		map.put('O', 1);
		map.put('P', 1);
		map.put('Z', 3);
		map.put('X', 3);
		map.put('C', 3);
		map.put('V', 3);
		map.put('B', 3);
		map.put('N', 3);
		map.put('M', 3);
		
		List<String> trueList = new ArrayList<>();
		for (String string : words) {
			char[] cars = string.toCharArray();
			int row = map.get(cars[0]);
			boolean re = true;
			for(char c:cars) {
				if(row != map.get(c)) {
					re = false;
					break;
				} 
			}
			if(re) trueList.add(string);
		}
		
		return (String[])trueList.toArray();
	}
}
