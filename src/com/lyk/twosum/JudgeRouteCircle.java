package com.lyk.twosum;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class JudgeRouteCircle {

	public static void main(String[] args) {
		JudgeRouteCircle jCircle = new JudgeRouteCircle();
		System.out.println(jCircle.judgeCircle("UDRLLRRDU"));
	}

	public boolean judgeCircle(String moves) {
		char[] chars = moves.toCharArray();
		int x = 0;
		int y = 0;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			switch (c) {
			case 'L':
				x++;
				break;
			case 'R':
				x--;
				break;
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			}
		}
		return (x==0&&y==0)? true: false;
	}
}
