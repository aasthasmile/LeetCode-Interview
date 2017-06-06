import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author Aastha Jain
 *
 */
public class ValidParenthesis {

	public static void main(String[] args) {

		System.out.println(isValid("{}()[]"));
		
		System.out.println(isValid("]"));
	}

	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '}') {
				if (!st.empty() && st.peek() == '{')
					st.pop();
				else
					st.push(s.charAt(i));

			} else if (s.charAt(i) == ']') {
				if (!st.empty() && st.peek() == '[')
					st.pop();
				else
					st.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!st.empty() && st.peek() == '(')
					st.pop();
				else
					st.push(s.charAt(i));
			} else if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				st.push(s.charAt(i));
		}

		return (st.isEmpty());
	}

}
