package a.level.Easy;

import java.util.Stack;

public class reverseString2 {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println(reverseStr("abcdefgh", 2));
	}

	/**
	 * Reverse a String having 2k length with k blocks at a time.
	 * Example:"abcdefgh" with k=2 means "bacdfegh" (Reverse 2 characters at a
	 * time). In this we can either add i to i+k-1 characters to stack and pop
	 * them in String or we can In-place Swap i to i+k-1 characters depending
	 * k=odd or even.
	 */
	public static String reverseStr(String str, int k) {

		String[] s = str.split("");
		StringBuilder sb = new StringBuilder();
		int start = 0, end = 0;

		/*
		 * I am trying to reverse i to i+k-1 elements in string using Swap Inplace algorithm.
		 * Constant space complexity.
		 */
		for (int i = 0; i < s.length; i = i + 2 * k) {
			start = i;
			end = i + k - 1;
			while (start < end) {
				String temp = s[start];
				s[start] = s[end];
				s[end] = temp;
				start++;
				end--;
			}
		}
		return s.toString();

	}

}
