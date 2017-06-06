package a.level.Easy;

import java.util.Stack;

public class ReverseWordsInAString3 {

	public static void main(String[] args) {
		reverseWords("Let's take LeetCode contest");
	}

	public static String reverseWords(String s) {

		Stack<Character> st = new Stack<Character>();
		StringBuilder str = new StringBuilder();
		s=s+" ";
		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));
			if (s.charAt(i) == ' ') {
				while (!st.isEmpty()) {
					str.append(st.pop());
				}
			}
		}

		//System.out.println(str.toString().trim());
		return str.toString().trim();
	}
}
