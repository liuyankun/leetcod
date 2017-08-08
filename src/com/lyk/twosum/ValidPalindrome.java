package com.lyk.twosum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {

	public static void main(String[] args) {
		isPalindrome("aaccccaa");
	}

	public static boolean isPalindrome(String s) {

		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
	}

}
