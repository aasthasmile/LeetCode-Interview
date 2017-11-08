package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class firstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abcdcba";
		System.out.println("First Non Repeating charcater :" + firstNonRepeating(st));
	}

	private static String firstNonRepeating(String st) {
		Map<String, Integer> map = new HashMap<>();
		Queue<String> elements = new LinkedList<>();

		String firstchar = null;

		for (int i = 0; i < st.length(); i++) {
			elements.add(st.charAt(i) + "");
			if (!map.containsKey(st.charAt(i) + "")) {
				map.put(st.charAt(i) + "", 1);
			} else {
				map.put(st.charAt(i) + "", map.get(st.charAt(i) + "") + 1);
				if (elements.peek().equals((st.charAt(i) + ""))) {
					elements.remove();
					while (map.get(elements.peek()) > 1 && !elements.isEmpty()) {
							elements.remove();
					}
				}
			}
		}

		return elements.peek();
	}
}
